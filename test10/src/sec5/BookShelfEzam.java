package sec5;
//Queue : 선입선출 구조
//Stack : 후입선출 구조
public class BookShelfEzam {

	public static void main(String[] args) {
		Queue que = new BookShelf();		//메소드를 쓰고싶으니가 큐
		que.enQueue("관악산 등산 경로");
		que.enQueue("경복궁 안내");
		que.enQueue("숭례문 명동 둘러보기");
		
		System.out.println(que.deQeue());	//위에서 입력받은 순서대로 리턴
		System.out.println(que.deQeue());
		System.out.println(que.deQeue());
		System.out.println(que.deQeue());
		
	}

}
