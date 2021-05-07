package ca.utoronto.utm.paint;

import javafx.scene.canvas.GraphicsContext;

/**
 * This class allows to draw ovals.
 */
public class Oval extends Shapes {

	private Point centre;
	private int xradius;
	private int yradius;
	private String style;
	private String color;
	private String thickness;
	private ColorFactory colorFactory = new ColorFactory(); // To set the color and thickness

	/**
	 * Constructs an oval object with center, x-radius and y-radius.
	 * 
	 * @param centre  (Type Point with x-coordinate and y coordinate)
	 * @param xradius (a non negative integer)
	 * @param yradius (a non negative integer)
	 */
	public Oval(Point centre, int xradius, int yradius) {
		this.centre = centre;
		this.xradius = xradius;
		this.yradius = yradius;
	}

	/**
	 * This method get the center of the oval.
	 */
	public Point getCentre() {
		return centre;
	}

	/**
	 * Set the center of the oval
	 * 
	 * @param centre (Type Point with x and y coordinates)
	 */
	public void setCentre(Point centre) {
		this.centre = centre;
	}

	/**
	 * @return a non negative integer representing the X radius of the oval
	 */
	public int getXRadius() {
		return xradius;
	}

	/**
	 * @return a non negative integer representing the Y radius of the oval
	 */
	public int getYRadius() {
		return yradius;
	}

	/**
	 * Set the new x-radius for the oval.
	 * 
	 * @param xradius (a non negative integer)
	 */
	public void setXRadius(int xradius) {
		this.xradius = xradius;
	}

	/**
	 * Set the new x-radius for the oval.
	 * 
	 * @param yradius (a non negative integer)
	 */
	public void setYRadius(int yradius) {
		this.yradius = yradius;
	}

	/**
	 * Set the style of the oval.
	 * 
	 * @param style (a String representing the style)
	 */
	public void setStyle(String style) {
		this.style = style;
	}

	/**
	 * @return a String representing the style
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * This method set the color currently selected to draw the oval.
	 * 
	 * @param color (Type String)
	 */
	public void setOvalColor(String color) {
		this.color = color;
	}

	/**
	 * @return a String representing the color selected for this Oval object.
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Set the thickness to the Circle object.
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
	 * @return a String representing the currently selected mode, "Oval" in this
	 *         case.
	 */
	public String getModels() {
		return "Oval";
	}

	/**
	 * Paint the Oval object with its center, x-radius, y-radius according to the
	 * style selected, "Filled" or "Outlined".
	 */
	public void paint(GraphicsContext g) {

		int x = this.getCentre().getX(); // Get the x coordinate of center of the oval.
		int y = this.getCentre().getY(); // Get the y coordinate of the center of the oval.
		int xradius = this.getXRadius(); // Get the radius of the oval.
		int yradius = this.getYRadius(); // Set the color and thickness selected to draw.
		colorFactory.setColor(this, g);
		if (this.getStyle() == "Filled") {
			g.fillOval((x - xradius), (y - yradius), xradius * 2, yradius * 2);
		} else {
			g.strokeOval((x - xradius), (y - yradius), xradius * 2, yradius * 2);
		}
	}
}
