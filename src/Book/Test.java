package Book;


public class Test {

	
	public static void main(String[] args) {
	
		Autor author = new Autor("autor", 2,"as");
		Book book = new Book("aa", 1,"des", author , new Publisher("publisher Name 1","Publisher Asdress 1"));
		Book book1 = new Book("aa", 2,"des", author , new Publisher("publisher Name 2","Publisher Asdress 2"));
		
		
		
		BookSettings bs = new BookSettings();
		System.out.println("books");
		
		bs.addBook(book);
		bs.addBook(book1);
		bs.deleteBook(1);
		
		bs.updateBook(0, book1);
		
		bs.allBook();
		
		

	}

}
