package ca.utoronto.utm.paint;

public class OvalStrategy extends ShapeStrategy {

	Oval oval;
	PaintPanel panel;

	/**
	 * When mouse is pressed, create a new Oval object centered at the mouse with
	 * x-radius and y-radius 0 and add the object to the shape list.
	 */
	public void mousePressed(Point point, View view) {
		this.oval = new Oval(point, 0, 0);
		view.getPaintPanel().getModel().addShapes(this.oval);
	}

	/**
	 * When mouse is released, set the final radius to the Oval object.
	 */
	public void mouseReleased(Point point, View view) {
		if (this.oval != null) {
			int xradius = Math.abs((int) point.getX() - (int) this.oval.getCentre().getX());
			int yradius = Math.abs((int) point.getY() - (int) this.oval.getCentre().getY());
			this.oval.setXRadius(xradius);
			this.oval.setYRadius(yradius);
			this.oval = null;
		}
	}

	/**
	 * When mouse is dragged, set the new x and y radius to the Oval object and
	 * paint the oval with the correct thickness, style and color while dragging.
	 */
	public void mouseDragged(Point point, View view) {
		int xradius = Math.abs((int) point.getX() - (int) this.oval.getCentre().getX());
		int yradius = Math.abs((int) point.getY() - (int) this.oval.getCentre().getY());
		this.oval.setXRadius(xradius);
		this.oval.setYRadius(yradius);
		this.oval.setStyle(view.getPaintPanel().getFillStyle());
		this.oval.setThickness(view.getPaintPanel().getThickness());
		this.oval.setOvalColor(view.getPaintPanel().getColor());
		view.getPaintPanel().repaint();
	}

	public void mouseMoved(Point point, View view) {
		// Implement the abstract class in ShapeStrategy.
	}

	public void mouseClicked(Point point, View view) {
		// Implement the abstract class in ShapeStrategy.
	}
}
