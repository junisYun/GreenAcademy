package kr.green.ex0610;

import java.util.Scanner;

public class OpEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out : ǥ�� ��� ��ġ     : �����
//		System.in  : ǥ�� �Է� ��ġ     : Ű����	
//		System.err : ǥ�� ���� ��� ��ġ : �����
		
		System.out.println("���� �� ���� �Է��ϼ��� : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = x + y;
		System.out.printf("%d + %d = %d\n", x, y, z);
		z = x - y;
		System.out.printf("%d - %d = %d\n", x, y, z);
		z = x * y;
		System.out.printf("%d * %d = %d\n", x, y, z);
		z = x / y;
		System.out.printf("%d / %d = %d\n", x, y, z);
		z = x % y;
		System.out.printf("%d %% %d = %d\n", x, y, z);
		
		
		sc.close();
	}
}