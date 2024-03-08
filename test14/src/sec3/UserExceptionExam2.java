package sec3;

class PwFormatException extends Exception{   		//���� ����Ŭ������ Exception ���� ��ӹ���
	public PwFormatException(String ms) {
		System.out.println("ms : "+ms);
		System.out.println("��ȣ ���� ����ġ");
		
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
			throw new PwFormatException("��ȣ ����");
		} else if (pw.length() >= 8 || pw.length() <20 )
			throw new PwFormatException("���ڼ��� 8~20�� �ƴ�");
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
