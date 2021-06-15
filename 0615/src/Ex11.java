
public class Ex11 {
	public static void main(String[] args) {
		int i = 1, sum = 0;
		while(i <= 100) sum += i++;
		System.out.println("1 ~ 100까지 합 : " + sum);
		
		i = sum = 0;
		do {
			sum += ++i;
		} while(i < 100);
		System.out.println("1 ~ 100까지 합 : " + sum);
		
		sum = 0;
		for(i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1 ~ 100까지 합 : " + sum);
		
		i = sum = 0;
		for(; i < 100; ) {
			sum += ++i;
		}
		System.out.println("1 ~ 100까지 합 : " + sum);
		
		i = sum = 0;
		for(;;) {
			sum += ++i;
			if(i == 100) break;
		}
		System.out.println("1 ~ 100까지 합 : " + sum);
	}	
}
