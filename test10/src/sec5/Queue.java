package sec5;

public interface Queue {		//큐
	void enQueue(String title);		//저장된 데이터의 끝을 나타냄
	String deQeue();		//저장된 데이터의 시작
	int getSize();		//현재 큐에 저장된 개수
	
}
