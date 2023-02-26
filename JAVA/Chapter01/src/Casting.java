
public class Casting {

	public static void main(String[] args) {
		
		char charVal;
		int intVal;
		long longVal;
		float floatVal;
		double doubleVal;
		
		// char < int
		// 명시적 형변환. 넘치는지 안넘치는지 확인해야한다.
		intVal = 74;
		charVal = (char) intVal;
		System.out.println(charVal);
		
		longVal = 500;
		intVal = (int) longVal;
		System.out.println(intVal);
		
		doubleVal = 3.14;
		floatVal = (float) doubleVal;
		System.out.println(floatVal);
	}
}