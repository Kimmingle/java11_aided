package org.kh.sec2;

import org.kh.sec.Book;

public class OverloadEx3 {

	public static void main(String[] args) {
		//Notice b1 = new Notice();
		
		Board b2 = new Board(1012,"책 이름","타이틀","김민아2"); 				//생성자 오버로드로 값을 넣어준것
		System.out.println(b2.toString());
		
		
	
		
		Notice n1 = new Notice(1012,"정보처리기사2","타이틀","김민아2","ee","ee");
		System.out.println(n1.toString());
		
		News e1 = new News();
		System.out.println(e1.toString());
		

	}

}
