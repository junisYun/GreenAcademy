package kr.green.ex0610;
//byte1 short2 int4 long8
public class IntegerTypeEx {
	public static void main(String[] args) {
		System.out.println(Byte.BYTES + "Byte");
		System.out.println(Byte.SIZE + "Bit");
		System.out.println("byte  ����: " + Byte.MIN_VALUE + "~ "+ Byte.MAX_VALUE);
		System.out.println("short ����: " + Short.MIN_VALUE + "~ "+ Short.MAX_VALUE);
		System.out.println("int   ����: " + Integer.MIN_VALUE + "~ "+ Integer.MAX_VALUE);
		System.out.println("long  ����: " + Long.MIN_VALUE + "~ "+ Long.MAX_VALUE);
		System.out.println(Long.BYTES + "Byte");
		System.out.println(Long.SIZE + "Bit");
		
		System.out.println(10/3);//10 ������ 3�� �ϸ� �����?
	}
}