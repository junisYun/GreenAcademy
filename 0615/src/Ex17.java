
public class Ex17 {
	public static void main(String[] args) {
		int cnt = 0;
		for(int i = 1; i <= 10000; i++) {
			for(char ch : Integer.toString(i).toCharArray()) {
				if(ch == '8') cnt++;
			}
		}
		System.out.println(cnt);
	}
}