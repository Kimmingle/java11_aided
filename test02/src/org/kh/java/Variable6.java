package org.kh.java;

public class Variable6 {

	public static void main(String[] args) {
		float f1 = 3.14f;   //f안쓰면 오류남
		double f2 = 3.14;   //자료형은 더블인데 실수로 쓸 수 있음
		float kor = 90, eng = 80, mat = 90;    //정수로 쓰면 소수점 값이 안나옴 실수형으로 써야함 
		float avg = (kor + eng + mat) / 3;
		
		System.out.printf("\nf1= %.3f", f1);
		System.out.printf("\nf2= %.3f", f2);
		System.out.printf("\n평균= %.2f", avg);
		
	}

}
