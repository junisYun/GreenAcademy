package kr.green.ex0610;

public class booleanTypeEx {
	public static void main(String[] args) {
		boolean gender = true;
		System.out.println("성별: "+gender);
		System.out.println("성별: "+ (gender ? "남자":"여자"));
		System.out.println("성별: "+ (!gender ? "남자":"여자"));
		gender = !gender;
		System.out.println("성별: "+ (gender ? "남자":"여자"));
		gender = !gender;
		System.out.println("성별: "+ (gender ? "남자":"여자"));
	}
}
