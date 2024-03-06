package sec3;
//구현클래스
public class PriorityAllocation implements Scheduler {		//우선순위에 따라

	@Override
	public void getNextCall() {
		System.out.println("그 다음 우선순위를 가진 사람이 상담받습니다. ");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("선착순, 나이순, 급한 순서로 배정합니다.");
	}
	

}
