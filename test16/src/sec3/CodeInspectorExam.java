package sec3;

public class CodeInspectorExam {
//PMD : �ڵ� �ν���� -> �ҽ��ڵ� �����Ͽ� ���� ����, �ڵ� �ۼ� ��Ģ�� �°� �ؼ��ߴ���, ���� �߻� ���ɼ��� �ּ�ȭ�ϱ� ���� ����.
	
	public static void main(String[] args) {
		Reader r1 = new Reader();
		Reader r2 = new Reader(2, "http://www.naver.com", "���̹� ����Ʈ", 1);
		
		r1.def = "���� ������";
//		System.out.println(r2.toString());
//		System.out.println(r2.def);
	}

}
