package kr.green.ex0610;

import java.util.Scanner;

public class OpEx04 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			while(true) {
			
				System.out.println("�⵵�� �Է��Ͻÿ�: ");
				int year = sc.nextInt();
				if (year == 0 ) break;
				//�Էµ� �⵵�� ������� �������� �Ǵ��غ���.
				System.out.println(year+"���� "+( year%4==0 && year%100!=0 || year%400==0 ? "��":"��")+"�� �Դϴ�.");
				
				
			}
			
			sc.close();
	}
}