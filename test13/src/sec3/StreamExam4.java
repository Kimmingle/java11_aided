package sec3;

import java.util.ArrayList;
import java.util.List;

class Visitor{
	private String name;
	private int age;
	private int price;
	
	public Visitor() {}
	
	public Visitor(String name, int age, int price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Visitor [name=" + name + ", age=" + age + ", price=" + price + "]";
	}
	
	
}


public class StreamExam4 {
	public static void main(String[] args) {
		List <Visitor> vList = new ArrayList<>();
		Visitor v1 = new Visitor("김민아", 22, 1000);
		Visitor v2 = new Visitor("김민희", 23, 1003);
		Visitor v3 = new Visitor("김민기", 24, 1004);
		Visitor v4 = new Visitor("김민규", 25, 1005);
		Visitor v5 = new Visitor("김민준", 26, 1006);
		Visitor v6 = new Visitor("김민현", 27, 1007);
		
		vList.add(v1);
		vList.add(v2);
		vList.add(v3);
		vList.add(v4);
		vList.add(v5);
		vList.add(v6);
		
		//Stream<visitor> vStream = vList.Stream();
		System.out.println("객체순회");
		vList.stream().forEach( vis-> System.out.println(vis.toString() ));
		System.out.println("이름만 추출");
		vList.stream().map( vis-> vis.getName()).forEach(s -> System.out.println(s));
		System.out.println("나이가 30 이상인 사람");
		vList.stream().filter( vis-> vis.getAge() >= 30).map(c ->c.getName()).sorted().forEach(s -> System.out.println(s));
	}

}
