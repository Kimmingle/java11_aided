package org.kh.object1;

public class ComputeEx {

	public static void main(String[] args) {
		
		Compute com1 = new Compute();		//com1이라는 객체 만듦
		
		com1.fun1();
		com1.fun2(100);
		int a = com1.fun3();
		
		System.out.println(com1.fun3());		//1004
		System.out.println(a);					//1004
		String pass = com1.fun4(75);
		System.out.println(pass);
		
		fnc1();
		fnc2(200);
		System.out.println(fnc3());
		System.out.println("원의 넓이 : "+fnc4(25));
		
	}
	
	//함수 정의 호출
	public static void fnc1() {
		System.out.println("반환 x, 매개변수x");
	}
	public static void fnc2(int a) {
		System.out.println("입력 수 : "+a);
	}
	public static int fnc3() {
		return 500;
	}
	public static double fnc4(int radius) {
		return radius * radius * 3.1415;
	}

}
