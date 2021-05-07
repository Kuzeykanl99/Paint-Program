package ca.utoronto.utm.paint;

public class SquiggleStrategy extends ShapeStrategy {

	Squiggle squiggle;
	PaintPanel panel;

	/**
	 * When mouse is pressed, a new squiggle object is created and add this point to
	 * the squiggles list and add this new Shape object to the Shape List.
	 */
	public void mousePressed(Point point, View view) {
		this.squiggle = new Squiggle();
		this.squiggle.addPoints(point);
		view.getPaintPanel().getModel().addShapes(this.squiggle);
	}

	public void mouseReleased(Point point, View view) {
		// Implement the abstract class in ShapeStrategy.
	}

	/**
	 * When mouse is dragged, add every new points to the squiggles pointlist and
	 * paint out the list.
	 */
	public void mouseDragged(Point point, View view) {
		this.squiggle.addPoints(point);
		view.getPaintPanel().repaint();
	}

	public void mouseMoved(Point point, View view) {
		// Implement the abstract class in ShapeStrategy.
	}

	public void mouseClicked(Point point, View view) {
		// Implement the abstract class in ShapeStrategy.
	}
}