
public class ThreeD {

	public static void main(String[] args) {
		// 3개 층 3개 호 2개 방
		String[][][] apt = new String[3][3][2];
		System.out.println("층 : " + apt.length);
		System.out.println("호 : " + apt[0].length);
		System.out.println("방 : " + apt[0][0].length);
		
		apt[1][2][1] = "철수의 방";
		apt[0][0][0] = "영희의 방";		
		
		// "철수의 방" 과 "영희의 방" 을 제외하고 나머지 방은 "공실"이라고 값을 넣는다
		for (int i= 0;  i< apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				for (int k = 0; k < apt[i][j].length; k++) {											
					if (apt[i][j][k] == null) {
						apt[i][j][k] = "공실";	
					}																				
					System.out.println(apt[i][j][k]);
				}
			}
		}						
	}
}