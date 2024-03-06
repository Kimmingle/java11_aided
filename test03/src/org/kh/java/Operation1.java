package org.kh.java;

public class Operation1 {

	public static void main(String[] args) {
		//입력 항에 따라 단항, 이항, 삼항
		boolean b1 = true;
		boolean b2 = !b1;     //단항연산
		System.out.println(b1);
		System.out.println(b2);
		
		int i1 = 20, i2 = 40;
		int i3 = i1+i2;          //이항연산
		System.out.println(i3);
		
		int max = (i1 > i2) ? i1:i2 ;   //참이면 i1, 거짓이면 i2
		System.out.println("max : "+ max);   //삼항연산
	}  

}
