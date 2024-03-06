package org.kh.sec;

public class Product {

		private String name ;
		private int pcode;
		private int price;
		private int size;
		private int amount;
		private String pname;

		private String remart;
		
	
		public void print() {
			System.out.println("제품 정보  ");
		}
		
		public void print(String pname) {			//메소드 오버로딩(매개변수나 개수에 따라 같은 이름의 메소드를 여러개 호출할 수 있음)
			System.out.println("제품 이름 : "+ pname);
		}
		
		public void print(int amount) {
			System.out.println("제품 수량 : " + amount);
		}
		
		public void print(String pname, int amount) {
			System.out.println("제품 이름 : "+ pname);
			System.out.println("제품 수량 : "+ amount);
		}
		
		public void print(int amount, String pname) {
			System.out.println("제품 수량 : " + amount);
			System.out.println("제품 이름 : "+ pname);
		}
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPcode() {
			return pcode;
		}
		public void setPcode(int pcode) {
			this.pcode = pcode;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		public int getAmount() {
			return amount;
		}
		public void setAmount(int amount) {
			this.amount = amount;
		}
		public String getRemart() {
			return remart;
		}
		public void setRemart(String remart) {
			this.remart = remart;
		}
		
		@Override			//상속받아 사용함
		public String toString() {
			return "Product [name=" + name + ", pcode=" + pcode + ", price=" + price + ", size=" + size + ", amount="
					+ amount + ", remart=" + remart + "]";
		}

}
