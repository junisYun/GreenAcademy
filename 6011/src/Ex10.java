	
public class Ex10 {
	public static void main(String[] args) {
		// 반올림 함수 : Math.round()
		int p = 6578963;
		System.out.println(p);
		System.out.println(p / 10 * 10 + " : " + p % 10);
		System.out.println(p / 100 * 100 + " : " + p % 100);
		System.out.println(p / 1000 * 1000 + " : " + p % 1000);
		System.out.println(p / 10000 * 10000 + " : " + p % 10000);
		System.out.println();
		
		double d = 56789.56789;
		System.out.println("d = " + d);
		System.out.println("d = " + Math.round(d));
		
		//소수 셋째 자리에서 반올림
		System.out.println("d = " + Math.round(d * 100) / 100.0);
		//소수 넷째 자리에서 반올림
		System.out.println("d = " + Math.round(d * 1000) / 1000.0);
		//소수 다섯째 자리에서 반올림
		System.out.println("d = " + Math.round(d * 10000) / 10000.0);
		
		System.out.println("d = " + Math.round(d / 10) * 10);
		//8이상 올림 7이하 버림
		
		int m = 5677;
		System.out.println("m = " + Math.round((m + 2) / 10) * 10);
		m = 5678;
		System.out.println("m = " + Math.round((m + 2) / 10) * 10);
		m = 5675;
		System.out.println("m = " + Math.round((m + 2) / 10) * 10);
		m = 5679;
		System.out.println("m = " + Math.round((m + 2) / 10) * 10);
		m = 5673;
		System.out.println("m = " + Math.round((m + 2) / 10) * 10);
		m = 5672;
		System.out.println("m = " + Math.round((m + 2) / 10) * 10);
		m = 5670;
		System.out.println("m = " + Math.round((m + 2) / 10) * 10);
		
		System.out.println((10 ^ 10) == 0);
	}
}
