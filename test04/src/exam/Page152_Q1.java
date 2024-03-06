package exam;

public class Page152_Q1 {

	private int age = 40;
	private String name = "James";
	private String gender = "man";
	private String marry = "yes";
	private int child = 3;		//private이니까 생성자 만들기
	
	

	public Page152_Q1(int age, String name, String gender, String marry, int child) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.marry = marry;
		this.child = child;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getMarry() {
		return marry;
	}



	public void setMarry(String marry) {
		this.marry = marry;
	}



	public int getChild() {
		return child;
	}



	public void setChild(int child) {
		this.child = child;
	}

	
	


	@Override
	public String toString() {
		return "Page152_Q1 [age=" + age + ", name=" + name + ", gender=" + gender + ", marry=" + marry + ", child="
				+ child + "]";
	}



	private void Man() {
			System.out.println(name+"의 나이 : "+age);
			System.out.println(name+"의 이름 : "+name);
			System.out.println(name+"의 결혼 여부 : "+marry);
			System.out.println(name+"의 자녀 수 : "+child);
		
	}

}
