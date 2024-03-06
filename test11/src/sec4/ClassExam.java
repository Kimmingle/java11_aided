package sec4;

public class ClassExam {

	public static void main(String[] args) {
		Person p1 = new Person("김민아", 24);
		//p1의 소속 패키지이름과 클래스명을 출력하라.
		System.out.println("믈래스 명 : "+p1.getClass().getName());
		
		Class <Person> p2 = Person.class;
	}

}
