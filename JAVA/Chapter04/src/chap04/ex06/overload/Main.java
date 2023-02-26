package chap04.ex06.overload;

public class Main {

	public static void main(String[] args) {
		
		NoteBook note = new NoteBook();
		NoteBook note1 = new NoteBook("GRAM");
		NoteBook note2 = new NoteBook("MAC-BOOK", 3000000);
		NoteBook note3 = new NoteBook("NOTE","white");
		NoteBook note4 = new NoteBook("gamming", "black", 3300000);
	}
}