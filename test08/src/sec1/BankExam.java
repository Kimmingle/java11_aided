package sec1;
import java.util.ArrayList;
import java.util.Scanner;
public class BankExam {
	
		
	int addPrice ;
	int num ;
	String name;
	String bank;
	int total;
	
	//ArrayList<E> Account = new ArrayList<E>();
	
	
	
	public BankExam(int addPrice, int num, String name, String bank, int total) {
	
		this.addPrice = addPrice;
		this.num = num;
		this.name = name;
		this.bank = bank;
		this.total = total;
		
	}
	public int getAddPrice() {
		return addPrice;
	}
	public void setAddPrice(int addPrice) {
		this.addPrice = addPrice;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "BankExam [addPrice=" + addPrice + ", num=" + num + ", name=" + name + ", bank=" + bank + ", total="
				+ total + "]";
	}
		
	
		

		
		
	

	
		

}
