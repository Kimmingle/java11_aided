package org.kh.app2;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		//while문    주의) 괄호안에 조건만 기입하고 , 해당 블록안에 증감식이 기재됨
		
		int i = 0, tot = 0;
		
		while(i <= 10) {
			i++;			//i = i +1
			tot += i;		// tot = tot +i
			System.out.println("결과 : "+ tot);
		}
		
		System.out.println("구구단--------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 : ");
		
		int n = sc.nextInt();  //sc를 정수로 바꿔줌
		int j = 0;	
		
		while (j<9) {				//9번 반복
			j++;
			int t = j*n;
			System.out.printf("%d x %d = %d\n", n, j, t );
		}
		for ( int k=0; k<9; k++) {
			
		}
	}
}
