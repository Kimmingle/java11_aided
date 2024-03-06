package org.kh.app;

import java.util.Scanner;

//import scanner 하기

public class Condition3 {

	public static void main(String[] args) {
		//조건문 if~elseif
		Scanner scan = new Scanner(System.in);    //입력받기위한 scanner 객체
		System.out.print("점수입력 [0~100] : ");
		
		int point = scan.nextInt();    //입력받을 자료형에따라 점연산자 다름
		char result;
		//학점은 점수가 100~90이면 A
		
		
		if (point >= 90) {
			result = 'A';
		}
		else if(point >= 80) {
			result = 'B';
		}
		else if(point >= 70) {
			result = 'C';
		}
		else if(point >= 60) {
			result = 'D';
		}
		else  {
			result = 'F';
		}
		System.out.printf("당신의 점수는 : %d \n", point);
//		System.out.println("당신의 점수는 : "+point);     이렇게도 쓸 수 있다!
		System.out.printf("당신의 학점은 : %c \n", result);
	}

}
