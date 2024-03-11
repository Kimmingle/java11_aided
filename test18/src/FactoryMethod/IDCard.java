package FactoryMethod;

public class IDCard extends Product {

	private String owner;
	
	public IDCard(String owner) {
		System.out.println(owner +"카드 만들기");
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println(owner + "의 카드를 사용합니다.");
	}

	public String getOwner() {
		return owner;
	}

	public void setOwer(String onwer) {
		this.owner = owner;
	}
	
	
}
