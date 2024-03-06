package sec2;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("2~9 정수입력 : ");
			
			int input = sc.nextInt();
			
			if (input >= 2 && input <= 9) {
				for (int num = 1; num<= 9; num++) {
					System.out.printf("%d *%d = %d \n", input, num, input*num);
				}
				break;
			}else {
				System.out.println("정수 아님 . ");
			}
		}
	}
}
