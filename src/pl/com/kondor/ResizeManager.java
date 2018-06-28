package pl.com.kondor;

import java.util.ArrayList;
import java.util.List;

public class ResizeManager {
	Interface i;
	ImageManager img;

	enum ResizeOptions {
		Percentage("Procentowy"), MaxWidth("Maksymalna Szerokoœæ"), LongestSide("Najd³u¿szy Bok"), Fix("Sta³y Wymiar");

		private String name;

		private ResizeOptions(String name) {
			this.name = name;
		}
	}

	public String[] nameList() {
		List<String> names = new ArrayList<String>();
		for (ResizeOptions option : ResizeOptions.values()) {
			names.add(option.name);
		}
		String[] nameList = new String[names.size()];
		names.toArray(nameList);
		return nameList;
	}

	public void Resize(Interface i, ResizeOptions resizeOption) {
		this.i = i;
		if (resizeOption.equals(ResizeOptions.Percentage)) {
			//RESIZE PERCENTAGE
		} else if (resizeOption.equals(ResizeOptions.MaxWidth)) {
			//RESIZE MAXWIDTH
		}
	}

	public float scaleFactorCalculate(ResizeOptions resizeOption) {
		float scaleFactor = 1.0f;
		if (resizeOption.equals(ResizeOptions.Percentage)) {
			scaleFactor = i.getParam1();
		} else if (resizeOption.equals(ResizeOptions.MaxWidth)) {
			scaleFactor = i.getParam1() / img.getWidth();
		} else if (resizeOption.equals(ResizeOptions.LongestSide)) {
			if (img.getWidth() >= img.getHeight()) {
				scaleFactor = i.getParam1() / img.getWidth();
			} else {
				scaleFactor = i.getParam1() / img.getHeight();
			}
		}  else {
			scaleFactor = 1.0f;
		}
		return scaleFactor;
	}
}