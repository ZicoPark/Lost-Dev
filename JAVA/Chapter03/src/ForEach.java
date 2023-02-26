
public class ForEach {

	public static void main(String[] args) {
		
		int[] score = {95,75,84,35,88};
		
		// 일반적인 for(시작과 끝을 지정할 수 있다)
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);			
		}
		
		System.out.println("====================");
		
		// 향상된 for(시작하면 모든 내용을 꺼낸다.)
		for(int s : score) {
			System.out.println(s);
		}
	}
}