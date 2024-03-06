package sec3;

public class Singleton {
	
	//singleton 패턴이란? 하나의 객체만 만들 수 있도록 허용되는것. 
	
	private static Singleton instance;		//정적 객체 선언
	private Singleton() {}					// 외부에서 생성할 수 없도옥 private
	public static synchronized Singleton getInstance() {	
		if (instance == null) instance = new Singleton();
		return instance;
	}
	
	

	
	
	
	
}
