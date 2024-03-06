package sec1;

public  class Arithmatic extends Repeator {

	@Override
	public int subtract(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int multiply(int num1, int num2) {
		int su = 0;
		if (num1>num2)su = num1 / num2;
		else su = num2 / num1;
		
		return su;
	}

	@Override
	int power(int num1, int num2) {
		int tmp = num1;
	
		for (int i=0; i<num2; i++) {
			num1 = num1 * tmp;
		}
		return num1;
		
	}
	
//	@Override
//	int power(int num1, int num2) {
//		
//		for (int i=0; i<num2; i++) {
//			num2 = num2 * num2;
//		}
//	}
	public void print() {
		System.out.println("계산기, 중계기, 연산기를 구현합니다.");
	}
	

	
}
