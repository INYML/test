package test;

public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book(100,"±à³Ì");
		book1.showInfo();
		Book book2 = new Book("Java",100,"±à³Ì");
		book2.showInfo();
		

	}

}
