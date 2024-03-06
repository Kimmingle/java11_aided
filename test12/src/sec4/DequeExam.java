package sec4;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExam {
//  Deque:선입선출과 후입선출이 다 가능한 구조 (=스택과 큐의 혼합 구조)
	public static void main(String[] args) {
		Deque<String> d = new LinkedList<>();
		
		//추가
		d.addFirst("자바");
		d.addFirst("파이썬");
		d.addLast("자바스크립트");
		d.addFirst("리액트");
		d.addLast("노드");
		d.addLast("스타일시트");
		
		System.out.println(d);
		System.out.println(d.peek());
		System.out.println(d.peekLast());
		System.out.println(d.peekFirst());
		
		System.out.println(d.poll());
		System.out.println(d.pollLast());
		System.out.println(d.pollFirst());
		System.out.println(d);
		
		System.out.println(d.pop());
	}

}
