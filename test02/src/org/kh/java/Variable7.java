package org.kh.java;

public class Variable7 {

	public static void main(String[] args) {
		String name = "김민아";
		Integer age =43;
		float height = 172.6f;
		boolean pass = true;
		double weight =72.3;
		
		
		System.out.println("name : " + name.getClass().getName());
		System.out.println("age : " + age.getClass().getName());
//		System.out.println("age : " + height.getClass().getName());
		
		// primitive type을 wrapper type으로 바꾸는걸 boxing 이라고 함
	}

}
