package ca.utoronto.utm.paint;

import javafx.scene.canvas.GraphicsContext;

public class Point extends Shapes {
	int x, y;
	String color;
	String thickness;
	
	/**
	 * Create a new Point object
	 * @param x (an integer representing x coordinate)
	 * @param y (an integer representing y coordinate)
	 * @param color (a String representing color)
	 * @param thickness (a String representing thickness)
	 */
	public Point(int x, int y, String color, String thickness) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.thickness = thickness;
	}
	
	/**
	 * 
	 * @return an integer representing x coordinate
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Set the x coordinate of the point
	 * @param x (an integer)
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * @return an integer representing y coordinate
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Set the y coordinate of the point
	 * @param y (an integer)
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * @return a String representing the color
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * @return a String representing the thickness
	 */
	public String getThickness() {
		return thickness;
	}
	
	/**
	 * @return a String representing the mode "Points"
	 */
	public String getModels() {
		return "Points";
	}

	public void paint(GraphicsContext g) {
	}

}
