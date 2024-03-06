package org.kh.java;

public class Casting1 {

	public static void main(String[] args) {
		// 묵시적 형 변환 (Auto Casting) 
		byte b = 20;   //1바이트
		short s = b;   //2바이트
		int i = s;    //4바이트
		long l = i;    //8바이트
		
		// 명시적 형변환 Force Casting : 큰 크기의 저장소에 있는 데이터 값을 별도의 타입 연산자를 활용하여 
		int i2 = (int)l;
		short s2 = (short)i;
		byte b2 = (byte)s;
	}

}
