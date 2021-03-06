import java.awt.Color;

// 컴퓨터에서 색상은 자료형이 무엇일까요?
// int 타입으로 AARRGGBB로 4바이트를 나타낸다.
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
		
		
		// 색상 결합
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
		
		// 위의 색상 중에서 RED값만 지워보자
		color2 = color2 & 0xFF00FFFF;
		System.out.println("color2 = " + Integer.toHexString(color2));
		
		// RED값을 3A로 변경
		color2 = color2 | 0x003A0000;
		System.out.println("color2 = " + Integer.toHexString(color2));
		
		// BLUE값에 B7값을 더함
		color2 = color2 | 0x000000B7;
		System.out.println("color2 = " + Integer.toHexString(color2));
		
		
	}
}
