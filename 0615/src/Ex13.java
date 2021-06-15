
public class Ex13 {
	public static void main(String[] args) {
		char ch = 'A';
		int k = 0;
		for(int i = 1; i <= 20; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print((char)(ch + (k % 26)) + " ");
				k++;
			}
			System.out.println();
		}
	}
}
