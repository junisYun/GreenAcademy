package kr.green.ex0610;

public class CharTypeEx {
	public static void main(String[] args) {
		char ch = 'A';
//		char ch2 = "A";//����:"":�� String�̴�.
		char ch3 = ' ';//����:� ���ڶ� 1�� �̻� ������ �Ǿ�� �Ѵ�. �� ĭ�� ����
		char ch4 = 65; // ASCCI�ڵ� �� 65���� �ش��ϴ� ���� ����.
		System.out.println("ch: "+ ch);
		System.out.println("ch4 : "+ ch4);
		System.out.println("ch4 : "+ (char)(ch4+32));
		
		System.out.println("���� �ڵ� ���� :"+(char)(55203));
		System.out.println("���� �ڵ� ���� :"+(int)('Ş'));
		char ch6 = '\n';
		
//		\n : ���๮��, \t: �ǹ���, \\ : \ ǥ��
		System.out.println("��" +ch6 +"��"+ch6+ch6+"ȣ");
		System.out.println("���ڷ� ���尡���� ����: "+ Character.MIN_VALUE+"~ "+Character.MAX_VALUE);

		System.out.println("���ڷ� ���尡���� ����: "+ (Character.MIN_VALUE+0)+"~"+(Character.MAX_VALUE+0));
	
	
	}
}