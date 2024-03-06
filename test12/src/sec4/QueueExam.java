package sec4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {
//	Queue: 선입선출 (먼저 입력한 데이터가 먼저 나옴)
// 자바에서는 Queue가 인터페이스 이므로 같은 구조를 가진 linkedList를 이용하여 생성한다. 
	public static void main(String[] args) {
//		Queue<String> q = new Queue<>();  XX
		Queue<String> q = new LinkedList<>(); 
		
		q.offer("아이브"); 		//요소추가 offer쓴다
		q.offer("뉴진스");
		q.offer("케플러");
		q.offer("어쩌고");
		q.offer("저쩌고");
		q.offer("걸그룹1");
		q.offer("걸그룹2");
		
		System.out.println(q.peek()); 		//맨 처음 데이터 검색 반환
		System.out.println(q.peek());	
		System.out.println("피크 후 : "+q);
		System.out.println(q.poll());

		System.out.println("폴 후 : "+q);
		
		
	}

}
