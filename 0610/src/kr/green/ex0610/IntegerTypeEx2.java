package kr.green.ex0610;
//byte1 short2 int4 long8
public class IntegerTypeEx2 {
	public static void main(String[] args) {
			int a = 10;
			int b = 0b10;
			int c = 010;
			int d = 0x10;
//			���ξ ���� ���� ��ȭ
//			���ڰ� 1~9 �� ���۵Ǹ� 10����
//			���ڰ� 0B�� ���۵Ǹ� 2������ �ν�
//			���ڰ� 0 ���� �����ϸ� 8����
//			���ڰ� 0x�� �����ϸ� 16����
//			��ҹ��� ���� x (0B�� 0b�� ����)
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			
//			long e = 0L;// �ڿ� L, 1�� ������ long���� �ȴ�.
//			double f = 9L;// ����.
			byte e = 0;
			e++;
			System.out.println(e);
	}
}