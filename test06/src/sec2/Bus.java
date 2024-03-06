package sec2;

public class Bus {

	int no;		//노선번호
	int cnt;		//승객 수
	int	money;		//요금
	
	
	
	//객체 생성 시  노선번호만 입력받는 생성자 함수
	public Bus(int no) {
		this.no = no; 			// 현재 객체의 no

	}

	//승객이 버스를 카면 행해지는 일
	public void take(int money) {
		this.money += money;		//요금이 증가하게 하려고
		cnt ++;
		
	}
	
	
	//버스의 현재 정보 출력
	public void show() {
		System.out.println("버스 번호 : "+no+"수입 금액 : "+money+"승객 수 : " +cnt);
		
	}


	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
		
		
	
	

}
