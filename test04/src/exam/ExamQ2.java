package exam;

public class ExamQ2 {

	public static void main(String[] args) {	//구구단 짝수 출력
		
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				if (i%2 == 0) {
					System.out.printf("%d x %d = %d\n", i , j, i*j);
				}
				
			}
			System.out.println();
		}
	}

}
