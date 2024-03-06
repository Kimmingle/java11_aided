package sec1;

public class AbstractactEx {

	public static void main(String[] args) {
//		User u1 = new User(); //uer클래스는 추상 클래스 이므로 추상 메소드의 구현 내용이 기술되어있지 않아 생성할 수 업서
		
		//User u1;
		User u1 = new Member();
		u1.setIp("192.168.1.152");
		u1.setPort(80);
		u1.connect();
		
		Member u2;
		u2 = new Member();
		u2.setIp("192.168.0.121");
		u2.setPort(80);
		u2.setId("sss");
		u2.setPw("123");
		u2.connect();
		
		Staff u3;
		u3 = new Staff();
		u3.setIp("192.168.0.164");
		u3.setPort(80);
		u3.setLevel(2);
		u3.setName("김민아");
		u3.setPart("oo");
		u3.connect();
		
		
	}

}
