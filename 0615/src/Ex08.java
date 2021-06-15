
public class Ex08 {
	public static void main(String[] args) {
		int i = 2, count = 0;
		while(i <= 100) {
			int j = 1;
			int cnt = 0;
			while(j <= i) {
				if(i % j == 0) cnt++;
				j++;
			}
			if(cnt == 2) {
				System.out.print(i + " ");
				count++;
				if(count % 5 == 0) {
					System.out.println();
				}
			}
			i++;
		}
	}
}
