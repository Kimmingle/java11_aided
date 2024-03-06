package org.kh.object1;

public class PersonEx1 {
	
	public static void main(String[] args) {			//main이 있는게 실행 클래스
		
		Person kim = new Person();
		
		kim.name = "김민아";
		kim.year = 1981;
		kim.gender = "남성";
		kim.job ="미치광이 개발자";
		kim.running(); 
		
		Person lee = new Person();				
		lee.name = "이완석";					//name 지정 안해주면 null 나옴
		lee.running();
	}
}
