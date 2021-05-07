package ca.utoronto.utm.paint;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import java.io.InputStream;
import java.util.ArrayList;

public class ShapeChooserPanel extends GridPane implements EventHandler<ActionEvent> {

	private View view; // So we can talk to our parent or other components of the view
	private ShapeMasterFactory master = new ShapeMasterFactory();
	private ArrayList<SubButton> shapelist = new ArrayList<SubButton>();
	private ArrayList<SubButton> stylelist = new ArrayList<SubButton>();
	private ArrayList<SubButton> thicknesslist = new ArrayList<SubButton>();

	/**
	 * Set image for every button in buttonLabels and add the button to the Panel.
	 */
	public ShapeChooserPanel(View view) {

		this.view = view;

		String[] buttonLabels = { "Circle", "Oval", "Rectangle", "Square", "Polyline", "Squiggle", "Eraser", "Filled",
				"Outlined", "1", "4", "7", "10", "15" };

		for (int i = 0; i < buttonLabels.length; i++) {
			SubButton button = new SubButton(buttonLabels[i]);
			System.out.println(button.text);
			InputStream input = getClass().getResourceAsStream("/icons/" + buttonLabels[i] + ".png");
			Image image = new Image(input);
			button.setGraphic(new ImageView(image));
			this.add(button, 0, i);
			button.setOnAction(this);
			if (i < 7) {
				shapelist.add(button);
			} else if (i < 9) {
				stylelist.add(button);
			} else {
				thicknesslist.add(button);
			}
		}
	}

	@Override
	public void handle(ActionEvent event) {
		String command = ((SubButton) event.getSource()).getString();
		master.getShapeCharacteristics(command, view, shapelist, stylelist, thicknesslist);
	}
}
