package sec2;

public class Student {

	private String name;
	private int grade;
	private int money;
	
	
	
	public Student() {
		this("ㄴ");

	}
	
	public Student(String name) {
		this(name, 1);

	}
	
	public Student(String name, int grade) {

		this(name, grade, 100);
	}
	
	public Student(String name, int grade, int money) {
		super();
		this.name = name;
		this.grade = grade;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Bus bus) {
		bus.take(1500);
		this.money -= 1500;
		
	}
	
	



	public void print() {
		System.out.println("Student [name=" + name + ", grade=" + grade + ", money=" + money + "]");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
}
