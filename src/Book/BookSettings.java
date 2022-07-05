package Book;

import java.util.ArrayList;

public class BookSettings implements IBookSettings{

	ArrayList<Book> books = new ArrayList<Book>();
	
	
	@Override
	public void addBook(Book book) {
		books.add(book);
		
	}

	@Override
	public void deleteBook(int id) {
		books.remove(id);
		
	}

	@Override
	public void updateBook(int id, Book book) {
		books.set(id, book);
		
	}

	@Override
	public void allBook() {
		if(books.isEmpty()) {
			System.out.println("You have not added any books");
		}
		else {
			for(Book bk:books) {
			bk.showBook();
			}
		}
			
		
	}

}
