package sec2;

class Person{
	String name;
	int point ;

	public Person(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(String name, int point) {
		super();
		this.name = name;
		this.point = point;
	}
	
	
}


public class Test4 {		//이름을 출력해라는거임?
	public static void main(String[] args) {
		
		Person[] pArr = new Person[3] ;
		
		pArr[0] = new Person("김민아", 24);
		pArr[1] = new Person("김기태", 28);
		pArr[2] = new Person("이강인", 26);		//비어있거나 초기화하지 않은 pArr배열에 Person 객체
		
		for (int i=0; i<pArr.length; i++) {		//실제 선언한 배열의 개수보다 더 많은 수의 반복실행됨(요청한 횟수가 배열수보다 더 많다) ArrayIndexOutOfBoundsException
			System.out.println(pArr[i].getName());		//Person의 배열 요소인 pArr객체가 초기화가 안되어있음(=값이 대입되어있지 않음) NullPointerException
		
		} 
	}
}
