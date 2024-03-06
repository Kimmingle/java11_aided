package sec3;

public class Korea implements Lunch {
	
	//implements(상속)의 특징은 부모의 메소드를 반드시 재정의 해야한다!!!
	
	
	@Override
	public void eating(String manu) {
		System.out.println(manu+"를 먹습니다.");
		
	}
	
	
	
	
	
}
