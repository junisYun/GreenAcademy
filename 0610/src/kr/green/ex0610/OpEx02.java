package kr.green.ex0610;

import java.util.Scanner;

public class OpEx02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�޿� �Է��ϸ� ȭ�� ������ �ż��� ��� �ؼ� ������ִ� ���α׷�;
//		
//		int p = sc.nextInt();
//		int oMan = p/50000;
//		int man = (p-(oMan*50000))/10000;
//		int oChun = ((p-(oMan*50000))-man*10000)/5000;
//		int chun = (((p-(oMan*50000))-man*10000)-oChun*5000)/1000;
//		int dongJeon = p%1000;
//		
//		
//		
//		System.out.println("50,000 ���� :" +oMan+"��");
//		System.out.println("10,000 ���� :" +man+"��");
//		System.out.println("5,000 ����  :" +oChun+"��");
//		System.out.println("1,000 ����  :" +chun+"��");
//		System.out.println("�� ��       :" + dongJeon+"��");

		int m[] = {100000, 50000, 10000, 5000,1000, 500,100,50,10,5,1};

		System.out.println("������ �Է��ϼ���:  ");
		
		int p = sc.nextInt();
		for(int i = 0 ; i< m.length; i++) {
			System.out.printf("%6d���� : %2d��\n", m[i], p/m[i]);
			p %= m[i];
		}
		
		
		
		sc.close();
	}
}