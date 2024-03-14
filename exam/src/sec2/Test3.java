package sec2;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList();   //list 선언만 있으므로 객체가 생성이 안되기때문에 NullPointerException이 발생
		//반드시 참조형인 Integer로 써야한다. 
		list.add(4);
		list.add(-5);
		list.add(0);
		list.add(-3);
		list.add(2);
		list.add(1);     //1.2345 x 원인 : list 선언 시 요소의 데이터 타입이 integer로 설정되어 있으므로 정수만 입력받을 수 있다. -타입오류
		
		for (int num : list) {
			char ch;
			
			if(num < 0) {  		//<=  x  원인 :  if문의 조건에서 0을 포함하여 음수라고 표현했으므로 0이여도 음수가 발생하고 정상적으로 처리되어야할  else문이 실행되지 않는 오류 발생 
				ch = '-';
			}else if(num > 0) {
				ch = '+';
			}else {
				System.out.println("@@@@@@@@");
				continue;
			}
			
			//int Math.abs(정수) : 정수의 절대값을 반환
			for (int i=0; i<Math.abs(num); i++) {   //i = 1 x  for반복문의 실행조건이해당 숫자를 포함하는것이 아닌 작을대까지만 출력하게되어 => 해당 숫자의 횟수만큼 부호를 출력해야하는데 한번씩 덜 출력 
				System.out.print(ch);  		        
			}	
			System.out.println();
		}
		
	}

}
