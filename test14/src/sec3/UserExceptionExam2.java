package sec3;

class PwFormatException extends Exception{   		//가장 상위클래스인 Exception 에서 상속받음
	public PwFormatException(String ms) {
		System.out.println("ms : "+ms);
		System.out.println("암호 형식 불일치");
		
	}
}

class Member {
	private String id;
	private String pw;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) throws PwFormatException {
		if (pw == null) {
			throw new PwFormatException("암호 없음");
		} else if (pw.length() >= 8 || pw.length() <20 )
			throw new PwFormatException("글자수가 8~20이 아님");
		this.pw = pw;
	}
	
	
	
}

public class UserExceptionExam2 {

	public static void main(String[] args) throws PwFormatException {
		Member mem1 = new Member();
		mem1.setId("admin");
		try {
			mem1.setPw("123");
		} catch(PwFormatException e ) {
			e.printStackTrace();
		}
		try {
			mem1.setPw(null);
		} catch(PwFormatException e ) {
			e.printStackTrace();
		}
		
		
	}

}
