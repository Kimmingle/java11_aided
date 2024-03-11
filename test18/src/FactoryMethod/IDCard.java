package FactoryMethod;

public class IDCard extends Product {

	private String owner;
	
	public IDCard(String owner) {
		System.out.println(owner +"ī�� �����");
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println(owner + "�� ī�带 ����մϴ�.");
	}

	public String getOwner() {
		return owner;
	}

	public void setOwer(String onwer) {
		this.owner = owner;
	}
	
	
}
