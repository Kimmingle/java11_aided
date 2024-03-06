package sec1;

public class BirthdayExample {

	public static void main(String[] args) {
		
		
		Birthday birthday = new Birthday();
		birthday.setName("김민아");   
		birthday.setYear(2001);
		birthday.setMonth(12);
		birthday.setDay(25);
		birthday.birth();
		birthday.birthAddr();
		birthday.toString();
		
		Birthday birthday2 = new Birthday();
		birthday2.setName("김민희");   
		birthday2.setYear(2002);
		birthday2.setMonth(11);
		birthday2.setDay(24);
		birthday2.birth();
		birthday2.birthAddr();
		birthday2.toString();
		
		
		
	}

}
