package sec2;

import java.util.ArrayList;
import java.util.List;


class Fruit{
	String name;
	String color;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Fruit(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
}

public class Test5 {
	public static void main(String[] args) {
		
		List<Fruit> list = new ArrayList<>();
		
		Fruit f1 = new Fruit("사과", "빨강");
		Fruit f2 = new Fruit("메론", "초록");
		Fruit f3 = new Fruit("포도", "보라");
		
		list.add(f1);
		list.add(f2);
		list.add(f3);
//		list.add("바나나");  list의 제네릭 타입을 fruit로 되어 있으므로 fruit으로 객체를 생성하여 요소를 추가해야 하지만 코드에서 string으로 요소를 추가하였다. 
		
		for (int i=0; i<list.size(); i++) {  //arraylist 컬렉션 프레임 워크는 length속성이 없어 요소의 수를 구하려고한다면 size() 메소드를 사용해야 한다. 
			System.out.println(list.get(i).getName()); //인덱스는 배열객체에서만 활용해야하지만 list인곳에 배열요소를 참조연산인 []이 사용되었음
		}
	}

}
