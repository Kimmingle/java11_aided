package sec4;

public class StoreExam {

	public static void main(String[] args) {
		Inventory store;
		store = new Store();
		store.inventory();
		
		
		Pay pay;
		pay = new Pay();
		pay.inventory();
//		pay.pay();
		
					//선언은 페이로, 생성은 스토어로
		pay = new Store();
		pay.inventory();
//		pay.pay();
		
	}

}
