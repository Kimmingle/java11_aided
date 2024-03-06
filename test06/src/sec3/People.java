package sec3;

public class People {
	
	public static int selNum = 100;			//static은 정적 필드.. 공유 데이터를 의미함(객체와 상관없이 메모리가 공유된다. )
	public String name;					//이름
	public int age;					//나이
	public String addr;					//주소
	
	public void print1() {
		System.out.println("selNum : "+this.selNum);
		System.out.println("name : "+this.name);

	}
	
	public static void print2() {  					//static 메소드는 this 못씀
		System.out.println("Name : 2 ");
		System.out.println("age : 2");

	}
	
	
}
