package sec1;

public class Birthday {


	private int year;
	private int month;
	private int day;
	private String name;
	
	public Birthday() {}  
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void birth() {
		System.out.println(this.year + "-"+this.month+"-"+this.day);
	}
	public void birthAddr() {
		System.out.println(this);
	}
	public Birthday(int year, int month, int day, String name) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.name = name;
	}

//	@Override
//	public String toString() {
//		return "Birthday [year=" + year + ", month=" + month + ", day=" + day + ", name=" + name + "]";
//	}
	
	
	
	
	
	
	
	
	
	
	
	
}
