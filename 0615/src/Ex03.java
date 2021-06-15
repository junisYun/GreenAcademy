
public class Ex03 {
	public static void main(String[] args) {
		int x = 0;
		while (x < 10) {
			int i, j, n;
			i = j = n = 0;
			int sw = 1;
			while (i < 19) {
				j = 0;
				while (j <= n) {
					System.out.print("¡Ú");
					j++;
				}
				System.out.println();
				if (i == 9)
					sw *= -1;
				i++;
				n += sw;
			}
			x++;
		}
	}
}
