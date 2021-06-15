import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n, sw;
		n = sw = 1;
		for(int i = 1; i <= num * 2 - 1; i++) {
			for(int j = 1; j <= num - n; j++) {
				System.out.print(" ");
			} 
			for(int j = 1; j <= n * 2 - 1; j++) {
				System.out.print("*");
			} 
			n += sw;
			if(i == num - 1) 
				sw *= -1;
			System.out.println();
		} 
	}
}
