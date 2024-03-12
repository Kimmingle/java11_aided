package sec3;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList();   //null
		
		list.add(4);
		list.add(-5);
		list.add(0);
		list.add(-3);
		list.add(2);
		list.add(1);     //1.2345 x
		
		for (int num : list) {
			char ch;
			
			if(num < 0) {  		//<=  x
				ch = '-';
			}else if(num > 0) {
				ch = '+';
			}else {
				System.out.println("@@@@@@@@");
				continue;
			}
			
			
			for (int i=0; i<Math.abs(num); i++) {   //i = 1 x
				System.out.print(ch);  		//println x
			}	
			System.out.println();
		}
		
	}

}
