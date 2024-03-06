package sec3;

public class LeastJob implements Scheduler {		//짧은 대기열 먼저
	
	
	//Q. 여기에 if문 넣으면 구현이 되서 안되는건가

	@Override
	public void getNextCall() {
		System.out.println("현재 상담이 모두 완료되었습니다 다음 상담하실분 들어오세요");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("상감시간이 가장 적게 걸리는 사람을 우선 배절합니다. ");

	}

}
