package ca.utoronto.utm.paint;
public class SquareStrategy extends ShapeStrategy {

	Square square;
	PaintPanel panel;

	public void mousePressed(Point point, View view) {
		int width = 0;
		int height = 0;
		this.square = new Square(point, width, height);
		view.getPaintPanel().getModel().addShapes(this.square);
	}

	public void mouseReleased(Point point, View view) {
		int realWidth = (int) this.square.getleftCorner().getX() - (int) point.getX();
		int realHeight = (int) this.square.getleftCorner().getY() - (int) point.getY();
		this.square.setWidth(realWidth);
		this.square.setHeight(realHeight);
		this.square = null;
	}

	public void mouseDragged(Point point, View view) {
		int realWidth = (int) this.square.getleftCorner().getX() - (int) point.getX();
		int realHeight = (int) this.square.getleftCorner().getY() - (int) point.getY();
		this.square.setWidth(realWidth);
		this.square.setHeight(realHeight);
		this.square.setRectangleColor(view.getPaintPanel().getColor());
		this.square.setThickness(view.getPaintPanel().getThickness());
		this.square.setStyle(view.getPaintPanel().getFillStyle());
		view.getPaintPanel().repaint();
	}
	
	public void mouseMoved(Point point, View view) {
		
	}
	
	public void mouseClicked(Point point, View view) {
		
	}
}
