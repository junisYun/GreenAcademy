package kr.green.ex0610;

import java.util.Scanner;

public class OpEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out : 표준 출력 장치     : 모니터
//		System.in  : 표준 입력 장치     : 키보드	
//		System.err : 표준 에러 출력 장치 : 모니터
		
		System.out.println("정수 두 개를 입력하세요 : ");
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
