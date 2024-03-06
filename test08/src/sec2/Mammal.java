package sec2;

public class Mammal extends Animal{


	String name;
	int leg;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	@Override
	public String print() {
		return "Mammal [leg =" +leg+ "],[name =" +name+ "]";
	}
		
		
	

}
