package ca.utoronto.utm.paint;

import javafx.scene.canvas.GraphicsContext;

public abstract class Shapes {
	protected String models;

	public abstract String getModels();

	public abstract void paint(GraphicsContext g);
	public abstract String getThickness();
	public abstract String getColor();
}
