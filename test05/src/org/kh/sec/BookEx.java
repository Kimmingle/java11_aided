package org.kh.sec;

public class BookEx {

	public static void main(String[] args) {
		
		Book book01 = new Book();
		book01.setBno(101);
		book01.setBname("정보처리기사");
		book01.setPrice(30000);
		book01.setAurhor("김민아");
		
		
		//book01.print(333, "세이노의 가르침", 3000, "김민아", "동아");
		
		
		Book book02 = new Book();
		book02.setBno(1012);
		book02.setBname("정보처리기사2");
		book02.setPrice(300002);
		book02.setAurhor("김민아2");
		
		Book book03 = new Book();
		book03.setBno(1013);
		book03.setBname("정보처리기사3");
		book03.setPrice(300003);
		book03.setAurhor("김민아3");
		
		
		Book book04 = new Book();
		book04.print(book01.getBno(),book01.getBname(),book01.getPrice(),book01.getAurhor());
		System.out.println("----------");
		book04.print(book02.getBno(),book02.getBname(),book02.getPrice(),book02.getAurhor());
		System.out.println("----------");
		book04.print(book03.getBno(),book03.getBname(),book03.getPrice(),book03.getAurhor());
		
	}

}
