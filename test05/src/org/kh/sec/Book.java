package org.kh.sec;

public class Book {

	private int bno ;
	private String bname;
	private int price;
	private String aurhor;
	private String pub;
	
//	public void print(int bno) {
//		System.out.println("교재 코드 : "+bno);
//	}
//	public void print(int bname) {
//		System.out.println("교재 코드 : "+bname);
//	}
//	public void print(int price) {
//		System.out.println("교재 코드 : "+price);
//	}
//	public void print(String aurhor) {
//		System.out.println("교재 코드 : "+aurhor);
//	}
//	public void print(String pub) {
//		System.out.println("교재 코드 : "+pub);
//	}
	
	
	public void print(int bno, String bname) {
		System.out.println("교재 코드 : "+bno);
		System.out.println("교재 명 : "+bname);
	}
	
	public void print(int bno, String bname, int price ) {
		System.out.println("교재 코드 : "+bno);
		System.out.println("교재 명 : "+bname);
		System.out.println("교재 가격 : "+price);
	}
	
	public void print(int bno, String bname, int price, String aurho) {
		System.out.println("교재 코드 : "+bno);
		System.out.println("교재 명 : "+bname);
		System.out.println("교재 가격 : "+price);
		System.out.println("교재 저자 : "+aurho);
	}
	
	public void print(int bno, String bname, int price, String aurho, String pub) {
		System.out.println("교재 코드 : "+bno);
		System.out.println("교재 명 : "+bname);
		System.out.println("교재 가격 : "+price);
		System.out.println("교재 저자 : "+aurho);
		System.out.println("교재 출판사 : "+pub);
	}
	
	
	
	//get, set
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAurhor() {
		return aurhor;
	}
	public void setAurhor(String aurhor) {
		this.aurhor = aurhor;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	
	@Override
	public String toString() {
		return "Book [bno=" + bno + ", bname=" + bname + ", price=" + price + ", aurhor=" + aurhor + ", pub=" + pub
				+ "]";
	}
	
	

}
