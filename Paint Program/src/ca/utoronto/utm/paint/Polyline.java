package ca.utoronto.utm.paint;

import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;

public class Polyline extends Shapes {
	private ArrayList<Point> polylines = new ArrayList<Point>(); // A arraylist storing Points
	private ColorFactory colorFactory = new ColorFactory();
	private Point start;
	private Point end;

	/**
	 * @return "Polyline" as the mode selected
	 */
	public String getModels() {
		return "Polyline";
	}

	/**
	 * Set the Point start as the start point.
	 * 
	 * @param start (a Point object)
	 */
	public void setPointStart(Point start) {
		this.start = start;
	}

	/**
	 * Set the Point end as the end point.
	 * 
	 * @param end (a Point object)
	 */
	public void setPointEnd(Point end) {
		this.end = end;
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
	 * Add new Point p to the polylines list
	 * 
	 * @param p (Type Point with x and y coordinates stored)
	 */
	public void addPoints(Point p) {
		this.polylines.add(p);
	}

	/**
	 * @return a ArrayList polylines storing all the points
	 */
	public ArrayList<Point> getPointList() {
		return polylines;
	}

	/**
	 * Paint the Polyline object according to the color and thickness selected.
	 */
	public void paint(GraphicsContext g) {
		colorFactory.setColor(this, g);
		g.strokeLine(start.getX(), start.getY(), end.getX(), end.getY());
		// Lines the start and end point. end point represents the mouse current place
		for (int j = 0; j < this.getPointList().size() - 1; j++) {
			Point p1 = this.getPointList().get(j);
			Point p2 = this.getPointList().get(j + 1);
			g.strokeLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
			// Lines every point in the polylines List
		}
	}
}
