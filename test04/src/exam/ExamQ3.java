package exam;

public class ExamQ3 {

	public static void main(String[] args) {	//단보다 곱하는 수가 작거나 같을때까지
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				if (i >= j ) {
					System.out.printf("%d x %d = %d\n", i , j, i*j);
				}
				
			}
			System.out.println();
		}
	}

}
