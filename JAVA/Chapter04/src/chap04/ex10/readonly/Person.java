package chap04.ex10.readonly;

public class Person {
	
	// final : 생성자에서 초기화가 가능하다(이후 프로그램이 종료 될 때 까지 바뀌지 않음). 초기값이 있으면 안됨
	final String nation;
	final String name;
	
	// static final : 상수, 불변의 값, 개발자가 작성하면 이후로 '변경 할 수 없다'!!. 전체 대문자로 작성해야한다	
	static final String SSN = "920520 -1111111";

	public Person(String nation, String name) { //<<생성자임. 여기다가 선언하면 객체가 생성되자마자 사라짐ㅋㅋ
		//생성자에서 final 값을 초기화 할 수 있다
		this.name = name;
		this.nation = nation;
	}
}