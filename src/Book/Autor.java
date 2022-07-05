package Book;

public class Autor {
	private String AutorName;
	private int AutorOld;
	private String AutorCity;
	
	
	
	public Autor() {
	}

	public Autor(String autorName, int autorOld, String autorCity) {
		AutorName = autorName;
		AutorOld = autorOld;
		AutorCity = autorCity;
	}

	public String getAutorName() {
		return AutorName;
	}

	public void setAutorName(String autorName) {
		AutorName = autorName;
	}
	public int getAutorOld() {
		return AutorOld;
	}
	public void setAutorOld(int autorOld) {
		AutorOld = autorOld;
	}

	public String getAutorCity() {
		return AutorCity;
	}

	public void setAutorCity(String autorCity) {
		AutorCity = autorCity;
	}
	
	public void showAutor() {
		System.out.println("AutorName: "+ getAutorName() + "\nAutorOld: " + getAutorOld() + "\nAutorCity: "+ getAutorCity());
	}
}
