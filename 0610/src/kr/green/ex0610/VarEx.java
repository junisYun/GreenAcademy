package kr.green.ex0610;

public class VarEx {
	int i ;
	boolean gender;
	String name;
	
	public static void main(String[] args) {
		float var;
		VarEx ex = new VarEx();
		System.out.println("  i    = " + ex.i);
		System.out.println("name   = " +ex.name);
		System.out.println("gender = " +ex.gender);
		ex.name = "";
		System.out.println("name   =  " + ex.name);
		String a = ""+7;
		System.out.println(a);
		long l = 10L;
		float f = l;// 바이트 수가 적더라도 정수보다 실수가 더 큼; 그래서 저장 가능; 이게 말이 되나...?;
		
		byte b = 111;
//		int i = 2;
//		b = (byte) i;// 강제 형변환
//		System.out.println(b);
		int i = 0x11223344;
		System.out.println("i =" + i);
		b = (byte)i;
		System.out.println(Integer.toHexString(b));
		
	}
}
