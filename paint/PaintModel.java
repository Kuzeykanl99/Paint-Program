package ca.utoronto.utm.paint;

import java.util.ArrayList;
import java.util.Observable;

public class PaintModel extends Observable {

	private ArrayList<Shapes> shapes = new ArrayList<Shapes>();
	private ArrayList<DrawingCommand> drawingCommand = new ArrayList<DrawingCommand>();

	public void addShapes(Shapes s) {
		this.shapes.add(s);
		this.setChanged();
		this.notifyObservers();
		this.drawingCommand.add(new DrawingCommand(s));
	}

	public ArrayList<Shapes> getShapes() {
		return shapes;
	}

	public ArrayList<DrawingCommand> getdrawingCommand() {
		return drawingCommand;
	}
}