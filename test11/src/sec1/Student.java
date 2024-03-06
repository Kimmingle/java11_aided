package sec1;

public class Student {   //extends Object가 생략되어 숨어있음. 모든 클래스는 object클래스를 시조 클래스로 삼는다. 
	
	private int sno;
	String name;
	
	public Student() {};
	
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}


	//복제시에는 반드시 clone을 오버라이딩 해야함
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student clone = new Student();		//해당 객체 생성
		clone.name = this.name;		//새로 생성된 객체에 모든 필드값을 넘기기
		clone.sno = this.sno;
		return clone();
	}
	
	

//	@Override
//	public boolean equals(Object obj) {		//오버라이딩 안해도 됨. (근데 왜함)
//												//Exam1에서 값 비교하려고 (이거 안하면 주소를 비교함)
//		if ( obj instanceof Student) {
//			Student su1 = (Student) obj;		//이렇게 하나하나 비교해줘야 하는듯
//			if (su1.name == this.name && su1.sno == this.sno){  
//				return true;
//			}
//			else {
//				return false;
//			}
//		}
//		
//		return super.equals(obj);
//	}

	public int getSno() {
		return sno;
	}


	public void setSno(int sno) {
		this.sno = sno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
