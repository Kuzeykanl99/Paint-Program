package ca.utoronto.utm.paint;

import javafx.scene.canvas.GraphicsContext;

public interface Command {
	
	public abstract void execute(GraphicsContext g);
	}
	

