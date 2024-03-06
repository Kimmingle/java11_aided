package sec4;

import java.util.Stack;

public class StackExam {

	public static void main(String[] args) {
		//스택이란? 탑 같이 입력할때는 쌓아올려지고, 출력할대는 반대로 맨 마지막에 입력한 가장 위에 입력된 것부터 출력한다. 
		//LIFO
		Stack <String> st = new Stack();
		
		
		st.push("사과");
		st.push("딸기");
		st.push("감");
		st.push("배");
		st.push("파인애플");
		st.push("메론");
		st.push("체리");
		st.push("곶감");
		st.push("수박");
		st.push("애플");
		
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.peek());
		System.out.println(st.pop());  //마지막 요소 반환 후 pop
		System.out.println(st.pop());
		System.out.println(st);
		
		
	}	
}
