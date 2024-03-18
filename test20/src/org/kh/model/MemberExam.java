package org.kh.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import section.Member;





public class MemberExam {
	
	List<Member> memList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Member app= new Member();
//		app.mainCall();  //mainCall호출
		
		MemberExam MM = new MemberExam();
		MM.mainCall();
		
	}
//	1. 회원가입 2. 회원 목록 3. 회원 삭제  4.프로그램 종료
	public void mainCall() {
		
		
		
		
		
		boolean i = false;
		
		while(true) {
			System.out.println("번호 입력 : ");
			int a = sc.nextInt();
			if(a==1) {
				add();
				System.out.println("회원가입 됨");
			}
			else if(a==2) {
				System.out.println("회원 목록임");
				list1();
			}
			else if(a==3) {
				remove();
				System.out.println("회원 삭제됨");
			}
			else if(a==4) {
				System.out.println("프로그램 종료");
			}	
		}
		
	}
	
	public void add() {
		//회원가입하는 함수
		System.out.println("구분코드 입력 : ");
		int mcode = sc.nextInt();
		
		System.out.println("아이디 입력 : ");
		String id = sc.next();
		
		System.out.println("비밀번호 입력 : ");
		String pw = sc.next();
		
		System.out.println("이름 입력 : ");
		String name = sc.next();
		
		System.out.println("출생년도 입력 : ");
		int year = sc.nextInt();
		
		System.out.println("연락처 입력 : ");
		String tel = sc.next();
		
		memList.add(new Member(mcode, id, pw, name,year,tel));
		
	}
	
	public void list1() {
		for(Member m : memList) {
			System.out.println(m.toString());
		}
	}
	
	public void remove() {
		
		System.out.println("삭제할 회원 구분코드 입력 : ");
		int rmcd = sc.nextInt();
		
//		if(memList.getMcode().equals(name)) {
//			memberiter.remove();
//			System.out.println(name + "회원이 삭제되었습니다.");
//			return;
//		}

		memList.removeIf((item) -> item.getMcode()==rmcd );
		list1();
	}

}

