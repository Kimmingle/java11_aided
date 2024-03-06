package org.kh.app2;

import java.util.Scanner;

public class Loop6 {

	public static void main(String[] args) {
		//숫자 마추기 게임 무작위로 퀴즈의 답이 되는 수를 0~100 정수로 발생시키고 
		
		int quiz = (int) (Math.random()*5);
		String msg;
		

		
		
		while (true) {
			Scanner ns = new Scanner(System.in); 
			System.out.println("숫자 맞추기 : ");
			int n = ns.nextInt();
			
			if( quiz == n ) {
				System.out.println("정답");
				
			}
			else {
				System.out.println("땡");
			}
		}
		
		
	}

}
