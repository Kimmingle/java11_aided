package sec2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		List<Student> sL = new LinkedList<>();
		
		Student s1 = new Student();
		s1.setNo(1);
		s1.setName("김민아");
		s1.setPoint(80);
		sL.add(s1);
		
		Student s2 = new Student(2, "강범준", 80);
		sL.add(s2);
		
		Student s3 = new Student(3, "최하늘", 30);
		sL.add(s3);
		
		
		
		System.out.println("번호\t 이름\t 점수");
		
		for (Student s :sL) {
			System.out.println(s.getNo()+ "\t" +s.getName()+ "\t" +s.getPoint());
		}
		
		//ArrayList와 Vector의 차이점 : 
		//ArrayList는 내용이 없는 인스턴스의 메모리가 그대로 차지되고 있고 (수업에서 엑셀로 설명)
		//vector는 내용이 없으면 메모리에서 자동으로 제거됨.
	}

}
