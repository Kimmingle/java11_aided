package org.kh.java;

public class Variable3 {
	public static void main(String[] args) {
		int bin = 0b10111; 		// 2진수 데이터 입력시 해당 데이터 앞 0b로 시작
		int oct = 03647;
		int dec = 3650;
		
		System.out.println("bin=" + bin);
		System.out.println("oct=" + oct);
		System.out.println("dec=" + dec);
		System.out.println("각 진수로 출력");
		System.out.println("dec를 2진수:"+ Integer.toBinaryString(dec));
		
		/*
		 %s : 문자열
		 %d : 10진 정수
		 %f : 실수
		 %x : 16진수
		 %o : 8진
		 %e : 지수 표현형식
		 %n : 줄바꿈
		 */
		 System.out.printf("dec를 8진수: %o", dec );   //printf는 기본 줄바꾸기 안됨 %n 넣어주어야함
		 System.out.printf("%ndec를 16진수: %x", dec );
		 System.out.printf("%ndec를 16진수: %x ,8진수: %o", dec, dec );  // format이 2개일때는 대입될 수 있는 변수도 두번 적어주기
		 
	}
}
