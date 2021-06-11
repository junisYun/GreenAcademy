
public class Ex06 {
	public static void main(String[] args) {
		char[] n = {0x4444,0x00F0, 0x04E0, 0x4640, 0x4620, 0x6220, 0x0660}; // 0x4640;
		
		for(int x = 0; x < n.length; x++) {
		int mask = 0x8000; // ÀÌÁø¼ö : 1000 0000
		for(int i = 0; i < 16; i++) {
			System.out.print((n[x] & mask) == mask ? "¡á " : "  ");
			if((i + 1) % 4 == 0) System.out.println();
			mask = mask >> 1;
		}
		System.out.println();
		}
	}
}