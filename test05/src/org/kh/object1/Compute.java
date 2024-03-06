package org.kh.object1;

public class Compute {

	void fun1() {
		System.out.println("메소드 (함수)1");
	}
	
	void fun2(int a) {
		System.out.println(a+"를 입력함");
	}
	
	int fun3() {
		return 1004;
	}
	
	String fun4(int point) {
		if (point >= 80) return "합격";
		else return "불합격";
	}
	

}
