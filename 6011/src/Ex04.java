import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("0 ~ 255������ ���� �Է�(0�� ����)");
			int n = sc.nextInt();
			if(n == 0) break;
			if(n < 0 || n > 255) {
				System.out.println("��Ȯ�� ���� �Է����ּ���.");
				continue;
			}
			int mask = 0x80; // ������ : 1000 0000
			for(int i = 0; i < 8; i++) {
				System.out.print((n & mask) == mask ? "1" : "0");
				mask = mask >> 1;
			}
			System.out.println();
		}
	}
}