package sec1;

public class DeskTop implements Computer{

	@Override
	public void display() {
		System.out.println("데스크탑 모니터의 기본 해상도 : 1920 x 1080");
	}

	@Override
	public void typing() {
		System.out.println("별도의 마련된 키보드를 타이핑 합니다. ");
	}

	@Override
	public void power(boolean sw) {
		if(sw) System.out.println("데스크탑의 전원을 켭니다.");
		else System.out.println("데스크탑의 전원을 끕니다. ");
		
	}
	public void power(String name, boolean sw) {		//이러면 power메소드 오버로딩!
		
	}
	
	
	
}
