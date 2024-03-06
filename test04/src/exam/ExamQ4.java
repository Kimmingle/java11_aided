package exam;

public class ExamQ4 {

	public static void main(String[] args) {
		for (int i=0; i<4; i++) {
			for (int j=3-i; j>0; j--) {		// j에 i가 증하가는만큼 빼주면 되는데 그걸 몰랏네;;;;;;;;;;
				System.out.print("k");
			}
			for (int y=0; y<=(i*2-1); y++) {
				System.out.printf("*");
				
			}
			System.out.println();
		}
	}

}
