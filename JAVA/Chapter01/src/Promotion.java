
public class Promotion {

	public static void main(String[] args) {
		
		// 묵시적 형변환(Promotion) 작은->큰
		// 일단 초반에는 우클릭후 Java application으로 실행하는것을 추천
		
		byte byteVal;
		char charVal = 'a';
		
		int intVal = 0;
		long longVal;
		float floatVal;
		double doubleVal;
		
		// byte < int
		byteVal = 10;
		intVal = byteVal;
		
		// char < int
		intVal = charVal;
		System.out.println(intVal);
		
		// int < long
		longVal = intVal;
		
		// float < double
		floatVal = 0.01f;
		doubleVal = floatVal;
	}
}
