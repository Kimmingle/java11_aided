package sec2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		List <Food> list = new ArrayList();
		
		System.out.println("====음식 메뉴 리스트====");
		System.out.println("1. 음식 추가 \n2. 음식 정보\n3. 음식 삭제\n4. 프로그램 종료");
		System.out.println("번호 선택 : ");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		while(true) {
			switch (a){
				case 1:
					System.out.println("1");
					return;
				
				case 2:
					System.out.println("1");
					break;
					
				case 3:
					System.out.println("1");
					break;
					
				default:
					System.out.println("종료");
					break;
			}
		}
	}

}
