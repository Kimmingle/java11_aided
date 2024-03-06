package org.kh.object2;

import org.kh.object1.Member;

public class MemberEx2 {
	public static void main(String[] args) {
		
		Member mb1 = new Member(); 			//mb1 객체 생성
		
		
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
