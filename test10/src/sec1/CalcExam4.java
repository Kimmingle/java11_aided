package sec1;

public class CalcExam4 {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 2;
		
		Calcurator cal1;
		
		cal1 = new Calcurator() {
			public int add(int num1, int num2) {
				return num1 + num2;
			};
			
			public int divide(int num1, int num2) {
				int su = 0;
				if (num1>num2)su = num1 - num2;
				else su = num2 - num1;
				
				return su;
			};
		
			public int subtract(int num1, int num2) {
				return num1 + num2;
			};

			public int multiply(int num1, int num2) {
				int su = 0;
				if (num1>num2)su = num1 / num2;
				else su = num2 / num1;
				
				return su;
			};
		};
		
		System.out.println("원주율 : "+cal1.PI);
		System.out.println("덧셈 : "+cal1.add(num1, num2));
		System.out.println("뺄셈 : "+cal1.subtract(num1, num2));
		System.out.println("곱셈 : "+cal1.multiply(num1, num2));
		System.out.println("나눗셈 : "+cal1.divide(num1, num2));
		//System.out.println("거듭제곱 : "+cal1.power(num1, num2));
			
	}
	
}
