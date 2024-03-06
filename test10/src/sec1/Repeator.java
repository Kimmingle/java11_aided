package sec1;

public abstract class Repeator implements Calcurator{  		//인터페이스를 상속받아서 implements, 클래스를 상속받으면 extends?
//인터페이스를 상속받은 추상 클레스는 전부또는 일부만 추상화 할 수 있으며 물려받은 메소드에 대하여 구현이 가능하다. 
//별도의 추상메소드도 정의할 수 있다. 
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

//	@Override
//	public int subtract(int num1, int num2) {			//내가 원하는 부분만 추상화 할 수 있다!
//		return 0;
//	}
//
//	@Override
//	public int multiply(int num1, int num2) {
//		return 0;
//	}

	@Override
	public int divide(int num1, int num2) {
		int su = 0;
		if (num1>num2)su = num1 - num2;
		else su = num2 - num1;
		
		return su;
	}
	
	abstract int power(int num1, int num2);


	

	
	

}


