package org.kh.java;

// 자료형 실습
public class Variable1 {

	public static void main(String[] args) {
		boolean a = true;     //논리어 T/F 만 저장하는 1바이트
		byte b = 127;         //256까지를 저장하지만 -128부터 127범위에서 쓸 수 있음 (넘어가면 overflow)  //기본형
//		byte c = -129;        //(에러) 해당 공간에 저장할 수 있는 숫자보다 더 작은 숫자이므로 underflow
		short c = 32765;      //65536가지 표현하지만 -32769부터 32767까지
		char d = 'k';		  // 2바이트 저장
		int e = 234567;	 	  // 4바이트 저장
		float f = 3.14f;	  // 4바이트 저장
		long g = 23456789;	  // 8바이트 저장
		double h = 3.14d;	  // 8바이트 저장
		System.out.println("byte : " + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);  //바이트가 가지는 제일 작은
		System.out.println("short : " + Short.MIN_VALUE + "~" + Byte.MAX_VALUE);    //참조형 null 이여도 오류 안남 (?)
		System.out.println("char : " + Character.MIN_VALUE + "~" + Character.MAX_VALUE);
		System.out.println("int : " + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		System.out.println("float : " + Float.MIN_VALUE + "~" + Float.MAX_VALUE);
		System.out.println("long : " + Long.MIN_VALUE + "~" + Long.MAX_VALUE);
		System.out.println("double : " + Double.MIN_VALUE + "~" + Double.MAX_VALUE);


	}

}
