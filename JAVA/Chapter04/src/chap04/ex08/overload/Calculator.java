package chap04.ex08.overload;

public class Calculator {
	
	String Stringplus(String a, String b) {
		return a+b;
	}
	
	int intplus(int a, int b) {
		return a+b;
	}
	
	String stint(String a, int b) {
		return a+b;
	}
}
