package kr.green.ex0610;

import java.util.Scanner;

public class OpEx02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//급여 입력하면 화폐 단위별 매수를 계산 해서 출력해주는 프로그램;
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
//		System.out.println("50,000 원권 :" +oMan+"매");
//		System.out.println("10,000 원권 :" +man+"매");
//		System.out.println("5,000 원권  :" +oChun+"매");
//		System.out.println("1,000 원권  :" +chun+"매");
//		System.out.println("동 전       :" + dongJeon+"원");

		int m[] = {100000, 50000, 10000, 5000,1000, 500,100,50,10,5,1};

		System.out.println("월급을 입력하세요:  ");
		
		int p = sc.nextInt();
		for(int i = 0 ; i< m.length; i++) {
			System.out.printf("%6d원권 : %2d매\n", m[i], p/m[i]);
			p %= m[i];
		}
		
		
		
		sc.close();
	}
}
