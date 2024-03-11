package FactoryMethod;


// FactoryMethodPatten : 객체를 만드는 부분을 "서브 클래스"에 위임하는 패턴
//IDCard 클래스의 sub 클래스인 IDCardFactory를 활용하여 IDCard 객체를 생성한다. 
//부모클래스로 선언하고 생성은 서브 클래스의 생성자(IDCardFactory)로 생성함
//신분증(IDCard)을 만드는 공장(IDCardFactory)을 활용
//추상체로 Factory, Product 클래스

public class FactoryMethodPatten {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();  //자식 생성자함수
		Product card1 = factory.create("김민아");
		Product card2 = factory.create("김민희");
		
		card1.use();
		card2.use();
	}

}
