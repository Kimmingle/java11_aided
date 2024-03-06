package sec4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetExam {

	public static void main(String[] args) {
		//Set: 값만 저장, 중복 허용하지 않음. 순서유지하지 않음
		//많이쓰는 Set: HashSet, TreeSet
		
		
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new TreeSet<Integer>();
		
		set1.add("김민아");  	//요소의 추가
		set1.add("김민희");
		set1.add("김민기");
		set1.add("김희아");
		set1.add("이연정");
		set1.add("김가희");
		set1.add("재민기");
		set1.add("김진현");
		set1.add("최은미");
		set1.add("이민규");
		set1.add("김진현");  //중복의 발생
		
		System.out.println("요소의 수 : "+ set1.size());
		System.out.println(set1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String name = sc.next();
		
		if(set1.contains(name)) {
			System.out.println("해당 이름이 존재");
		}
		else {
			set1.add(name);
			System.out.println("\n"+name+"이 입력됨");
		}
		
		
		set1.remove("이민규");   //삭제
		set1.clear();  //비우기
		
		
		if(set2.isEmpty()) {
			System.out.println("set2 의 요소 비어있음");
		}
		else {
			System.out.println("set2요소의 수 : "+set2.size());
		}
		
		
		
		Set<Integer> set3 = new TreeSet<Integer>(Arrays.asList(9,2,3,6,2,5,1));
		System.out.println(set3);
		
		//set의 순회1 -> 향상된 for문
		
		System.out.println("----향상된 for문 순회");
		for (Integer s :set3) {
			System.out.print(s +"\t");
		}
		
		//set의 순회2 ->  Iterator에 의한 순회
		System.out.println("\n----Iterator 순회");
		Iterator it = set3.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+"\t");
		}
	}

}
