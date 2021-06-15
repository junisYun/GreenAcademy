import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Base = ");
			int width = sc.nextInt();
			System.out.print("Height = ");
			int height = sc.nextInt();
			System.out.println("Triangle width = " + Math.round(width * height / 2.0 * 10) / 10.0);
			
			System.out.print("Continue? ");
			char retry = sc.next().charAt(0);
			if(retry != 'Y' && retry != 'y') break;
		}
	}
}
