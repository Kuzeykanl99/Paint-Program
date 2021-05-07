package ca.utoronto.utm.paint;

import javafx.scene.canvas.GraphicsContext;

public class Circle extends Shapes {

	private Point centre;
	private int radius;
	private String style;
	private String color;
	private String thickness;
	private ColorFactory colorFactory = new ColorFactory(); // To set the color and thickness

	/**
	 * Construct a Circle with the specified center and radius.
	 * 
	 * @param centre A Point with x and y coordinates
	 * @param radius A non negative integer
	 */
	public Circle(Point centre, int radius) {
		this.centre = centre;
		this.radius = radius;
	}

	/**
	 * @return the center of the Circle.
	 */
	public Point getCentre() {
		return centre;
	}

	/**
	 * Set a point to be the center of the Circle object.
	 * 
	 * @param centre (Type Point with x and y coordinates)
	 */
	public void setCentre(Point centre) {
		this.centre = centre;
	}

	/**
	 * @return the radius of the Circle object
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * Set a radius to the Circle object.
	 * 
	 * @param radius (an non negative integer)
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}

	/**
	 * Set the style of the Circle object.
	 * 
	 * @param style (a string telling the style)
	 */
	public void setStyle(String style) {
		this.style = style;
	}

	/**
	 * @return a String representing the style of the Circle object.
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * Set the color of the Circle object.
	 * 
	 * @param color a String representing the color
	 */
	public void setCircleColor(String color) {
		this.color = color;
	}

	/**
	 * @return a String representing the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Set the thickness to the Circle object.
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
	 * @return a String representing the currently selected mode, "Circle" in this
	 *         case.
	 */
	public String getModels() {
		return "Circle";
	}

	/**
	 * Paint the Circle object with its center and radius according to the style
	 * selected, "Filled" or "Outlined".
	 */
	public void paint(GraphicsContext g) {
		int x = this.getCentre().getX(); // Get the x coordinate of center of the circle.
		int y = this.getCentre().getY(); // Get the y coordinate of the center of the circle.
		int radius = this.getRadius(); // Get the radius of the circle.
		colorFactory.setColor(this, g); // Set the color and thickness selected to draw.
		if (this.getStyle() == "Filled") {
			g.fillOval((x - radius), (y - radius), radius * 2, radius * 2);
		} else {
			g.strokeOval((x - radius), (y - radius), radius * 2, radius * 2);
		}
	}
}
