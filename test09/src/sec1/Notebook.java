package sec1;

public class Notebook implements Computer {
	
	@Override
	public void display() {
		System.out.println("태블릿의 기본 해상도 : 1920 x 1080");
	}

	@Override
	public void typing() {
		System.out.println("태블릿은 문자표에서 해당 글자를 터치합니다. ");
	}

	@Override
	public void power(boolean sw) {
		if(sw) System.out.println("태블릿의 전원을 켭니다.");
		else System.out.println("태블릿의 전원을 끕니다. ");
		
	}
	public void power(String name, boolean sw) {		//이러면 power메소드 오버로딩!
		
	}
	
}
