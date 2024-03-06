package sec2;

import java.util.List;
import java.util.Vector;

public class VectorExam {

	public static void main(String[] args) {
		List<Notice> nv = new Vector<>();
		
		//글쓰기
		nv.add(new Notice("제목1", "내용1", "정도준"));
		nv.add(new Notice("제목2", "내용2", "박도준"));
		nv.add(new Notice("제목3", "내용3", "이도준"));
		nv.add(new Notice("제목4", "내용4", "김도준"));
		nv.add(new Notice("제목5", "내용5", "강도준"));
		nv.add(new Notice("제목6", "내용6", "허도준"));
	
		System.out.println("제목\t내용\t작성자\n");
		for(Notice n:nv) {
			System.out.println(n.getTitle()+ "\t" +n.getContent()+ "\t" +n.getAuthor());
		}
		nv.remove(2);
		Notice no = new Notice("제목", "내용", "유정환");
		nv.set(4, no);		//인스턴스 인덱스가 4인곳 중간에 삽입
		System.out.println("제목\t내용\t작성자\n");
		for (int i=0; i<nv.size(); i++) {
			Notice n = nv.get(i);
			System.out.println(n.getTitle()+ "\t" +n.getContent()+ "\t" +n.getAuthor());
		}
	}

}
