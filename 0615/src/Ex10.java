/* �����佺�׳׽� ü */
/* 2 ~ 100 �� �Ҽ� ���ϱ� */
public class Ex10 {
	public static void main(String[] args) {
		boolean[] arr = new boolean[101];
		for(int i = 2; i < arr.length; i++) arr[i] = true;
		for(int i = 2; i * i <= 100; i++) {
			for(int j = i * i; j <= 100; j += i) {
				arr[j] = false;
			}
		}
		for(int i = 2; i < arr.length; i++) {
			if(arr[i]) System.out.println(i);
		}
	}
}
