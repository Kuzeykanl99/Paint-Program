package ca.utoronto.utm.paint;
import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

public class ColorFactory {
	
	/**
	 * Set the thickness and color of the Shape s.
	 * 
	 * @param s (a Shape object)
	 * @param g (a GraphicsContext object)
	 */
	public void setColor(Shapes s,GraphicsContext g) {
		if (s.getThickness() == "1") {
			g.setLineWidth(1.0);
		} else if (s.getThickness() == "4") {
			g.setLineWidth(4.0);
		} else if (s.getThickness() == "7") {
			g.setLineWidth(7.0);
		} else if (s.getThickness() == "10") {
			g.setLineWidth(10.0);
		} else if (s.getThickness() == "15") {
			g.setLineWidth(15.0);
		}
		String shapeColor = s.getColor();
		if (shapeColor == "White") {
			g.setStroke(Color.WHITE);
			g.setFill(Color.WHITE);
		} else if (shapeColor == "Yellow") {
			g.setStroke(Color.YELLOW);
			g.setFill(Color.YELLOW);
		} else if (shapeColor == "Red") {
			g.setStroke(Color.RED);
			g.setFill(Color.RED);
		} else if (shapeColor == "Green") {
			g.setStroke(Color.GREEN);
			g.setFill(Color.GREEN);
		} else if (shapeColor == "Blue") {
			g.setStroke(Color.BLUE);
			g.setFill(Color.BLUE);
		} else if (shapeColor == "Purple") {
			g.setStroke(Color.PURPLE);
			g.setFill(Color.PURPLE);
		} else if (shapeColor == "Orange") {
			g.setStroke(Color.ORANGE);
			g.setFill(Color.ORANGE);
		} else if (shapeColor == "Brown") {
			g.setStroke(Color.BROWN);
			g.setFill(Color.BROWN);
		} else if (shapeColor == "Black") {
			g.setStroke(Color.BLACK);
			g.setFill(Color.BLACK);
		} else if (shapeColor == "Grey") {
			g.setStroke(Color.GREY);
			g.setFill(Color.GREY);
		} else if (shapeColor == "LightGrey") {
			g.setStroke(Color.LIGHTGREY);
			g.setFill(Color.LIGHTGREY);
		} else if (shapeColor == "LightGreen") {
			g.setStroke(Color.LIGHTGREEN);
			g.setFill(Color.LIGHTGREEN);
		} else if (shapeColor == "Turquoise") {
			g.setStroke(Color.TURQUOISE);
			g.setFill(Color.TURQUOISE);
		} else if (shapeColor == "Indigo") {
			g.setStroke(Color.INDIGO);
			g.setFill(Color.INDIGO);
		} else if (shapeColor == "Violet") {
			g.setStroke(Color.VIOLET);
			g.setFill(Color.VIOLET);
		} else if (shapeColor == "Pink") {
			g.setStroke(Color.PINK);
			g.setFill(Color.PINK);
		}
	}

}
