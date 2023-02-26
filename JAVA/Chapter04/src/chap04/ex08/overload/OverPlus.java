package chap04.ex08.overload;

public class OverPlus {
	
	public int plus(int a, int b) {
		System.out.println(a+b);
		return a+b;
	}
	
	public String plus(String a, String b) {
		System.out.println(a+b);
		return a+b;
	}
	
	public String plus(String a, int b) {
		System.out.println(a+b);
		return a+b;
	}
}
