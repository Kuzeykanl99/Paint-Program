package ca.utoronto.utm.paint;

import java.util.ArrayList;

public class ShapeMasterFactory {

	private ShapeFactory shapeFactory = new ShapeFactory();
	private StyleFactory styleFactory = new StyleFactory();
	private ThicknessFactory thicknessFactory = new ThicknessFactory();

	/**
	 * Highlight the button selected in every category (Shape, Thickness, Color)
	 * Only one button will be selected in a category.
	 * 
	 * @param command       (the button selected)
	 * @param view
	 * @param shapelist     (ArrayList containing shapes)
	 * @param stylelist     (ArrayList containing styles)
	 * @param thicknesslist (ArrayList containing thicknesses)
	 */
	public void getShapeCharacteristics(String command, View view, ArrayList<SubButton> shapelist,
			ArrayList<SubButton> stylelist, ArrayList<SubButton> thicknesslist) {
		if (command == "Filled" || command == "Outlined") {
			view.getPaintPanel().setFillStyle(styleFactory.getStyle(command));
			System.out.println("Style: " + command);
			if (command == "Filled") {
				for (SubButton style : stylelist) {
					if (style.text != "Filled") {
						style.setSelected(false);
					}
				}
			} else {
				for (SubButton style : stylelist) {
					if (style.text != "Outlined") {
						style.setSelected(false);
					}
				}
			}
		} else if (command == "1" || command == "4" || command == "7" || command == "10" || command == "15") {

			view.getPaintPanel().setThickness(thicknessFactory.getThickness(command));
			System.out.println("Thickness: " + command);
			if (command == "1") {
				for (SubButton style : thicknesslist) {
					if (style.text != "1") {
						style.setSelected(false);
					}
				}
			} else if (command == "4") {
				for (SubButton style : thicknesslist) {
					if (style.text != "4") {
						style.setSelected(false);
					}
				}
			} else if (command == "7") {
				for (SubButton style : thicknesslist) {
					if (style.text != "7") {
						style.setSelected(false);
					}
				}

			} else if (command == "10") {
				for (SubButton style : thicknesslist) {
					if (style.text != "10") {
						style.setSelected(false);
					}
				}
			} else {
				for (SubButton style : thicknesslist) {
					if (style.text != "15") {
						style.setSelected(false);
					}
				}
			}
		} else {
			view.getPaintPanel().setShapeStrategy(shapeFactory.getShape(command));
			System.out.println(command);
			if (command == "Circle") {
				for (SubButton style : shapelist) {
					if (style.text != "Circle") {
						style.setSelected(false);
					}
				}
			} else if (command == "Oval") {
				for (SubButton style : shapelist) {
					if (style.text != "Oval") {
						style.setSelected(false);
					}
				}
			} else if (command == "Rectangle") {
				for (SubButton style : shapelist) {
					if (style.text != "Rectangle") {
						style.setSelected(false);
					}
				}

			} else if (command == "Square") {
				for (SubButton style : shapelist) {
					if (style.text != "Square") {
						style.setSelected(false);
					}
				}
			} else if (command == "Polyline") {
				for (SubButton style : shapelist) {
					if (style.text != "Polyline") {
						style.setSelected(false);
					}
				}
			} else if (command == "Squiggle") {
				for (SubButton style : shapelist) {
					if (style.text != "Squiggle") {
						style.setSelected(false);
					}
				}
			} else {
				for (SubButton style : shapelist) {
					if (style.text != "Eraser") {
						style.setSelected(false);
					}
					for (SubButton style1 : stylelist) {
						style1.setSelected(false);
					}
				}
			}
		}
	}

}
