package sec2;

public class StringBufferExam {
//string 클래스는 한번 값을 생성하면 수정할 수 없기 때문에 String buffer를 사용한다. 
	//stringbuffer는 내부에 독립적인 공간을 가지기 때문에 수정할 수 있나봄?
	public static void main(String[] args) {
		String str = new String("java Programmer");
		str += " junier Level";
		str += " Develope";
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer(); 		//기본적으로 스택구조임
		byte[] b= str.getBytes();
		for(byte c : b) {
			char k = (char) c;
			sb.append(k);
			
		}
		System.out.println(sb);
		
		CharStack cs = new CharStack();
		cs.push('v');
		
		System.out.println(cs.list());
		System.out.println(cs.toString()+","+cs.toString().length());
//		System.out.println((char) cs.);
		
		
		
		}

}
