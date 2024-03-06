package org.kh.sec2;

public class News {
	
	private int bno;
	private String title;
	private String uname;
	private String cantent;
	private String author;
	private int visited;
	
	
	//top-down 방식..?
	
	
	public News() {
		this(1);
	}
	
	public News(int bno) {
		this(bno, "뉴스 제목");
	}
	
	public News(int bno, String title) {
		this(bno, title, "admin");
	}
	
	public News(int bno, String title, String uname) {
		this(bno, title, uname, "뉴스 내용");
	}
	
	public News(int bno, String title, String uname, String cantent) {
		this(bno, title, uname, cantent, "2024-02-12");
	}
	
	public News(int bno, String title, String uname, String cantent, String author) {
		this(bno, title, uname, cantent, author, 0);
	}
	
	public News(int bno, String title, String uname, String cantent, String author, int visited) {
		super();
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.cantent = cantent;
		this.author = author;
		this.visited = visited;
	}



	@Override
	public String toString() {
		return "News [bno=" + bno + ", title=" + title + ", uname=" + uname + ", cantent=" + cantent + ", author="
				+ author + ", visited=" + visited + "]";
	}
	
	

}
