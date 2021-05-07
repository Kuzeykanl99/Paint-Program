package ca.utoronto.utm.paint;

import javafx.scene.canvas.GraphicsContext;

public class DrawingCommand implements Command {

	private Shapes shape;

	public DrawingCommand(Shapes shape) {
		this.shape = shape;
	}

	public Shapes getShape() {
		return shape;
	}

	public void execute(GraphicsContext g) {
		shape.paint(g);
	}

}
