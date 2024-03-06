package sec3;

public class Mammal extends Animal{


		
	protected int leg;

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
