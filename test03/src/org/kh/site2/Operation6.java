package org.kh.site2;

public class Operation6 {

	public static void main(String[] args) {
		//논리연산자 : &&(and), ||(or), !(not)
		// 두개가 참일때 참 , 하나만 참일때 참 , 결과 반전
		
		int a = 26;
		int b = 28;
		int c = 27;
		
		System.out.println("a>b && a>c : "+(a>b && a>c)); 	//FF 
		System.out.println("a>b && b>c : "+(a>b && b>c));	//FT
		System.out.println("a<b && b<c : "+(a<b && b<c));	//TF
		System.out.println("a<b && b>c : "+(a<b && b>c));	//TT --이것만 참
		
		System.out.println("a>b || a>c : "+(a>b || a>c)); 	//FF 
		System.out.println("a>b || b>c : "+(a>b || b>c));	//FT -- 참
		System.out.println("a<b || b<c : "+(a<b || b<c));	//TF -- 참
		System.out.println("a<b || b>c : "+(a<b || b>c));	//TT -- 참

		System.out.println("!(a>b) : "+(a>b)); 	//T라서 F
		System.out.println("!(a>b) : "+(a>b)); 	//T라서 F
		
		
		
		
			
	}

}
