package sec2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		List<Member> memList = new ArrayList<Member>();
		List<Member> memList2 = new ArrayList<Member>();		//빈 리스트
		
		for (int i=1; i<10; i++) {
			Member mem = new Member(i, "Kim"+i, "aaa"+i+i, "김"+i, "mail"+i, 0); //10명의 회원이 들어간것
			memList.add(mem);
		}
		Member mem2 = new Member(11, "kang", "kkk", "강", "kmail", 0); //10명의 회원이 들어간것
		memList.add(mem2);
		
		for(Member m:memList) {		
			//list의 순회1
			System.out.println(m.toString());
		}
		
		memList.remove(3);  //인덱스가 3인 멤버 인스턴스가 제거됨
		Member tmp1 = new Member(11, "kang", "kkk", "강", "kmail", 0);
		
		System.out.println(tmp1.getId() + "의 존재유무 : "+ memList.contains("kang"));
//		memList.add();
		
		for (int i=1; i<memList.size(); i++) {		//list의 순회2
			Member m = memList.get(i);
			System.out.println(m.toString());
		}
		
		if (memList2.isEmpty()) {
			System.out.println("비어있음");
			
		}
		else {
			System.out.println("내용 있음");
		}
		
		List<String> name = new ArrayList<>();
		name.add("민규2");
		name.add("민아");
		name.add("민규2");
		name.add("민아");
		name.add("민규2");
		name.add("민아");
		name.add("민규2");
		name.add("민아");
		
		if (name.contains("민규")){
			System.out.println("데이터 존재");
		}
		else {
			System.out.println("데이터 존재하지 않음");
			name.add("민규");
		}
		for (String s:name) {
			System.out.println(s);
		}
		name.clear();  	//리스트 비우기
		
		if(name.isEmpty()) {		//if name리스트가 비었다면 ~~
			System.out.println("리스트 비어있음");
		}
		else {
			for (String s:name) {
				System.out.println(s);
			}
			
		}
		
		//(name.찍으면 나오는 수많은 메소드중) 많이쓰는 메소드 
		//add, remove, contains, isEmpty, size, get
		
	}

}
