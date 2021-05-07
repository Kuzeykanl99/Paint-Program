package ca.utoronto.utm.paint;

public class RectangleStrategy extends ShapeStrategy {

	Rectangle rectangle;
	PaintPanel panel;

	public void mousePressed(Point point, View view) {
		int width = 0;
		int height = 0;
		this.rectangle = new Rectangle(point, width, height);
		view.getPaintPanel().getModel().addShapes(this.rectangle);
	}

	public void mouseReleased(Point point, View view) {
		int realWidth = (int) this.rectangle.getleftCorner().getX() - (int) point.getX();
		int realHeight = (int) this.rectangle.getleftCorner().getY() - (int) point.getY();
		this.rectangle.setWidth(realWidth);
		this.rectangle.setHeight(realHeight);
		this.rectangle = null;
	}

	public void mouseDragged(Point point, View view) {
		int realWidth = (int) this.rectangle.getleftCorner().getX() - (int) point.getX();
		int realHeight = (int) this.rectangle.getleftCorner().getY() - (int) point.getY();
		this.rectangle.setWidth(realWidth);
		this.rectangle.setHeight(realHeight);
		this.rectangle.setRectangleColor(view.getPaintPanel().getColor());
		this.rectangle.setThickness(view.getPaintPanel().getThickness());
		this.rectangle.setStyle(view.getPaintPanel().getFillStyle());
		view.getPaintPanel().repaint();
	}
	
	public void mouseMoved(Point point, View view) {
		
	}
	
	public void mouseClicked(Point point, View view) {
		
	}
}
