package org.kh.java;

public class Variable5 {

	public static void main(String[] args) {
		char ch1 = 'H';
		char ch2 = 62;
		char ch3 = 82;
		char ch4 = '\u2665';
//		char ch5 = -65;   코드넘버는 순번이므로 음수값을 가질 수 없다.
		char ch6 = '\u26BD';
		
		System.out.println("ch1 : " +ch1);
		System.out.println("ch2 : " +ch2);
		System.out.println("ch3 : " +ch3);
		System.out.println("ch1을 아스키 코드로 바꾸면 : " + (int)ch1); 	//int로 강제 형변환
		System.out.println("ch4를 아스키 코드로 바꾸면 : "+ ch4);
		System.out.println("ch6를 아스키 코드로 바꾸면 : "+ ch6);   //이모지를 쓰고싶을때 그 이모지의 유니코드를 찾으면 일케 쓸 수있음
	}
}
