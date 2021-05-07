package ca.utoronto.utm.paint;

import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;

public class Squiggle extends Shapes {
	private ArrayList<Point> squiggles = new ArrayList<Point>();
	private ColorFactory colorFactory = new ColorFactory();

	/**
	 * @return "Squiggle" as the mode selected
	 */
	public String getModels() {
		return "Squiggle";
	}

	/**
	 * @return a String representing thickness
	 */
	public String getThickness() {
		return this.getPointList().get(0).getThickness();
	}

	/**
	 * @return a String representing the color
	 */
	public String getColor() {
		return this.getPointList().get(0).getColor();
	}

	/**
	 * Add new Point p to the sguiggles list
	 * 
	 * @param p (Type Point with x and y coordinates stored)
	 */
	public void addPoints(Point p) {
		this.squiggles.add(p);
	}

	/**
	 * @return a ArrayList squiggles storing all the points
	 */
	public ArrayList<Point> getPointList() {
		return squiggles;
	}

	/**
	 * Paint the Squiggle object according to the color and thickness selected.
	 */
	public void paint(GraphicsContext g) {
		for (int j = 0; j < this.getPointList().size() - 1; j++) {
			Point p1 = this.getPointList().get(j);
			Point p2 = this.getPointList().get(j + 1);
			colorFactory.setColor(this, g);
			g.strokeLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
			// Draw lines between every points in the list
		}
	}
}
