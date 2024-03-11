package structural.adapter;
//110 볼트로 출력하는 메소드
public class Socket {
	public Volt getVolt() {
		return new Volt(110);
	}
}
