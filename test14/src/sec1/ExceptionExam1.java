package sec1;
//����(Exception) ó�� : ���α׷��� ������ ������ �߻��ϸ�, �� ������ ó�� ������ ó������ ���ϰ�, ������ �����Ǵµ� 
//�̷��� ��츦 ����(Exception)����ϸ�, �׷��ٸ�, ���� ������� ����� �� �ֵ��� 
//��� ���� ���嵵 ó���� �� �ֵ��� �ϴ� ���� ���� ó����� �մϴ�.
public class ExceptionExam1 {
	public static void main(String[] args) {
		String name = null;
		//���� ó���� ����(try)�� ���ܰ� �߻��ϸ�, ����ó�� ����(catch)�� ����
		try {
			//���� ó���� ����
			System.out.println(name.toString()); 	
		} catch(Exception e) {
			//���ܰ� �߻��� ��� ó���� ����
			System.out.println("�� �� ���� ���ܰ� �߻��Ͽ����ϴ�.");
		}
	}
}