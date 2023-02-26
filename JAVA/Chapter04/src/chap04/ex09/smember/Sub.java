package chap04.ex09.smember;

public class Sub { // class
	
	// member field	
	// static 입력하는순간 sField 이탤릭체됨. 마우스오버시 빨간색 s아이콘
	// 빨간색 s아이콘 : static member : 원본 영역에 저장
	static int sField = 134; 
	int field = 0;
	
	// member method	
	static int plus(int a, int b) {
		return a+b;
	}
	
	static int minus(int a, int b) {
		return a-b;
	}
	
	int multi(int a, int b) {
		return a*b;
	}
}