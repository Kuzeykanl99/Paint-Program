package ca.utoronto.utm.paint;

import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
/**
 * This class allows us to remove the part that we don't needed after painting.
 */


public class Eraser extends Shapes {
	private ArrayList<Point> erasers = new ArrayList<Point>();
	private ColorFactory colorFactory = new ColorFactory();
	/**
	 * Constructs an eraser.
	 * 
	 */

	public String getModels() {
		return "Eraser";
	}
	
	public String getThickness() {
		return this.getPointList().get(0).getThickness();
	}

	/**
	 * This method set the color of eraser, basically white.
	 * 
	 * @param color (Type String)
	 */
	
	public String getColor() {
		return this.getPointList().get(0).getColor();
	}

	public void addPoints(Point p) {
		this.erasers.add(p);
	}

	public ArrayList<Point> getPointList() {
		return erasers;
	}

	public void paint(GraphicsContext g) {
		for (int j = 0; j < this.getPointList().size() - 1; j++) {
			Point p1 = this.getPointList().get(j);
			Point p2 = this.getPointList().get(j + 1);
			colorFactory.setColor(this, g);
			g.setStroke(Color.WHITE);
			g.strokeLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
		}

	}
}
