package sec1;

public class Birds extends Animal{


	private int wings;
	private boolean fly;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}

	public boolean isFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}
	@Override
	public String print() {
		return "Birds [wings =" +wings+ "],[name =" +name+ "]" ;
	}
	
}
