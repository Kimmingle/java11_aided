package org.kh.app2;

public class Loop5 {

	public static void main(String[] args) {
		// do~while문 : 조건이 만족하지 않더라도 1회 이상 실행을 보장하는 문장
		int a= 0;
		while(a>10) {
			
			a++;
			System.out.println(a);				//이 while문은 실행되지 않음. (a가 10보다 클 일이 없기 때문에)
						
		}
		
		
		
		
		
		do {
			System.out.println("a="+a);
		} while(a>10);
		
		for(int i =0; i>0; i--) {
			System.out.println(i);
		}
	}
	

}
