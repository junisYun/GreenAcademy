package kr.green.ex0610;											//\\
																   //  \\
import java.util.Scanner;										  //	\\
																 //		 \\
public class OpEx05 {											//        \\
	public static void main(String[] args) {				   //		   \\
//		Scanner sc = new Scanner(System.in);				  //			\\
//		System.out.print("���� �� �Է� �ٶ� : ");				 //				 \\
		int x, y;											//				  \\
		x = y = 10;		
		
											         	   //  				   \\
//		int z = x + y ;									  //					\\
//		int sum = x+y+z;								 //					 	 \\
//		int avg = sum/3;								//						  \\
//		System.out.printf("avg = %d\n", avg);		   //						   \\
//		System.out.printf("sum = %d", sum); 		  //							\\
//		sc.close();									 //								 \\
		int z = x==y? ++x : y++ ;                   //								  \\
		System.out.printf("%d, %d, %d\n",x,y,z);   //								   \\
		z = x==++y || ++x==++y ? x:y;			  //OR�� ��� ���� ���� ���̸� �ڴ� ����� �ȵ�.  \\								\\
		System.out.printf("%d, %d, %d\n",x,y,z); //AND�� ��� ���� ���� �����̸� �ڴ� ������� ����.\\
												
	}
}