package exam;

public class ExamQ5 {

	public static void main(String[] args) {
		for (int i=0; i<4; i++) {
			
			for (int j=3-i; j>0; j--) {		
				System.out.print(" ");
			}
			for (int y=0; y<=(i*2); y++) {
				System.out.printf("*");
			}
			System.out.println();
			
		}
		for (int w=0; w<3; w++) {
			
			for (int e=0; e<w+1; e++) {		//1 2 3
				System.out.print(" ");
			}
			for (int q=6-(w*2+1); q>0; q--) {	//5 3 1
				System.out.printf("*");
			}
			System.out.println();
			
		}
	}

}
