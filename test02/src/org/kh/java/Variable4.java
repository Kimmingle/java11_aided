package org.kh.java;

public class Variable4 {

	public static void main(String[] args) {
		String name = "김민아"; //기본 자료형이 아님
		short age = 44;
		float height= 173.6f;
		double weigt = 71.9;
		char init = 'k';
		
		System.out.printf("%n이름 : \"%s\"",name);
		System.out.printf("%n이름 : %d",age);
		System.out.printf("%n키 : %f",height);
		System.out.printf("%n키 : %f",weigt);
		System.out.printf("%n이니셜 : %s", init);
		
		System.out.printf("%n키 : %.3f",height); 	//소숫점 3자리까지만
		
		/*
		 이스케이프 문자
		 \n : 줄바꾸기
		 \t : 탭
		 \\ : \를 출력 ( 두번 찍어야 한번 나온다.)
		 \' : "를 출력 
		 \" : '를 출력
		 
		 */
	}

}
