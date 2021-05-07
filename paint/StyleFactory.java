package ca.utoronto.utm.paint;

public class StyleFactory {

	/**
	 * Get the style.
	 * 
	 * @param style (a String)
	 * @return a String representing the style selected
	 */
	public String getStyle(String style) {
		if (style == "Filled") {
			return "Filled";
		} else if (style == "Outlined") {
			return "Outlined";
		} else {
			return null;
		}
	}

}
