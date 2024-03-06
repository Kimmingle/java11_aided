package sec3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class MapExam {
		//map은 인덱스가 없다. 
	public static void main(String[] args) {
		Map<String, Integer> mp1 = new HashMap<>();
		Map<String, String> mp2 = new Hashtable<>();
		Map<Integer, String> mp3 = new TreeMap<>();
		Properties mp4 = new Properties();		//이건 속성을 저장할 때 편함 String밖에 지정 안됨
		
		mp1.put("Kim", 90);
		mp1.put("Lee", 80);
		mp1.put("Kang", 100);
		mp1.put("park", 80);
		
		System.out.println(mp1);
		System.out.println("park : " + mp1.get("park")); //개별 요소 접근 시 인덱스가 아니라 키
		
		//맵 순회 : Iterator에 대한 접근
		// keys = {kim, lee, park, kang, kwon}
		System.out.println("Iterator에 의한 순회");
		Iterator<String> keys = mp1.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(key+"="+mp1.get(key));		
		}//이게 가장 전통적인 방법인가봄
		
		System.out.println("----------");
		//맵 순회2 (entrySet키와 값이 하나의 쌍임)
		System.out.println("entry에 의한 순회");
		for(Map.Entry<String, Integer> en : mp1.entrySet()) {
			String key = en.getKey();
			Integer value = en.getValue();
			System.out.println(key + " : " +value);
			}
		
		System.out.println("----------");
		//맵 순회3 (keySet에 대한 접근)
		System.out.println("keySet에 의한 순회");
		for(String key : mp1.keySet()) {
			System.out.println(key + " : " +mp1.get(key));
			}
		
		
		if (mp1.containsKey("kang")) {
			System.out.println("kang : "+mp1.get("kang"));
		}
		else {
			System.out.println("키가 kang인 요소는 존재하지 않습니다. ");
		}
		if (mp1.containsValue(100)) {
			System.out.println("만점자 존재");
		}
		else {
			System.out.println("만점자 없음");
		}
		
		mp2.put("김", "1코스");
		mp2.put("이", "2코스");
		mp2.put("박", "1코스");
		mp2.put("최", "3코스");
		mp2.put("박", "1코스");
		
		System.out.println(mp2);
		
		mp2.remove("김");
		System.out.println("----편집 후-------");
		System.out.println(mp2);
		
		mp2.clear();
		System.out.println("----편집 후-------");
		System.out.println(mp2);
		
		//mp3 트리맵에 배열 대입해보기
		String[] names = {"사람1", "사람2", "사람3", "사람4", "사람5", "사람6","사람7", "사람8", "사람9", "사람10"};  
		for (int i =0; i<=9; i++) {
			mp3.put(i, names[i]);
		}
		System.out.println("인원 수 : "+mp3.size());
		for(Integer i: mp3.keySet()) {
			int key = i;
			String value = mp3.get(i);
			System.out.println(key + " : " +value);
		}
		
		//Property는 키와 값을 모두 문자열로 취급한다. 
		mp4.setProperty("name","김민아");		//put을 써도되지만 set을 쓴다
		mp4.setProperty("age", "34");
		mp4.setProperty("hiegh", "160");
		mp4.setProperty("eng", "90");
		mp4.setProperty("kor", "40");
		mp4.setProperty("mat", "50");
		System.out.println("이름: " +mp4.getProperty("name"));

		
		
	}
	

}
