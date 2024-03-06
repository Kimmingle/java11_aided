package sec4;

//public class Store extends Pay, Inventory{		//다중상속 불가
//public class Pay extends Inventory{ 	//Pay에서 이렇게 써줘야 다중상속으로 쓸 수 있음

public class Store extends Pay{

	@Override
	public void Pay() {
		System.out.println("상점");
		super.Pay();			//조상클래스나 부모클래스(Pay)
	}

	@Override
	public void inventory() {
		System.out.println("상점");
		super.inventory();
	}


	

}
