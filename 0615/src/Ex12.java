
public class Ex12 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		for(i = 1; sum < 10000; i++) {
			sum += i;
			System.out.println(i + ", " + sum);
		}
		System.out.println(i);
		
		for(i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println(i);
	}
}