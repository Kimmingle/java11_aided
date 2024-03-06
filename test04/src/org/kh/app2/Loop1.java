package org.kh.app2;

public class Loop1 {
	
	public static void main(String[] args) {
		//반복문 for, while, do~while
		
	
		int n =0;							//n은 전역변수
		for (int i=0;  i<10;  i++) {		//i는 지역변수
			n = n+1;
		}
		
		//System.out.println("i="+n);
		
		
		//이름, 점수, 학점 구하기
		
		int[] nums = { 80, 95, 75, 60, 95, 65, 70, 90, 55, 100,};		//배열  (인덱스 0부터 시작함)
		String names[] = {"김", "박", "이", "최", "오", "강", "장", "정", "계", "배"};
		char credit ;  			//학점 변수
		int total = 0;				//총점 변수
		float dd = 0;				//평균 변수
		int max = 0;				//최대 점수 변수
		int min = nums[0];			//최소학점 변수(min과 비교해서 작은수가 와야하니까 0 넣으면 안됨.
		
		
		System.out.printf("이름\t점수\t학점\n");
		System.out.printf("---------------------\n");
		
		for (int i=0; i<10; i++) {					//i가 10이 될때까지 반복. 
			
			//판정 구하기
			if (nums[i] >= 90) {
				credit= 'A';
			}
			else if (nums[i] >= 80) {
				credit= 'B';
			}
			else if (nums[i] >= 70) {
				credit= 'C';
			}
			else if (nums[i] >= 60) {
				credit= 'D';
			}
			else {
				credit = 'F';
			}
			
			System.out.printf(" %s\t%d\t%c\n",names[i], nums[i], credit);		//i만큼 names배열에 있는 값 출력
																				//num[i]라고 안하고 num을 출력하면 배열을 담고있는 메모리 주소값 나옴
			total = nums[i] + total; 
			
			if ( max < nums[i] ) {
				max = nums[i];
			}
			if ( min > nums[i]) {
				min=nums[i];
			}

			
		}
		dd = (float)total/10; 
		
		System.out.printf("전체 총점 :%d \n",total);
		System.out.printf("전체 평균 :%.1f \n",dd);
		System.out.printf("최대 점수 :%d\n",max);
		System.out.printf("최소 점수 :%d\n",min);

	}
}

