package org.kh.object1;

public class Member {
	
	
	//어느 패키지에서나 클래스에서 접근 가능:public
	//같은 패티지 내에서 동일, 상속, 연관 protected   					//중요하니 외우기
	//같은 패키지 내에 동일만 default
	//현재 클래스에서만 private
	
	
	private String id;
	private String pw;
	private String email;
	private int birth;
	private int tel;
	
	//get
	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getEmail() {
		return email;
	}

	public int getBirth() {
		return birth;
	}

	public int getTel() {
		return tel;
	}

	
	//set
	//private걸린것을 쓸 수 있게 풀어주는 메소드 무조건 public으로 만들어주기
	public void setId(String id) {				
		this.id = id;
	}
	
	public void setpw(String pw) {				
		this.pw = pw;
	}
	
	public void setemail(String email) {				
		this.email = email;
	}
	
	public void setbirth(int birth) {				
		this.birth = birth;
	}
	
	public void settel(int tel) {				
		this.tel = tel;
	}
	
	@Override //조상 클레스
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", email=" + email + ", birth=" + birth + ", tel=" + tel + "]";
		
	}
}
