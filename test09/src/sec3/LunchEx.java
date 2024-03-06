package sec3;

public class LunchEx {

	public static void main(String[] args) {
		
		Lunch lc;
		
		System.out.println("Korea--");
		lc = new Korea();
		lc.eating("한식");
		
		System.out.println("Chinese--");
		lc = new Chinese();
		lc.eating("중식");
		
		System.out.println("Japanese--");
		lc = new Japanese();
		lc.eating("일식");
		
		
	}

}
