package kr.green.ex0610;

import java.util.Scanner;

public class OpEx04 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			while(true) {
			
				System.out.println("년도를 입력하시오: ");
				int year = sc.nextInt();
				if (year == 0 ) break;
				//입력된 년도가 평년인지 윤년인지 판단해보자.
				System.out.println(year+"년은 "+( year%4==0 && year%100!=0 || year%400==0 ? "윤":"평")+"년 입니다.");
				
				
			}
			
			sc.close();
	}
}
