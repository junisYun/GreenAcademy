package kr.green.ex0610;

public class booleanTypeEx {
	public static void main(String[] args) {
		boolean gender = true;
		System.out.println("����: "+gender);
		System.out.println("����: "+ (gender ? "����":"����"));
		System.out.println("����: "+ (!gender ? "����":"����"));
		gender = !gender;
		System.out.println("����: "+ (gender ? "����":"����"));
		gender = !gender;
		System.out.println("����: "+ (gender ? "����":"����"));
	}
}