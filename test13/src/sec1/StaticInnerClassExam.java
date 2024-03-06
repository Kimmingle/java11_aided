package sec1;
//정적 내부클래스인 Inner 클래스는 외부든 내부든 정적만 허용한다. 
class Outer2{   //Outer로하면 에러남
	private int num = 10;
	private static int sNum = 20;
	
	
	
	
	static class Inner{			//정적 내부클래스
		int inNum = 1000;
		static int sInNum = 2000;
		
		void inMethod() {
			System.out.println("내부에서 내부 클래스의 인스턴스 변수 inNum = "+inNum);
			System.out.println("내부에서 내부 클래스의 정적 멤버 변수 : sInNum = "+sInNum);
//			System.out.println("내부에서 외부클래스의 인스턴스 변수 : num "+num);  <-공유하는 데이터가 아니기 때문에 못씀
			System.out.println("내부에서 외부 클래스의 정적 멤버 변수 : "+sNum);
		}
	}
	
	static void outMethod() { //외부 클래스의 정적 메소드
//		System.out.println("외부에서 내부 클래스의 인스턴스 변수 inNum = "+inNum);   //static변수가 아니라서 누군지 모름
		System.out.println("외부에서 내부 클래스의 정적 멤버 변수 : sInNum = "+Inner.sInNum);  //static변수는 객체없이 쓸 수 있음
//		System.out.println("외부에서 외부클래스의 인스턴스 변수 : num "+num);  //<-공유하는 데이터가 아니기 때문에 못씀
		System.out.println("외부에서 외부 클래스의 정적 멤버 변수 : "+sNum);
	}
}

public class StaticInnerClassExam {

	public static void main(String[] args) {
		Outer2 out = new Outer2(); 		//외부 클래스의 인스턴스
		
		out.outMethod();  //outmethod는 static이기 때문에 객체를 생성할 필요가 없어서 경고뜸
		Outer2.outMethod();
//		Outer2.Inner.InMethod(); InMethod는 인스턴스 메소드여서 객체를 생성해야 쓸 수 있다. 
//		out.Inner.InMethod();   Inner가 정적 클래스 이므로 out 인스턴스를 생성하지 않고 Outer
		
		Outer2.Inner inner = new Outer2.Inner();		//정적 내부 클래스의 인스턴스
		inner.inMethod();  //외부클래스에서는 외부 메소드는 모두 실행 가능하며, 내부 메소드 및 멤버변수의 접근이 실행 불가능
		//정적 내부 클래스로 생성된 인스턴스는 내부 메소드 및 멤버 변수의 접근 및 실행이 가능
		
		}

}
