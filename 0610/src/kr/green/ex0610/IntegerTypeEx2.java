package kr.green.ex0610;
//byte1 short2 int4 long8
public class IntegerTypeEx2 {
	public static void main(String[] args) {
			int a = 10;
			int b = 0b10;
			int c = 010;
			int d = 0x10;
//			접두어에 따른 값의 변화
//			숫자가 1~9 로 시작되면 10진수
//			숫자가 0B로 시작되면 2진수로 인식
//			숫자가 0 으로 시작하면 8진수
//			숫자가 0x로 시작하면 16진수
//			대소문자 구분 x (0B나 0b나 같음)
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			
//			long e = 0L;// 뒤에 L, 1이 붙으면 long형이 된다.
//			double f = 9L;// 가능.
			byte e = 0;
			e++;
			System.out.println(e);
	}
}
