package ca.utoronto.utm.paint;

import javafx.scene.canvas.GraphicsContext;

public class Square extends Shapes {

	private Point leftCorner;
	private int width;
	private int height;
	private String style;
	private String color;
	private String thickness;
	private ColorFactory colorFactory = new ColorFactory();

	public Square(Point leftCorner, int width, int height) {
		this.leftCorner = leftCorner;
		this.width = width;
		this.height = height;

	}

	public Point getleftCorner() {
		return leftCorner;
	}
	
	/**
	 * 
	 * @param leftCorner
	 */
	public void setCentre(Point leftCorner) {
		this.leftCorner = leftCorner;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getStyle() {
		return style;
	}

	public void setRectangleColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setThickness(String thickness) {
		this.thickness = thickness;
	}

	public String getThickness() {
		return thickness;
	}
	
	/**
	 * @return "Square" as the mode selected
	 */
	public String getModels() {
		return "Square";
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
				if (height >= (-width)) {
					g.fillRect(x, (y - height), height, height);
				} else {
					g.fillRect(x, (y + width), (-width), (-width));
				}
			}
			// Released at second quadrant
			else if (width > 0 && height > 0) {
				if (height >= width) {
					g.fillRect((x - height), (y - height), height, height);
				} else {
					g.fillRect((x - width), (y - width), width, width);
				}
			}
			// Released at third quadrant
			else if (width > 0 && height < 0) {
				if ((-height) >= width) {
					g.fillRect((x + height), y, (-height), (-height));
				} else {
					g.fillRect((x - width), y, width, width);
				}

			}
			// Released at forth quadrant
			else {
				if ((-height) >= (-width)) {
					g.fillRect(x, y, (-height), (-height));
				} else {
					g.fillRect(x, y, (-width), (-width));
				}
			}

		} else {
			// Released at first quadrant
			if (width < 0 && height > 0) {
				if (height >= (-width)) {
					g.strokeRect(x, (y - height), height, height);
				} else {
					g.strokeRect(x, (y + width), (-width), (-width));
				}
			}
			// Released at second quadrant
			else if (width > 0 && height > 0) {
				if (height >= width) {
					g.strokeRect((x - height), (y - height), height, height);
				} else {
					g.strokeRect((x - width), (y - width), width, width);
				}
			}
			// Released at third quadrant
			else if (width > 0 && height < 0) {
				if ((-height) >= width) {
					g.strokeRect((x + height), y, (-height), (-height));
				} else {
					g.strokeRect((x - width), y, width, width);
				}

			}
			// Released at forth quadrant
			else {
				if ((-height) >= (-width)) {
					g.strokeRect(x, y, (-height), (-height));
				} else {
					g.strokeRect(x, y, (-width), (-width));
				}
			}

		}
	}
}