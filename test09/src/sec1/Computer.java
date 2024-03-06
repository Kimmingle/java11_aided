package sec1;
// 추상메소드: 선언만하고 구현내용은 기술하지 않는다. 
public interface Computer {    //인터페이스: 모든 메소드는 추상 메소드이다. 
	
	// 구현 클래스에서 반드시 인터페이스에서 정의한 매개변수와 반환타입 대로 구현을 해야한다. 
	void display();
	void typing();
	void power(boolean sw);
	
	//void turnOff();
	
	
	
}
