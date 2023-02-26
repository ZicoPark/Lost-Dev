package chap04.ex10.readonly;

public class Main {

	public static void main(String[] args) {
		
		Person p = new Person("대한민국", "PJH");
		System.out.println(p.nation);
		System.out.println(p.name);
		System.out.println(p.SSN); //S|F표시 되어있음. static이니까 이렇게 부르지마 라고 노란줄 그어짐
		System.out.println(Person.SSN);
		
		/*final은 값이 한번 들어가면 바꿀 수 없다		
		p.nation = "KOREA";
		p.name = "홍길동";
		*/
	}
}