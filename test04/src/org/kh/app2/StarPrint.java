package org.kh.app2;

public class StarPrint {

	public static void main(String[] args) {
		//중첩 for문을 활용한 별찍기
		
		
//		for (int i =0; i<6; i++) {
//			for ( int j=i; j<6; j++ ) {				//이 for문을 4번 실행시키는 것
//				
//				//int a =+ 1;
//
//				String a = "*";
//				
//				System.out.print(a);				//이 프린트문은 6번 실행됨
//			}
//			System.out.println(" ");					//칸 띄우기
//		}
//		System.out.println("-------");
//		
//		
//		
		
//		int i;
//		String a = "*";
//		for (i =0; i<6; i++) {
//			for ( int j=i; j<6; j++ ) {				//이 for문을 4번 실행시키는 것
//				int d =+ 1;
//				//String a = "*";
//				System.out.print(a);
//			}
//				String nn = " ";
//				
//			System.out.printf("%s%s \n",nn,a);
//			
//		}
		
		//4번
		
		for (int i=0; i<6; i++) {
			for (int j=i; j<6; j++ ) {	
					System.out.print("*");
				}
			for (int v=0; v<i; v++) {
				String a = "*";
				System.out.print(a);
			}
			System.out.println(" ");					
		}

	}
		
}


