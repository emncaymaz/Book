package Book;

public class Book {
	
	private String bookName;
	private int isbnNo;
	private String description;
	private Autor autor;
	private Publisher publisher;
	
	
	
	
	
	public Book() {}

	
	
	
	public Book(String bookName, int isbnNo, String description, Autor autor, Publisher publisher) {
		this.bookName = bookName;
		this.isbnNo = isbnNo;
		this.description = description;
		this.autor = autor;
		this.publisher = publisher;
	}

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getIsbnNo() {
		return isbnNo;
	}
	public void setIsbnNo(int isbnNo) {
		this.isbnNo = isbnNo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}


	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public void showBook() {
		System.out.println("BookName: " + getBookName() + "\nIsbnNo: " + getIsbnNo() +
							"\nDescription: "  + getDescription() + "\nPublisherName: "+ getPublisher().getPublisherName() +
							"\nPublisherAdress: "+ getPublisher().getPublisherAddress() + "\nAutorName: " + getAutor().getAutorName());
		System.out.println("_____________________________________________");
	}

}
