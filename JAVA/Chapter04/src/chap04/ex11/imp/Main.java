package chap04.ex11.imp;

import chap04.ex08.overload.OverPlus;

public class Main {

	public static void main(String[] args) {
		
		// 같은 패키지는 import 문이 필요없다.
		Info info = new Info();
		System.out.println(info.age);
		System.out.println(info.job);
		
		// 다른패키지의 클래스 호출시 import 문 필요
		OverPlus over = new OverPlus();
		
		// 다른패키지의 클래스를 불러왔지만 메서드는 쓸 수 없다??? -> 진짜 쓰지말라는이야기임;;
		System.out.println(over.plus(3, 4)); //OverPlus파일 계산하는곳에 public(접근제한자) 붙이니까 작동
		// 접근 제한자 : 특정 멤버의 접근 영역을 제한한다
		// public : 아무제한x
		// default : 같은 패키지만 사용 가능
		// private : 클래스 안에서만 사용 가능
	}
}
