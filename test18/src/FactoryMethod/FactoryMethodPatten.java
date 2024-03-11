package FactoryMethod;


// FactoryMethodPatten : ��ü�� ����� �κ��� "���� Ŭ����"�� �����ϴ� ����
//IDCard Ŭ������ sub Ŭ������ IDCardFactory�� Ȱ���Ͽ� IDCard ��ü�� �����Ѵ�. 
//�θ�Ŭ������ �����ϰ� ������ ���� Ŭ������ ������(IDCardFactory)�� ������
//�ź���(IDCard)�� ����� ����(IDCardFactory)�� Ȱ��
//�߻�ü�� Factory, Product Ŭ����

public class FactoryMethodPatten {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();  //�ڽ� �������Լ�
		Product card1 = factory.create("��ξ�");
		Product card2 = factory.create("�����");
		
		card1.use();
		card2.use();
	}

}
