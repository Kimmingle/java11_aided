package sec3;

public class peopleExample {

	public static void main(String[] args) {
		
		People p1 = new People();
		p1.selNum = 200;		//People.selNum = 200; 와 동일 , 클래스 변수 = 정적 필드 = 공유데이터
		p1.name = "김기태";		//인스턴스 변수 = 동적 필드
		p1.age = 43;
		p1.addr = "가산동";
		
		System.out.println(p1.selNum + "," +p1.name);
		
		
		People p2 = new People();
		p2.selNum = 300;
		p2.name = "김민아";
		p2.age = 24;
		p2.addr = "화곡동";
		
		System.out.println(p2.selNum + "," +p2.name);
		
		p1.print1();					//People.selNum = 200; 와 동일함 
		p2.print1();
		
		p1.print2();
		p2.print2();				
		//정적 메소드(static) : 객체의 생성없이 해당하는 클래스에서 바로 활용하는 메소드
		
		System.out.println("정적 메소드 ==  클레스 메소드");
		People.print2();
		People.selNum = 500;
		
		
		
	}

}
