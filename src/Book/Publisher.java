package Book;


public class Publisher {
	private String PublisherName;
	private String PublisherAddress;
	
	
	
	public Publisher() {
	}



	public Publisher(String publisherName, String publisherAddress) {
		PublisherName = publisherName;
		PublisherAddress = publisherAddress;
	}



	public String getPublisherName() {
		return PublisherName;
	}



	public void setPublisherName(String publisherName) {
		PublisherName = publisherName;
	}



	public String getPublisherAddress() {
		return PublisherAddress;
	}



	public void setPublisherAddress(String publisherAddress) {
		PublisherAddress = publisherAddress;
	}
	
	public void showPublisher() {
		System.out.println("PublisherName: "+ getPublisherName() + "\nPublidsherAddress: " + getPublisherAddress());
	}

	
}
