package kr.green.ex0610;

import java.util.Scanner;

public class OpEx03 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("���� 1���� �Է��Ͻÿ�: ");
			int n = sc.nextInt();
			if (n>0) {
				System.out.println(n + "��(/��) "+ (n%2==0 ? "¦": "Ȧ")+"�� �Դϴ�.");
			}
			else System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			sc.close();
	}
}
