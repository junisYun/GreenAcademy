import java.util.Scanner;
public class Ex06 {
	public static void main(String[] args) {
		int n = 1;
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
				sum += j;
			}
			System.out.println();
		}
		System.out.println(sum);
		
		int i = 1;
		int sum2 = 0;
		sum = sum2 = 0;
		while(i <= 100) {
			sum += i;
			sum2 += sum;
			i++;
		}
		System.out.println(sum2);
		
	}
}
