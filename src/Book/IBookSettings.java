package Book;

public interface IBookSettings {
	
	void addBook(Book book);
	void deleteBook(int id);
	void updateBook(int id, Book book);
	void allBook();

}
