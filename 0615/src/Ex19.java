import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("생일을 공백으로 구분하여 입력하시오 (년도가 0이면 종료)");

			int yy = sc.nextInt();
			int mm = sc.nextInt();
			int dd = sc.nextInt();
			System.out.println("지금까지 일 수 : " + (getDay(2021,6,15) - getDay(yy,mm,dd)));
		}
	}

	private static int getDay(int yy, int mm, int dd) {
		int totalDay = 0;
		totalDay += (yy - 1) * 365 + (yy - 1) / 4 - (yy - 1) / 100 + (yy - 1) / 400;
		for (int i = 1; i < mm; i++) {
			if (i == 2) {
				totalDay += (yy % 400 == 0 || yy % 100 != 0 && yy % 4 == 0) ? 29 : 28;
			} else if (i == 4 || i == 6 || i == 9 || i == 11) {
				totalDay += 30;
			} else
				totalDay += 31;
		}
		totalDay += dd;
		return totalDay;
	}
}
