
public class Ex02 {
	public static void main(String[] args) {
		int x = 10, y = 20;
		
		//교환 전
		System.out.println("x = " + x + ", y = " + y);
		int temp = x;
		x = y;
		y = temp;
		
		//교환 후
		System.out.println("x = " + x + ", y = " + y);
		
		
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println("x = " + x + ", y = " + y);
		
		swap(x, y);
		System.out.println("x = " + x + ", y = " + y);
		
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("x = " + x + ", y = " + y);
	}
	
	public static void swap(int x, int y) {
		int temp = 0;
		temp = x;
		x = y;
		y = temp;
		
	}
}