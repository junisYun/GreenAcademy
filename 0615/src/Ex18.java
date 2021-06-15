import java.util.Scanner;

public class Ex18 {
	/* ���� ��� ���� 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] date = sc.nextLine().split(" ");
		int totalDay = 0;
		for(int i = 0; i < 3; i++) {
			if(i == 0) {
				totalDay += (Integer.parseInt(date[i]) - 1) * 365;
			} else if(i == 1) {
				totalDay += (Integer.parseInt(date[i]) - 1) * 30;
			} else {
				totalDay += (Integer.parseInt(date[i]));
			}
		}
		System.out.println("�� �ϼ� : " + totalDay);
		String day[] = {"��", "��", "ȭ", "��", "��", "��", "��"};
		System.out.println("�ش��ϴ� ���� : " + day[totalDay % 7]);
	} */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int yy = sc.nextInt();
		int mm = sc.nextInt();
		int dd = sc.nextInt();
		int totalDay = 0;
		totalDay += (yy - 1) * 365 + (yy - 1) / 4 - (yy - 1) / 100 + (yy - 1) / 400;
		for(int i = 1; i < mm; i++) {
			if(i == 2) {
				totalDay += (yy % 400 == 0 || yy % 100 != 0 && yy % 4 == 0) ? 29 : 28;
			} else if(i == 4 || i == 6 || i == 9 || i == 11) {
				totalDay += 30;
			} else
				totalDay += 31;
		}
		totalDay += dd;
		System.out.println("�� �ϼ� : " + totalDay);
		String week[] = {"��", "��", "ȭ", "��", "��", "��", "��"};
		System.out.println(week[totalDay % 7]);
	}
}
