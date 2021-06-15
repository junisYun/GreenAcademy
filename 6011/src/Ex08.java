
public class Ex08 {
	public static void main(String[] args) {
		byte a = 11;
		byte b = 20;
		byte c = (byte) (a + b);
		System.out.println(c);
		
		double avg = ((double)a + b) / 2;
		System.out.println(avg);
		
		int x = 1000000;
		int y = 2000000;
		long c1 = (long)x * y;
		System.out.println(c1);
		
		long z = 1000000 * 1000000L;
		System.out.println(z);
		
		char ch1 = 'a';
		char ch2 = 'b';
		System.out.println("" + ch1 + ch2);
	}
}
