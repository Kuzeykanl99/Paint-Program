package ca.utoronto.utm.paint;

public class ThicknessFactory {

	/**
	 * Get the thickness selected
	 * 
	 * @param thickness (a String representing thickness)
	 * @return a String representing the thickness
	 */
	public String getThickness(String thickness) {
		if (thickness == "1") {
			return "1";
		} else if (thickness == "4") {
			return "4";
		} else if (thickness == "7") {
			return "7";
		} else if (thickness == "10") {
			return "10";
		} else if (thickness == "15") {
			return "15";
		} else {
			return null;
		}
	}

}
