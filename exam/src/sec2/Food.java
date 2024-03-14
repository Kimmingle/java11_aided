package sec2;

public class Food {

	String name ;
	int kcal;
	public Food(String name, int kcal) {
		super();
		this.name = name;
		this.kcal = kcal;
	}
	public Food() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	@Override
	public String toString() {
		return "Food [name=" + name + ", kcal=" + kcal + "]";
	}
	
	
}
