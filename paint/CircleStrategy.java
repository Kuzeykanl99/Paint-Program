package ca.utoronto.utm.paint;

public class CircleStrategy extends ShapeStrategy {

	Circle circle;
	PaintPanel panel;

	/**
	 * When mouse is pressed, create a new Circle object centered at the mouse with
	 * radius 0 and add the object to the shape list.
	 */
	public void mousePressed(Point point, View view) {
		this.circle = new Circle(point, 0);
		view.getPaintPanel().getModel().addShapes(this.circle);
	}

	/**
	 * When mouse is released, set the final radius to the Circle object.
	 */
	public void mouseReleased(Point point, View view) {
		if (this.circle != null) {
			int diff_x = Math.abs((int) this.circle.getCentre().getX() - (int) point.getX());
			// Get the x distance from center to mouse release point
			int diff_y = Math.abs((int) this.circle.getCentre().getY() - (int) point.getY());
			// Get the y distance from center to mouse release point
			double square_xy = diff_x * diff_x + diff_y * diff_y; // Pythagorean Theorem
			int radius = (int) Math.sqrt(square_xy); // Pythagorean Theorem
			this.circle.setRadius(radius);
			this.circle = null;
		}
	}

	/**
	 * When mouse is dragged, set the new radius to the Circle object and paint the
	 * circle with the correct thickness, style and color while dragging.
	 */
	public void mouseDragged(Point point, View view) {
		int diff_x = Math.abs((int) this.circle.getCentre().getX() - (int) point.getX());
		// Get the x distance from center to mouse release point
		int diff_y = Math.abs((int) this.circle.getCentre().getY() - (int) point.getY());
		// Get the y distance from center to mouse release point
		double square_xy = diff_x * diff_x + diff_y * diff_y; // Pythagorean Theorem
		int radius = (int) Math.sqrt(square_xy); // Pythagorean Theorem
		this.circle.setCircleColor(view.getPaintPanel().getColor());
		this.circle.setRadius(radius);
		this.circle.setThickness(view.getPaintPanel().getThickness());
		this.circle.setStyle(view.getPaintPanel().getFillStyle());
		view.getPaintPanel().repaint(); // Paint the Circle while dragging
	}
	
	public void mouseMoved(Point point, View view) {
		// Implement the abstract class in ShapeStrategy.
	}

	public void mouseClicked(Point point, View view) {
		// Implement the abstract class in ShapeStrategy.
	}
}
