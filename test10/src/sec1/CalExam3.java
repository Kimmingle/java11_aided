package sec1;

public class CalExam3 {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 4;
		
		Repeator rep1;			//Repeator는 자식 클래스
		
		
		
//		rep1 = new Calcurator() : 부모 생성자로는 생성할 수 없다. 
//		rep1 = new Repeator()  : 이건 또 Repeatorrk 가 추상클래스라 생성자로 쓸 수 없음
	
		rep1 = new Arithmatic();		//Arithmatic은 구현체인가?!
//		rep1.print();				//rep1가 Repeator로 선언되어 있으므로 쓸 수 없음. print쓰려면 Repeator에 print가 선언되어 있어야함
		
		
		System.out.println("덧셈 : "+rep1.add(num1, num2));
		System.out.println("뺄셈 : "+rep1.subtract(num1, num2));
		System.out.println("곱셈 : "+rep1.multiply(num1, num2));
		System.out.println("나눗셈 : "+rep1.divide(num1, num2));
		System.out.println("거듭제곱 : "+rep1.power(num1, num2));
		System.out.println("덧셈 : "+rep1.add(num1, num2));
	}

}
