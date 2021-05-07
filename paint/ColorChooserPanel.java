package ca.utoronto.utm.paint;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.GridPane;

public class ColorChooserPanel extends GridPane implements EventHandler<ActionEvent> {

	private View view; // So we can talk to our parent or other components of the view

	/**
	 * Add the color buttons to the Panel.
	 * 
	 * @param view
	 */
	public ColorChooserPanel(View view) {

		this.view = view;

		String[] buttonLabels = { "White", "Yellow", "Red", "Green", "Blue", "Purple", "Orange", "Brown", "Black",
				"Grey", "LightGrey", "LightGreen", "Turquoise", "Indigo", "Violet", "Pink" };

		int row = 0;
		int row1 = 0;
		for (String label : buttonLabels) {
			SubButton button = new SubButton(label);
			button.setStyle("-fx-border-color: black; " + "-fx-background-color: " + label + ";");
			button.setMinWidth(50);
			button.setMinHeight(40);
			if (row < 8) {
				this.add(button, 0, row);
			} else {
				this.add(button, 1, row1);
				row1++;
			}
			row++;
			button.setOnAction(this);
		}
	}

	@Override
	public void handle(ActionEvent event) {
		String command = ((SubButton) event.getSource()).getString();
		this.view.getPaintPanel().setColor(command);
		System.out.println("Color changed to: " + command);
	}
}
