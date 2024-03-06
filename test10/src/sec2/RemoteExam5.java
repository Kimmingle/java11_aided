
package sec2;

public class RemoteExam5 {
	
	public static void main(String[] args) {
		RemoteControl r;
		
		r = new RemoteControl() {
			int volume;
			public void turnOff() {System.out.println("전원 OFF");}
			public void turnOn() {System.out.println("전원 ON");}
			public void setVolum(int volume) {
				if (volume > MAX) {this.volume =  RemoteControl.MAX;}
				else if (volume<MIN ) {this.volume =  RemoteControl.MIN;}
				else {this.volume = volume;}
				
			}
		};
		
	}

	
}
