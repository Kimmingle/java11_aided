package sec2;

public class BookExam {
	public static void main(String[] args) {
		//100개의 Book배열 선언
		Book[] book = new Book [100];
		
		
		for (int i= 0; i<5; i++) {
			book[i] = new Book("책 제목: "+i,"책 제목: "+i);
		
		}
		
		for (int i=0; i<5; i++) {
			System.out.println(book[i].toString());
		}
		
	}

}
