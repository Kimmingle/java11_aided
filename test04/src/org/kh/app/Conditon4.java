package org.kh.app;

import java.util.Scanner;

public class Conditon4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);    //입력받기위한 scanner 객체
		System.out.print("점수입력 [0~100] : ");
		
		int point = scan.nextInt();    //입력받을 자료형에따라 점연산자 다름
		String result;
		String a = null;
		
		if (point >= 97 ) {
			result = "A++";
		}
		else if (point >= 93) {
			result = "A0";
		}
		else if (point >= 90) {
			result = "A-";
		}
		else if (point >= 87) {
			result = "B++";
		}
		else if (point >= 83) {
			result = "B0";
		}
		else if (point >= 80) {
			result = "B-";
		}
		else if (point >= 77) {
			result = "C++";
		}
		else if (point >= 73) {
			result = "C0";
		}
		else if (point >= 70) {
			result = "C-";
		}
		else if (point >= 67) {
			result = "D++";
		}
		else if (point >= 63) {
			result = "D0";
		}
		else if (point >= 60) {
			result = "D-";
		}
		else {
			result = "F";
		}
		System.out.printf("\n판정 : %s \n" ,result );
		

		switch(result) {
			case  "A++" : 
				a= "학업우수상";
				break;
			case  "A0" : 
				a= "장려상";
				break;
			case  "A-" : 
				a= "노력상";
				break;
				
			default:
				a = "없음";
		
		}
		System.out.printf("\n시상 : %s \n" ,a );
		
		
	}

}


