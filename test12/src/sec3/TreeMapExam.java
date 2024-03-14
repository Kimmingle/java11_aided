package sec3;

import java.util.Map;
import java.util.TreeMap;

import sec2.Notice;

public class TreeMapExam {

	public static void main(String[] args) {
		
		//선언방법
		Map map0 = new TreeMap<>();
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();
		TreeMap <Integer, String> map2 = new TreeMap<>();
		TreeMap <Integer, String> map3 = new TreeMap<>(map1);
		TreeMap <Integer, String> map4 = new TreeMap<>() {{
			put(1, "김민아");
		}};
		
		map2.put(1, "김민아");			//요소(entry)를 추가한 것.
		map2.put(2, "김미나");
		map2.put(3, "조대신");
		map2.put(4, "조우진");
		map2.put(5, "이희훈");
		
		//특정요소 제거
		map2.remove(4);
		//TreeMap비우기
//		map2.clear();
		//TreeMap순회하기
		for (Integer i:map2.keySet()) {
			System.out.println(i +" : "+map2.get(i));
		}
			
		System.out.println("map2: "+map2);
		System.out.println("map2에서 키가 5인 요소: "+map2.get(5));
		System.out.println("map2에서 가장 첫 엔트리: "+map2.firstKey());
		System.out.println("map2에서 마지막 엔트리: "+map2.lastEntry());
		System.out.println("map2에서 가장 첫 엔트리: "+map2.lastKey());
	}

}
