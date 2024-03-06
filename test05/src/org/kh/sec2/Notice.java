package org.kh.sec2;

public class Notice {

	private int bno;
	private String title;
	private String uname;
	private String cantent;
	private String author;
	private String visited;


	public Notice(int bno, String title, String uname, String cantent, String author, String visited) {
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
		return "Notice [bno=" + bno + ", title=" + title + ", uname=" + uname + ", cantent=" + cantent + ", author="
				+ author + ", visited=" + visited + "]";
	}
	
	
	
}
