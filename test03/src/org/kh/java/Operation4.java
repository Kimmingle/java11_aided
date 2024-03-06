package org.kh.java;

public class Operation4 {

	public static void main(String[] args) {
		// 증감연산자
		int a = 10;
		int b = 10;
		// a++ => a = a+1
		System.out.println("전위 증가 연산 : "+ (++a));    //증가 시키고 출력함
		System.out.println("후위 증가 연산 : "+ (b++));    //출력을 먼저 하고 증가시킴
		System.out.println("전위 감소 연산 : "+ (--a));
		System.out.println("후위 감소 연산 : "+ (b--));

	}

}
