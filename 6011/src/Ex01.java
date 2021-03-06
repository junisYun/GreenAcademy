
public class Ex01 {
	public static void main(String[] args) {
		int x = 3, y = 5;
		int z = x | y;
		System.out.println(x + " | " + y + " = " + z);
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		System.out.println(Integer.toBinaryString(z));
		System.out.println();
		
		z = x & y;
		System.out.println(x + " & " + y + " = " + z);
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		System.out.println(Integer.toBinaryString(z));
		System.out.println();
		
		z = x ^ y;
		System.out.println(x + " ^ " + y + " = " + z);
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		System.out.println(Integer.toBinaryString(z));
		System.out.println();
		
		z = ~x;
		System.out.println("~x" + " = " + z);
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		System.out.println(Integer.toBinaryString(z));
		System.out.println();
		
		z = y + (~x + 1); // y - x ?? ????
		System.out.println(y + " - " + x + " = " + z);
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		System.out.println(Integer.toBinaryString(z));
		System.out.println();
		
		z = x << 3;
		System.out.println(x + " & " + y + " = " + z);
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		System.out.println(Integer.toBinaryString(z));
		System.out.println();
		

		z = 1 << 10;
		System.out.println(z);
		
		System.out.println(Integer.parseInt(Integer.toBinaryString(x), 2));
	}
}
