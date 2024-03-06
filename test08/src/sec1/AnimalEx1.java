package sec1;

public class AnimalEx1 {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Mammal();
		Animal a3 = new Birds();
		
//		Mammal m1 = new Animal(); 자식 클래스로 부모 생성자 함수를 쓸 수 없다. 
		
		Mammal m2 = new Mammal();
//		Mammal m3 = new Birds();  자식 클래스도 다른 자식을 생성자 함수로 쓸 수 없다. 
		
		
		Animal a4;
		a4 = new Animal();   //Animal객체가 생성됨
		a4.setName("구렁이");
		a4.setSpine(true);
		System.out.println(a4.print());
		
		
		a4 = new Mammal();    //이렇게 Mammal객체로 형변환 하더라도 
		a4.setName("호랑이");
		System.out.println(a4.print());
//		a4.setLegs(0);
		
		a4 = new Birds();
		a4.setName("갈매기");
		System.out.println(a4.print());
		
		//메소드 오버라이딩 : 부모 클래스로부터 상속받은 메소드를 다르게 구현
		//그러므로 부모클래스로 선언된 객체는 부모 또는 자식 생성자를 활용하녀 다양하게 형 변환할 수 있음 => 다형성 이라고 함
		//클래스는 캡슐화, 정보 은닉성, 재사용성, 다형성, 추상화
	}

}
