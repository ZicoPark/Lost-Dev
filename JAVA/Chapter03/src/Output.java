
public class Output {

	public static void main(String[] args) {
		
		int scores[] = new int[10];
		
		scores[0] = 10; //0~9까지 넣어보자 10단위로
		
		for (int i = 0; i < scores.length; i++) {
			scores[i] =10*(i+1);
			System.out.println((i+1)*10);			
		}
		
		System.out.println("0번 방의 값 : " + scores[0]);
		System.out.println("5번 방의 값 : " + scores[5]);
		System.out.println("9번 방의 값 : " + scores[9]);
		
		// 0~9까지 다 꺼내 확인하기
		for (int i = 0; i < scores.length; i++) {
			System.out.println("["+ i +"]" + scores[i]);
		}
		
		
		
		

	}

}
