package sec2;

import java.util.ArrayList;
import java.util.List;

public class CollectionExam1 {

	public static void main(String[] args) {
		//list 인터페이스 : arraylist, vector, linkedlist
		//set 인터페이스 : heshset, treeset
		//Map 인터페이스 : hashmap, hashtable, treemap, properties
		//stack, queue, deque 등 도 자료구조에 포함되는 컬렉션 프레임워트의일종이다.
		//자료구조인 컬렉션 프레임워크에서 자주 사용하는 메소드 - add(추가)
		// - add : 해당 컬렉션 프레임워크의 인스턴스 추가
		// - clear: 해당 컬렉션 프레임워트의 인스턴스 추가
		// - remove : 해당 컬렉션 프레임워크의 모든 인스턴스 제거
		// - size : 해당 컬렉션 프레임워크의 인스턴스 개수
		//iterator : 분리자를 의미
		
		List<String> list = new ArrayList<String>();   //생성할 때 인터페이스로 생성하면 arraylist, vector, linkedlist로도 쓸 수 있음
		list.add("김민아");
		list.add("강범준");
		list.add("ㅇㅇㅇ");
		list.add("sss");
		
		for(String s:list) {
			System.out.println(s);
		}
	}
	

}
