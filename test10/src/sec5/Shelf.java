package sec5;

import java.util.ArrayList;	//일반 클래스

public class Shelf {
	
	protected ArrayList<String> shelf;				//문자열 List
	
	public Shelf() {
		shelf = new ArrayList<String>();
	}

	public ArrayList<String> getShelf() {
		return shelf;
	}
	public int getCount() {
		return shelf.size();
	}

}
