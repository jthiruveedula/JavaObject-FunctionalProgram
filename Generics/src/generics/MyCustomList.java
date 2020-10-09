package generics;

import java.util.ArrayList;

public class MyCustomList<T> {
	ArrayList<T> list = new ArrayList<>();

	public void addEle(T element) {
		list.add(element);
	}

	public void removeEle(T element) {
		list.remove(element);
	}

	@Override
	public String toString() {
		return list.toString();
	}
}
