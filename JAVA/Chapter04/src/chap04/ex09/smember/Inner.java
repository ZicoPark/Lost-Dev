package chap04.ex09.smember;

public class Inner {

	public static void main(String[] args) { // static member
		
		// 같은 클래스에서는 그냥 메서드를 호출하면 된다.
		// 자바스크립트때 function 호출하는것과 유사
		stMsg("정적 멤버 호출");
		
		// 같은 클래스라 하더라도 저장영역이 다르면 불러올 수 없다.
		// 이 경우 같은 클래스라 하더라도 영역이 다르면 일반 멤버는 복사해서 써야 한다.
		
		Inner inner = new Inner();
		inner.heapMsg("일반 멤버 호출");
		
	}
	
	static void stMsg(String msg) {
		System.out.println("static member method : " + msg);
	}
	
	void heapMsg(String msg) {
		System.out.println("member method : " + msg);
		// 같은 클래스라도 다른 영역이면 정적 멤버는 원본으로 접근해서 써야한다
		Inner.stMsg("일반 멤버가 부르는 정적 멤버");
	}
}