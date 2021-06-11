package kr.green.ex0610;

public class CharTypeEx {
	public static void main(String[] args) {
		char ch = 'A';
//		char ch2 = "A";//에러:"":는 String이다.
		char ch3 = ' ';//에러:어떤 글자라도 1개 이상 저장이 되어야 한다. 빈 칸은 가능
		char ch4 = 65; // ASCCI코드 값 65번에 해당하는 문자 저장.
		System.out.println("ch: "+ ch);
		System.out.println("ch4 : "+ ch4);
		System.out.println("ch4 : "+ (char)(ch4+32));
		
		System.out.println("ㄱ의 코드 값은 :"+(char)(55203));
		System.out.println("ㄱ의 코드 값은 :"+(int)('힇'));
		char ch6 = '\n';
		
//		\n : 개행문자, \t: 탭문자, \\ : \ 표시
		System.out.println("하" +ch6 +"하"+ch6+ch6+"호");
		System.out.println("문자로 저장가능한 범위: "+ Character.MIN_VALUE+"~ "+Character.MAX_VALUE);

		System.out.println("문자로 저장가능한 범위: "+ (Character.MIN_VALUE+0)+"~"+(Character.MAX_VALUE+0));
	
	
	}
}