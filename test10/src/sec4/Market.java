package sec4;

public class Market implements Buy, Sell{ 		//extends와 다르게 implement는 다중상속이 가능하다. 

	@Override
	public void sell() {
		System.out.println("판매하기");			//구현한거임
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
		
	}			
	
	

}
