package chap04.ex12.prv;

public class Computer {
	
	private boolean power;
	private int panSpeed;
	private int temp;
	
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getTemp() {
		return temp;
	}
	public void setPanSpeed(int panSpeed) {
		this.panSpeed = panSpeed;
		// 받아온 팬 속도로 온도를 조절
		this.temp = 110 - this.panSpeed;
	}	
	// private 필드 중에서 가져오거나, 변경하고 싶은 것들은 getter()또는 setter()메서드를 활용해서 가능하다(Alt+Shift+S)
}