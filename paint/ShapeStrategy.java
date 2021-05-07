package ca.utoronto.utm.paint;

public abstract class ShapeStrategy {

	public abstract void mousePressed(Point point, View view);

	public abstract void mouseReleased(Point point, View view);

	public abstract void mouseDragged(Point point, View view);
	
	public abstract void mouseClicked(Point point, View view);
	
	public abstract void mouseMoved(Point point, View view);

}
