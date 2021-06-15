import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int temp;
		for (int i = 0; i < m; i++) {
			temp = n;
			int cnt = 0;
			while (temp > 0) {
				temp /= 10;
				cnt++;
			}
			temp = n;
			int sum = 0;
			for(int j = 0; j < cnt; j++) {
				sum += (int)((temp % 10) * Math.pow(10, cnt - j - 1));
				temp /= 10;
			}
			System.out.println(n + " : " + sum);
			
			n += sum;
			System.out.println(n);
		}
		sc.close();
	}
}