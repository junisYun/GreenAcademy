import java.awt.Color;

// ��ǻ�Ϳ��� ������ �ڷ����� �����ϱ��?
// int Ÿ������ AARRGGBB�� 4����Ʈ�� ��Ÿ����.
public class Ex05 {
	public static void main(String[] args) {
		int color = 0xAABBCCDD;
		int alpha = color >>> 24;
		System.out.println("alpha = " + Integer.toHexString(alpha));
		
		int red = color >> 16 & 0xFF;
		System.out.println("red = " + Integer.toHexString(red));

		int green = color >> 8 & 0xFF;
		System.out.println("green = " + Integer.toHexString(green));
		
		int blue = color & 0xFF;
		System.out.println("blue = " + Integer.toHexString(blue));
		
		
		// ���� ����
		int color2 = 0x0;
		System.out.println("color2 = " + Integer.toHexString(color2));
		
		color2 = color2 | alpha << 24;
		System.out.println("color2 = " + Integer.toHexString(color2));

		color2 = color2 | red << 16;
		System.out.println("color2 = " + Integer.toHexString(color2));

		color2 = color2 | green << 8;
		System.out.println("color2 = " + Integer.toHexString(color2));

		color2 = color2 | blue;
		System.out.println("color2 = " + Integer.toHexString(color2));
		
		// ���� ���� �߿��� RED���� ��������
		color2 = color2 & 0xFF00FFFF;
		System.out.println("color2 = " + Integer.toHexString(color2));
		
		// RED���� 3A�� ����
		color2 = color2 | 0x003A0000;
		System.out.println("color2 = " + Integer.toHexString(color2));
		
		// BLUE���� B7���� ����
		color2 = color2 | 0x000000B7;
		System.out.println("color2 = " + Integer.toHexString(color2));
		
		
	}
}