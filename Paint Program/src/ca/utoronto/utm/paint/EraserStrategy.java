package ca.utoronto.utm.paint;

public class EraserStrategy extends ShapeStrategy {

	Eraser eraser;
	PaintPanel panel;

	public void mousePressed(Point point, View view) {
		this.eraser = new Eraser();
		this.eraser.addPoints(point);
		view.getPaintPanel().getModel().addShapes(this.eraser);
	}

	public void mouseReleased(Point point, View view) {

	}

	public void mouseDragged(Point point, View view) {
		this.eraser.addPoints(point);
		view.getPaintPanel().repaint();
	}
	
	public void mouseMoved(Point point, View view) {
		
	}
	
	public void mouseClicked(Point point, View view) {
		
	}
}
