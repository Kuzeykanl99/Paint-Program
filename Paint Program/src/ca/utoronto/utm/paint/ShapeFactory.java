package ca.utoronto.utm.paint;

public class ShapeFactory {
	private CircleStrategy circleStrategy = new CircleStrategy();
	private RectangleStrategy rectangleStrategy = new RectangleStrategy();
	private OvalStrategy ovalStrategy = new OvalStrategy();
	private SquiggleStrategy squiggleStrategy = new SquiggleStrategy();
	private PolylineStrategy polylineStrategy = new PolylineStrategy();
	private EraserStrategy eraserStrategy = new EraserStrategy();
	private SquareStrategy squareStrategy = new SquareStrategy();

	/**
	 * Get the shape.
	 * 
	 * @param shape (a String)
	 * @return a String representing the shape selected
	 */
	public ShapeStrategy getShape(String shape) {
		if (shape == "Circle") {
			return circleStrategy;
		} else if (shape == "Rectangle") {
			return rectangleStrategy;
		} else if (shape == "Oval") {
			return ovalStrategy;
		} else if (shape == "Squiggle") {
			return squiggleStrategy;
		} else if (shape == "Polyline") {
			return polylineStrategy;
		} else if (shape == "Eraser") {
			return eraserStrategy;
		} else if (shape == "Square") {
			return squareStrategy;
		} else {
			return null;
		}
	}
}
