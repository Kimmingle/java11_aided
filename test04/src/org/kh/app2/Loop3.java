package org.kh.app2;

import java.util.Scanner;

public class Loop3 {

	public static void main(String[] args) {
		int[] nums = { 80, 95, 75, 60, 95, 65, 70, 90, 55, 100,};
		
		
		String msg ;
		//for (int n: nums){}  		이렇게도 쓸 수 있음
		for (int i =0; i< nums.length ; i++) {   //80위로 합격
			if ( nums[i] >= 80 ) {
				msg = "합격";
				
			}
			else {
				msg = "불합격";
			}
			System.out.println(" "+msg);
		}
		
	
		
		
	}

}
