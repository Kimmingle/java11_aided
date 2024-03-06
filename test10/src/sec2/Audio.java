package sec2;

public class Audio implements RemoteControl{

	//private int volume;

	@Override
	public void turnOff() {
		System.out.println("전원 OFF");
	}

	@Override
	public void turnOn() {
		System.out.println("전원 ON");
	}

	@Override
	public void setVolum(int volume) {
		if (volume > MAX) {
			volume =  RemoteControl.MAX;
		}
		else if (volume<MIN ) {
			volume =  RemoteControl.MIN;
		}
		else {
			volume = volume;
		}
		System.out.println("현재 볼륨 : "+volume);
		
	}
	
	
}
