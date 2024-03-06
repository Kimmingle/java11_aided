package exam;

public class MyDate_168p {

	private int day ;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public MyDate_168p(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public String toString() {
		return "MyDate_168p [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
	public boolean isValid() {
		//날자가 유효한지 확인
		System.out.println("날짜가 유효하지 않습니다");
	}
	
	

}
