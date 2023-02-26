package chap04.ex09.smember;

public class Main {

	public static void main(String[] args) {
		
		// 일반적으로 사용 하는 방법(객체화)
		Sub sub = new Sub();
		System.out.println("멤버 필드 : " + sub.field);
		System.out.println("멤버 메서드 : " + sub.multi(3, 4));
		
		// static 멤버 사용하는 방법(원본에 직접 접근)
		System.out.println("static 멤버 필드 : " + Sub.sField);
		System.out.println("static 멤버 메서드 : " + Sub.minus(10, 5));
		
		// 복사본에서 원본 접근이 불가능 한가? // 원래 안되지만 임시방편으로 열어준것. 정식적인 방법은 아님. 돌아가는것. 비효율적
		System.out.println("static 멤버 메서드 - 복사본에서 접근 : " + sub.plus(10, 5));
		
		// 원본과 복사본의 차이?
		Sub sub2 = new Sub();
		sub.field = 1000;
		//복사본은 서로에게 영향을 줄 수 없다
		System.out.println("sub : " + sub.field);
		System.out.println("sub2 : " + sub2.field);
		
		System.out.println("------------------------------");
		
		// static은 원본이기 때문에 변경하면 모두에게 영향을 준다
		sub.sField = 3000;
		System.out.println("sub : " + sub.sField);
		System.out.println("sub2 : " + sub2.sField);
	}
}