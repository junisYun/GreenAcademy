
public class Ex03 {
	//쉬프트 연산자
	public static void main(String[] args) {
		int n = 1;
		System.out.println(n);
		
		n = n << 5;
		System.out.println(n);
		
		n = 32;
		System.out.println("n = " + n);
		System.out.println("n = " + (n >>> 1));
		System.out.println("n = " + (n >>> 2));
		
		n = -32;
		System.out.println("n = " + n);
		System.out.println("n = " + (n >> 1));
		System.out.println("n = " + (n >> 2));
		
		n = -32;
		System.out.println("n = " + n);
		System.out.println("n = " + Integer.toBinaryString(n));
		System.out.println("n = " + (n >>> 1));
		System.out.println("n = " + (n >>> 2));
		
		int x = 10;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.parseInt(Integer.toBinaryString(x), 2));
	}
}
