
public class Ex14 {
	public static void main(String[] args) {
		int answer = 0;
		for(int i = 1; i <= 10000; i++) {
			int j = i;
			while(j > 0) {
				if(j % 10 == 8) answer++;
				j /= 10;
			}
		}
		System.out.println(answer);
	}

}
