package chap04.ex07.member;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car(); // Car의 멤버를 사용하기 위해서는 복사(객체화) 해야 한다.
		car.start();
		car.change(3);
		System.out.println("시동 상태 : " +car.on);
	}
}