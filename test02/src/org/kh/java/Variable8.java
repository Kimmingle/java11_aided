package org.kh.java;

public class Variable8 {

	public static void main(String[] args) {
		var num1 = 29.456;		//var형은 해당하는 값에 의해 자료형을 자동으로 할당해줌
		var num2 = 34;
		var num3 = 'k';
		var num4 = "김민아";
		var num5 = true;
		num1 = 67;				//동적 할당 (실수였으나 정수로 다시 할당 됨)
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("num3 : "+num3);
		System.out.println("num4 : "+num4);
		System.out.println("num5 : "+num5);
		
	}

}
