package org.kh.java;

public class Variable2 {

	public static void main(String[] args) {
		byte b = 10;	//초기화: 젤 첨에 값을 저장함
		short s = 20;
		int i;  	// 이 변수는 선언만 함
		long l = 30L;    // L 안붙이면 int 로 저장되는듯?
		System.out.println("b=" + b);
		System.out.println("s=" + s);
//		System.out.println("i=" + i);    값이 없음 null 에러남
		System.out.println("l=" + l);
//		b = 130;			오버플로우 에러
//		b = -130;		 	언더플로우 에러
	}

}
