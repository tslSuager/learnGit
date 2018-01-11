package adsf;

import java.util.List;

public class Box {
	List<Object> contents;

	public Box(List<Object> contents) {
		this.contents = contents;
	}
	
	public void addNumber(Object... objects ) {
		for (int i = 0; i < objects.length; i++) {
			contents.add(objects[i]);
		}
	}
	public void removeNumber(Object... objects ) {
		for (int i = 0; i < objects.length; i++) {
			contents.remove(objects[i]);
		}
	}

}
