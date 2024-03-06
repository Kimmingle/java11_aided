package sec3;

import java.io.IOException;

public class ScheduleExam {  		//실행클레스
	public static void main(String[] args) throws IOException {
		//키보드로 알파벳을 입력받아 입력값이 r이면 roundrobin의 객체가
		//p이면 PriorityAllocation객체가
		//l이면 LeastJob객체가
		//그 외면 지원하지 않는 스테쥴링입니다. 를 출력, 
		
		Scheduler s = null;
		System.out.println("전화 상담방식 선택 : ");
		int ch = System.in.read();
		
		switch (ch) {
		
			case 'R':
			case 'r':
				s = new RoundRobin();
				break;
			case 'P':
			case 'p':
				s = new PriorityAllocation();
			case 'L':
			case 'l':
				s = new LeastJob();
				break;
			default:
				System.out.println("지원하지않는 스케줄링입니다. ");
				
		
		}
		
		s.getNextCall();
		s.sendCallToAgent();
		
	}
	
}
