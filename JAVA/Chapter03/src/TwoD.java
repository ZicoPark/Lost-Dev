
public class TwoD {

	public static void main(String[] args) {
		
		// 2개 층 4개 호
		int[][] arr = {
				{00,01,02,03},
				{10,11,12,13}
		};
		
		// 4개 층 4개 호
		String[][] royal = new String[4][4];
		royal[0][0] = "0층 0호";
		System.out.println("층 : " + royal.length );
		System.out.println("호 : " + royal[0].length);
		
		royal[0][0] = "0층 0호";
		royal[0][1] = "0층 1호";
		royal[0][2] = "0층 2호";
		royal[0][3] = "0층 3호";
		
		System.out.println(royal[0][1]);
		System.out.println(royal[0][2]);
		System.out.println(royal[0][3]);
				
		for (int i = 0; i < royal.length; i++) {
			//System.out.println(i + "층");
			for (int j = 0; j < royal[i].length; j++) {
				////System.out.println(j + "호");
				royal[i][j]=i +"층" + j+"호";
				System.out.println(royal[i][j]);
			}
		}
	}
}