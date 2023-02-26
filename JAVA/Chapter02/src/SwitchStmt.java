
public class SwitchStmt {

	public static void main(String[] args) { // 연산자는 동일. if문 동일. Switch에서 차이점 기술
		
		String item = "식혜";

		switch (item) { //JDK 1.6이하에서는 switch 문 값이 숫자만 들어가야 한다
			case "식혜":
				System.out.println("식혜가 나왔습니다.");
				break;

			default:
				System.out.println("해당 제품이 없습니다.");
		}
	}
}