package ca.utoronto.utm.paint;

import javafx.scene.canvas.GraphicsContext;

public class Rectangle extends Shapes {

	private Point leftCorner;
	private int width;
	private int height;
	private String style;
	private String color;
	private String thickness;
	private ColorFactory colorFactory = new ColorFactory();

	/**
	 * Construct a new Rectangle object with leftcorner, width and height.
	 * 
	 * @param leftCorner (a Point with x and y coordinates)
	 * @param width      (a non negative integer)
	 * @param height     (a non negative integer)
	 */
	public Rectangle(Point leftCorner, int width, int height) {
		this.leftCorner = leftCorner;
		this.width = width;
		this.height = height;

	}

	/**
	 *
	 * @return the leftcorner of the Rectangle
	 */
	public Point getleftCorner() {
		return leftCorner;
	}

	/**
	 * Set the center of the Rectangle
	 * 
	 * @param leftCorner (a Point with x and y coordinate)
	 */
	public void setCentre(Point leftCorner) {
		this.leftCorner = leftCorner;
	}

	/**
	 * @return a non negative integer representing width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Set the width of the rectangle
	 * 
	 * @param width (a non negative integer)
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return a non negative integer representing height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Set the height of the rectangle
	 * 
	 * @param height (a non negative integer)
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * Set the style of the Rectangle object.
	 * 
	 * @param style (a string telling the style)
	 */
	public void setStyle(String style) {
		this.style = style;
	}

	/**
	 * @return a String representing the style of the Rectangle object.
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * Set the color of the Rectangle object.
	 * 
	 * @param color a String representing the color
	 */
	public void setRectangleColor(String color) {
		this.color = color;
	}

	/**
	 * @return a String representing the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Set the thickness to the Rectangle object.
	 * 
	 * @param thickness (a String representing thickness)
	 */
	public void setThickness(String thickness) {
		this.thickness = thickness;
	}

	/**
	 * @return a String representing thickness
	 */
	public String getThickness() {
		return thickness;
	}

	/**
	 * @return a String representing the selected mode, "rectangle" in this case.
	 */
	public String getModels() {
		return "rectangle";
	}

	public void paint(GraphicsContext g) {
		int x = this.getleftCorner().getX();
		int y = this.getleftCorner().getY();
		int width = this.getWidth();
		int height = this.getHeight();
		colorFactory.setColor(this, g);
		if (this.getStyle() == "Filled") {
			// Released at first quadrant
			if (width < 0 && height > 0) {
				g.fillRect(x, (y - height), (-width), height);
			}
			// Released at second quadrant
			else if (width > 0 && height > 0) {
				g.fillRect((x - width), (y - height), width, height);
			}
			// Released at third quadrant
			else if (width > 0 && height < 0) {
				g.fillRect((x - width), y, width, (-height));
			}
			// Released at forth quadrant
			else {
				g.fillRect(x, y, (-width), (-height));
			}

		} else {
			// Released at first quadrant
			if (width < 0 && height > 0) {
				g.strokeRect(x, (y - height), (-width), height);
			}
			// Released at second quadrant
			else if (width > 0 && height > 0) {
				g.strokeRect((x - width), (y - height), width, height);
			}
			// Released at third quadrant
			else if (width > 0 && height < 0) {
				g.strokeRect((x - width), y, width, (-height));
			}
			// Released at forth quadrant
			else {
				g.strokeRect(x, y, (-width), (-height));
			}

		}
	}
}
