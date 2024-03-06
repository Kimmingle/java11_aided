package sec1;

import java.util.Scanner;

public class StudentExam {

	public static void main(String[] args) {
		
		
		
		Scanner01[] ss =  new Scanner01[5];
		Scanner scn = new Scanner(System.in);
		
		for (int i=0; i<5; i++) {
			ss[i] = new Scanner01();
			ss[i].setNo(i+1);
			
			System.out.print((i+1)+"번째 국어 : ");
			ss[i].setKor(scn.nextInt());
			System.out.print((i+1)+"번째 수학 : ");
			ss[i].setMat(scn.nextInt());
			System.out.print((i+1)+"번째 영어 : ");
			ss[i].setEng(scn.nextInt());
		}
		System.out.println("번호 국어 영어 수학 총점 평균 학점  ");
		for (int i =0; i<5; i++) {
			ss[i].print();
		}
		
		

	}

}
