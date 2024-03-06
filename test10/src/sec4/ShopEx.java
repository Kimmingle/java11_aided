package sec4;

public class ShopEx {

	public static void main(String[] args) {
		Shop s1;
		Delivery s2;
		
		s1 = new Shop();
		s2 = new Shop();
		
		s1.buy();
		s1.delivery();
		s1.sell();
		
		s2.buy();
		s2.delivery();
		s2.sell();
	}

}
