package chap04.ex05.init;

public class Main {

	public static void main(String[] args) {
		
		Puppy p1 = new Puppy();
		// 최초 생성시 값을 줄 수 있다. 초기화.
		Puppy p2 = new Puppy("멍멍이", "집지키기");
		System.out.println("이름: " + p2.name);
		System.out.println("목적: " + p2.goal);
	}
}