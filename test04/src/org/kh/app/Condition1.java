package org.kh.app;

public class Condition1 {

	public static void main(String[] args) {
		//조건문 if (한줄일 경우 중괄호 생략 가능)
		
		int point = 80;
		String pass = "불합격";
		//점수가 70점 이상이면 합격, 아니면 불합격
		
		if ( point >= 70) pass = "합격";  
		
		if (point >= 70) {
			pass = "합격";
		}
		System.out.printf("\n당신의 점수는 : %d 점이며, 판정은 %s ", point , pass);
		
		String pass2 = (point>=70)?"합격":"불합격";   //삼항연산자
		System.out.printf("\n당신의 점수는 : %d 점이며, 판정은 %s ", point , pass2);
		
	}

}
