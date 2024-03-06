package sec1;

class Outer3{  //외부클래스
	//익명의 내부 클래스를 선언시에는 Runnable 로 수현해야한다. 
	Runnable getRunnable(int i) {   //Runnable은 인터페이스 이므로 인스턴스 생성 시 기본 메소드인 run()메소드
		int num = 100;  //i는 매개변수 num은 지역변수
		
		return new Runnable() {

			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);

			}
			
		};
	}
	
	//익명의 실행 인스턴스(객체)를 Runnable로 생성
	Runnable runner = new Runnable() {

		@Override
		public void run() {
			System.out.println("Runnable로 구현된 내부 클래스~!");  //Runnable 인터페이스는 구현 내용이 없으므로 클래스처럼 객체생성할 수 없음. 오버라이딩해서 구현 내용을 내가 넣을수는 있음
		}
		
	};
}


public class AnonymousInnerExam {

	public static void main(String[] args) {
		
		Outer3 out = new Outer3();
		out.getRunnable(500);		//이렇게하면 오류는 안나지만 Runnable이 만들어지지 않아서 실행이 안됨.
		out.runner.run();
		
		Runnable runAble = out.getRunnable(500);   //이렇게 Runnable 만들어줘야 제대로 실행됨
		runAble.run();			//외부 클래스의 내부 클래스 없이 생성된 인스턴스(runAble)는 Runable로 선언하여 생성된다. 
	}

}
