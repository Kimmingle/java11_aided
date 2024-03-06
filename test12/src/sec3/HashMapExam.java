package sec3;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {

	public static void main(String[] args) {
		//선언방법
		Map<String, String> map0 = new HashMap<String, String>();  //map으로 선언하면 나중에 형변환 할 수 있음
		HashMap<String, String> map1 = new HashMap<String, String>();  //해쉬맵 생성 및 표준식
		HashMap<String, String> map2 = new HashMap<>();  //생성자에 앞서 선언한 인자의 생략이 가능
		HashMap<String, String> map3 = new HashMap<>(map1);  //맵의 복제
//		배열 개수 지정-> String[] arr = new String[10]  맵의 초기 용량은 기본적으로 16개
		HashMap<String, String> map4 = new HashMap<>(10);  //초기 용량 지정 = 초기 용량 지정보다 더 많은 
		HashMap<String, String> map5 = new HashMap<>(10, 0.7f);  //10은 초기용량, 0.7f는 70프로(사용 확률 지정?)
		HashMap<String, String> map6 = new HashMap<>() {{
			put("name", "김민아");
		}};
	}

}
