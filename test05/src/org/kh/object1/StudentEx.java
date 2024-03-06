package org.kh.object1;

public class StudentEx {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		
		student1.name = "김민아";
		student1.kor = 60;
		student1.mat = 80;
		student1.eng = 65;
		
		student1.avg();
		student1.tot();		
		student1.resulting();
	}

}
