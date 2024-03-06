package sec3;

import java.util.Hashtable;
import java.util.Set;

public class HashTableExam {

	public static void main(String[] args) {
		Hashtable<String, Integer> hash = new Hashtable<>();
		hash.put("서울", 1);
		hash.put("부산", 2);
		hash.put("인천", 3);
		hash.put("대구", 4);
		hash.put("대전", 5);
		hash.put("광주", 6);
		
		//hash table의 요소의 수를 출력하라
		System.out.println("Hash 엔트리 수: "+hash.size());
		//hash table에 키가 "광주"인 요소가 존재하는지 비교
		if (hash.containsKey("광주")) {
			System.out.println("광주 있음");
		}
		else {
			System.out.println("광주 없음");
			
		}
		//hash table의 키만 set으로 조장한 후 출력
		Set<String> keySet = hash.keySet();
		System.out.println("hash의 키 : "+keySet);
		
		hash.remove("대구");
		
		for (String s :hash.keySet()) {
			System.out.println(s+" : " +hash.get(s));
			
		}
		
		hash.clear();
	}

}
