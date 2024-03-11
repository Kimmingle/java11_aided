package FactoryMethod;
//product 추상 클래스의 객체를 샐성하는 Factory 추상 클래스
public abstract class Factory {

	public final Product create(String owner) {  //추상체로써 create 메소드 활용하여 product만듦
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
		
	}
	
	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product p);
}
