package sec2;

public interface RemoteControl {

	
	int MAX = 10;
	int MIN = 0;
	
	
	//추상 메소드 public 
	void turnOff();
	public void turnOn();
	public void setVolum(int volum);
	
	//디폴트 메소드 default method
	//인터페이스에 메소드는 기본이 추상메소드이므오 선언만 해야하며 기본 접근 제어자는 public이다. 
	//그러나 구현 내용을 기술하고싶을 경우 기본 접근 제한다 default로 표기하면된다. 
	default void setMute(boolean mute) {
		if (mute) System.out.println("무음처리");
		else System.out.println("무음해제");
	}
	
	//구현 내용 기술이 필요할 경우 static으로 지시자를 선언하면 된다. 
	//객체 생성 없이 public접근 제한으로 메소드를 호출하여 실행할 수 있음
	static void changeBattery() {
		System.out.println("건전지");
	}

}
