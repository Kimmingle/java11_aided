package org.kh.sec2;

public class Board {

	private int bno;
	private String title;
	private String uname;
	private String cantent;
	private String author;
	private String visited;
	
	public Board() {}   //생성자 함수. 객체를 만들때 쓴다...
	public Board(int bno) {  	//생성자 오버로딩 (메소드 오버로딩과 비슷하지만 반환을 하지 않는다. )
		this.bno = bno;				// 생성자 오버로딩을 이용하면 set대신으로 객체를 생성할 때 값을 지정할 수 있다. 
	}
	
	public Board(int bno, String title) {
		this.bno = bno;
		this.title = title;
		
	}
	public Board(int bno, String title, String uname) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
	}
	public Board(int bno, String title, String uname, String author) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.author = author;
	}
	
	
	
	
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getCantent() {
		return cantent;
	}
	public void setCantent(String cantent) {
		this.cantent = cantent;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getVisited() {
		return visited;
	}
	public void setVisited(String visited) {
		this.visited = visited;
	}
	
	
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", uname=" + uname + ", cantent=" + cantent + ", author="
				+ author + ", visited=" + visited + "]";
	}
	

}
