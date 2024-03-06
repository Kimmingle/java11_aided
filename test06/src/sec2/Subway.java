package sec2;

public class Subway {

	int no;
	String station;
	int cnt;
	int money;
	
	
	//지하철 노선번호를 매개변수로 받는 생성자 함수			
												//Q. 생성자 함수 = 메소드 ..?
	public Subway(int no) {
		this.no = no;
	}
	
	
	//지하철 승객이 탑승하면, 생기는 필드의 값 변화
	
	public void take(int money) {
		this.money += money;
		cnt ++;
		
	}
	

	//학생이 버스를 타는 행위에 대한 현상
	

	
	public void show() {
		System.out.println("지하철 노선번호 : " +no+"지하철 비용 : "+money+"승객 : "+cnt);
	}
	
	

	public String print() {
		return "Subway [no=" + no + ", station=" + station + ", cnt=" + cnt + ", money=" + money + "]";
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getStation() {
		return station;
	}


	public void setStation(String station) {
		this.station = station;
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
