package ca.utoronto.utm.paint;

import javafx.scene.control.ToggleButton;

public class SubButton extends ToggleButton {

	String text = "Black";

	/**
	 * Construct a ToggleButton with String text
	 * 
	 * @param text (a String representing the text on the button)
	 */
	public SubButton(String text) {
		super();
		this.text = text;
	}

	/**
	 * Get the String text on the button
	 * 
	 * @return (a String representing the text on the button)
	 */
	public String getString() {
		return text;
	}
}