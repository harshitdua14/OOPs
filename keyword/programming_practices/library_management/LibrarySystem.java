package keyword.programming_practices.library_management;

public class LibrarySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Book book1 = new Book("978-3-16-148410-0", "Java Programming", "RK Singh");
	     Book book2 = new Book("978-0-262-13472-9", "Data Structures", "SP Shukla");

	     book1.displayBookDetails();
	     book2.displayBookDetails();
	     Book.displayLibraryName();

	}

}
