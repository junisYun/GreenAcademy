package kr.green.ex0610;

public class DoubleTypeEx {
	public static void main(String[] args) {
//		float f = 3.14;
		float f = 3.14f;
		double d = 3.14;
		System.out.println(f);
		System.out.println(d);
		
		System.out.println(10/3);
		System.out.println(10/3.);
		System.out.println(10/3.0);
		System.out.println((double)10/3);
		System.out.println((float)10/3);//��ȿ �ڸ���
		System.out.printf("%.3f\n", (float)10/3);
		System.out.format("%.3f\n", (float)10/3);
		
	}
}
