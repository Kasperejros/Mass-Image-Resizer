package pl.com.kondor;

import java.util.ArrayList;
import java.util.List;

public class ResizeManager {
	enum ResizeOptions {
		Percentage("Procentowy"),
		MaxWidth("Maksymalna Szeroko��"),
		LongestSide("Najd�u�szy Bok"),
		Fix("Sta�y Wymiar");
		
		private String name;
		
		private ResizeOptions(String name){
			this.name = name;
		}
	}
	
	public String[] nameList() {
		List<String> names = new ArrayList<String>();
		for(ResizeOptions option : ResizeOptions.values()) {
			names.add(option.name);
		}
		String[] nameList = new String[names.size()];
		names.toArray(nameList);
		return nameList;
	}
}