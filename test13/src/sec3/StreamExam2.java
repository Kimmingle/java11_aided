package sec3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExam2 {
//리스트는 데이터 연속되게 저장되지 않음 -> array 못쓰고 stream
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("sss");
		list.add("qqq");
		list.add("aaa");
		list.add("zzz");
		list.add("ccc");
		list.add("vvv");
		list.add("bbb");
		list.add("nnn");
		
		Stream <String> stream = list.stream();  //stream화 (= 직열화)
		stream.forEach(s -> System.out.println(s));
		System.out.println("정렬 후");
		list.stream().sorted().forEach(s-> System.out.println(s));
	
		//요소의 수 계산
		
		int cnt = (int) list.stream().count();
		System.out.println("인원 수  "+cnt);
		
		
	}

}
