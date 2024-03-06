package org.kh.object1;

public class MemberEx {
	public static void main(String[] args) {
		
		Member mb1 = new Member();
		
//		mb1.id = "mina";  private으로 썼으니까 여기선 못씀. 만들어둔 set메소드 이용해서 밑에처럼출력해줄 것
//		mb1.pw = "012";
//		mb1.email = "t5328@naver.com";
//		mb1.birth = 20010612;
//		mb1.tel = 40165328;
		
		mb1.setId("mina");
		mb1.setpw("012");
		mb1.setemail("t5328@naver.com");
		mb1.setbirth(20010612);
		mb1.settel(40165328);
		
		System.out.println("id : "+mb1.getId());
		System.out.println("pw : "+mb1.getPw());
		System.out.println(mb1.toString());
		
	}
}
