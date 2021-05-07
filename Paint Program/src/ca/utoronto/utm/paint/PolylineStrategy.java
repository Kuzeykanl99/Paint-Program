package ca.utoronto.utm.paint;

public class PolylineStrategy extends ShapeStrategy {

	private Polyline polyline = new Polyline();
	private Point stopPoint;

	public void mousePressed(Point point, View view) {
		// Implement the abstract class in ShapeStrategy.
	}

	public void mouseReleased(Point point, View view) {
		// Implement the abstract class in ShapeStrategy.
	}

	/**
	 * Close the current polylines ArrayList, and create a new one.
	 */
	public void mouseDragged(Point point, View view) {
		this.polyline.setPointEnd(this.stopPoint);
		this.polyline = new Polyline();
		view.getPaintPanel().repaint();
	}

	/**
	 * When mouse is moved, set the end point to be the current mouse place and
	 * paint out.
	 */
	public void mouseMoved(Point point, View view) {
		this.polyline.setPointEnd(point);
		view.getPaintPanel().repaint();
	}

	/**
	 * When mouse is clicked, set the start and end point to be the current mouse
	 * click place and add this point to the polylines list and add this shape into
	 * the shapelist. Paint out the list of points.
	 */
	public void mouseClicked(Point point, View view) {
		this.stopPoint = point;
		this.polyline.setPointStart(point);
		this.polyline.setPointEnd(point);
		this.polyline.addPoints(point);
		view.getPaintPanel().getModel().addShapes(this.polyline);
	}
}
