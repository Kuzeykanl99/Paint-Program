package ca.utoronto.utm.paint;

import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

class PaintPanel extends StackPane implements Observer, EventHandler<MouseEvent> {

	private PaintModel model; // slight departure from MVC, because of the way painting works
	private View view; // So we can talk to our parent or other components of the view
	private ShapeStrategy shapeStrategy = new CircleStrategy();

	private String style;
	private String color;
	private String thickness;

	private Canvas canvas;

	/**
	 * Construct a Paint panel with default settings.
	 * 
	 * @param model (type PaintModel)
	 * @param view  (type view)
	 */
	public PaintPanel(PaintModel model, View view) {

		this.canvas = new Canvas(800, 800);
		this.getChildren().add(this.canvas);
		// The canvas is transparent, so the background color of the
		// containing pane serves as the background color of the canvas.
		this.setStyle("-fx-background-color: white");
		this.addEventHandler(MouseEvent.ANY, this);

		this.color = "Black";
		this.thickness = "1";
		this.model = model;
		this.model.addObserver(this);
		this.view = view;
	}

	/**
	 * Paint out every Shape in drawingcommand list.
	 */
	public void repaint() {
		GraphicsContext g = this.canvas.getGraphicsContext2D();
		// Clear the canvas
		g.clearRect(0, 0, this.getWidth(), this.getHeight());

		ArrayList<DrawingCommand> drawingcommand = this.model.getdrawingCommand();
		for (DrawingCommand d : drawingcommand) {
			d.getShape().paint(g);
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		// Not exactly how MVC works, but similar.
		this.repaint();
	}

	/**
	 * Controller aspect of this
	 */

	public void setFillStyle(String style) {
		this.style = style;
	}

	public String getFillStyle() {
		return style;
	}

	public PaintModel getModel() {
		return model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public String getThickness() {
		return thickness;
	}

	public void setThickness(String thickness) {
		this.thickness = thickness;
	}

	public void setShapeStrategy(ShapeStrategy shapeStrategy) {
		this.shapeStrategy = shapeStrategy;
	}

	@Override
	/**
	 * Get the mouse event type done by the user.
	 */
	public void handle(MouseEvent event) {

		if (event.getEventType() == MouseEvent.MOUSE_DRAGGED) {
			mouseDragged((MouseEvent) event);
		} else if (event.getEventType() == MouseEvent.MOUSE_PRESSED) {
			mousePressed((MouseEvent) event);
		} else if (event.getEventType() == MouseEvent.MOUSE_MOVED) {
			mouseMoved((MouseEvent) event);
		} else if (event.getEventType() == MouseEvent.MOUSE_CLICKED) {
			mouseClicked((MouseEvent) event);
		} else if (event.getEventType() == MouseEvent.MOUSE_RELEASED) {
			mouseReleased((MouseEvent) event);
		} else if (event.getEventType() == MouseEvent.MOUSE_ENTERED) {
			mouseEntered((MouseEvent) event);
		} else if (event.getEventType() == MouseEvent.MOUSE_EXITED) {
			mouseExited((MouseEvent) event);
		}
	}

	/**
	 * When mouse is moved, Point point stores the x and y coordinates, color and
	 * thickness of the mouse moved location.
	 * 
	 * @param e (a mouse event)
	 */
	private void mouseMoved(MouseEvent e) {
		Point point = new Point((int) e.getX(), (int) e.getY(), color, thickness);
		this.shapeStrategy.mouseMoved(point, this.view);
	}

	/**
	 * When mouse is dragged, Point point stores the x and y coordinates, color and
	 * thickness of the mouse dragged location.
	 * 
	 * @param e (a mouse event)
	 */
	private void mouseDragged(MouseEvent e) {
		Point point = new Point((int) e.getX(), (int) e.getY(), color, thickness);
		this.shapeStrategy.mouseDragged(point, this.view);
	}

	/**
	 * When mouse is clicked, Point point stores the x and y coordinates, color and
	 * thickness of the mouse clicked location.
	 * 
	 * @param e (a mouse event)
	 */
	private void mouseClicked(MouseEvent e) {
		Point point = new Point((int) e.getX(), (int) e.getY(), color, thickness);
		this.shapeStrategy.mouseClicked(point, this.view);
	}

	/**
	 * When mouse is pressed, Point point stores the x and y coordinates, color and
	 * thickness of the mouse pressed location.
	 * 
	 * @param e (a mouse event)
	 */
	private void mousePressed(MouseEvent e) {
		Point point = new Point((int) e.getX(), (int) e.getY(), color, thickness);
		this.shapeStrategy.mousePressed(point, this.view);
	}

	/**
	 * When mouse is released, Point point stores the x and y coordinates, color and
	 * thickness of the mouse released location.
	 * 
	 * @param e (a mouse event)
	 */
	private void mouseReleased(MouseEvent e) {
		Point point = new Point((int) e.getX(), (int) e.getY(), color, thickness);
		this.shapeStrategy.mouseReleased(point, this.view);
	}

	private void mouseEntered(MouseEvent e) {

	}

	private void mouseExited(MouseEvent e) {

	}
}