package sec3;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesExam {

	public static void main(String[] args) {
		//properties선언 및 생성
		
		Properties pro = new Properties();  
		pro.setProperty("name", "Kimmina");     //"job"element라고 한다. 
		pro.setProperty("age", "43");
		pro.setProperty("local", "gasandong");
		
		System.out.println(pro);
		System.out.println("엘리먼트 수 : "+pro.size());
		System.out.println(pro.getProperty("name"));
		
		//Properties의 순회-> 열거형으로 해당 엘리먼트의 키를 가져와 처리해야함 (for문쓰면 에러남)
		Enumeration e = pro.propertyNames();
		while(e.hasMoreElements()){
			String el = (String) e.nextElement();
			System.out.println(el + ":" +pro.getProperty(el));
		}
	}
}
