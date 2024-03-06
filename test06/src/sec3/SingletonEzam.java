package sec3;

public class SingletonEzam {

	public static void main(String[] args) {
		
		Singleton ins1 = Singleton.getInstance();  		//new 생성자로 인스턴스를 만들면 주소가 모두 다르고 getInstance()를 쓰면 주소가 모두 같은곳으로 찍히는걸 알 수 있다. 
		Singleton ins2 = Singleton.getInstance();
		Singleton ins3 = Singleton.getInstance();
		
		System.out.println(ins1);
		System.out.println(ins2);
		System.out.println(ins3);
		
	}

}
