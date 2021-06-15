import java.util.Scanner;
public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.print("약수 : ");
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) System.out.print(i + " ");
		} System.out.println();
		
		int m = sc.nextInt();
		int cnt = 0;
		for(int i = 1; i <= m; i++) {
			if(m % i == 0) cnt++;
		}
		System.out.println(cnt == 2 ? "소수" : "소수아님");
	}

}