
public class Toaster {

	void main(String[] args) { //함수(X) 메서드(O) - 문제를 해결해내가는 방법
		// 매개변수 : 문자열 배열
		// 반환값 : 없음(void가 return 되는 타입이 없음을 의미하기 때문)
		String dish = toaster("식빵");
		System.out.println(dish);
	}
	
	String toaster(String 빵) {
		// 매개변수 : 문자열
		// 반환값 : 문자열
		return "구워진 빵";
	}
}