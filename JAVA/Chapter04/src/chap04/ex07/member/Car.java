package chap04.ex07.member;

public class Car {
	
	int gear;
	boolean on;

	public Car() {
		gear = 0; //this 굳이 쓸 필요까진 없음
		on = false;
	}
	
	void start() {
		if (on == false) {
			System.out.println("시동이 걸렸습니다.");
			on = true;			
		} else {
			System.out.println("이미 시동이 걸려 있습니다.");
		}		
	}
	
	void change(int gear) {
		System.out.println(gear +"단으로 변속 했습니다.");
		this.gear = gear; // 이경우엔 써야함. 받아온기어 = 변수기어
	}
}
