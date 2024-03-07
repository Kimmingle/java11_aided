package sec1;

public class StudentExam {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student su1 = new Student();
		Student su2 = new Student();
		
	
		
		su2 = su1;//얕은 복제
		Student su3 = (Student)su1.clone();  //Student에서 생성은 함
		System.out.println(su1.getClass().toString()); //해당 인스턴스의 클래스이름 출력
		System.out.println(su1 instanceof Student);  //su1 인스턴스가 Student 클래스로 생성된 것인지의 
		System.out.println(su1.toString()); /// su1 인스턴스에 대한 스택에 있는 힙의 주소를 (16진수)가져옴
		System.out.println(su1.equals(su2));  //두 객체(인스턴스)가 같은지 비교
		System.out.println(su1.hashCode());  //16진수를 10진수로 (해시코드 출력)
		System.out.println(su3.equals(su1)); 
	}

}
