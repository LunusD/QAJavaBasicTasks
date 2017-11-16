
public class Newspaper implements Publication {

	private int publicationID;
	private String publicationName;
	private String publisher;
	private String datePublished;
	private boolean checkedIn;
	private int noOfPages;
	private String headline;

	public int getPublicationID() {
		return publicationID;
	}

	public void setPublicationID(int publicationID) {
		this.publicationID = publicationID;
	}

	public String getPublicationName() {
		return publicationName;
	}

	public void setPublicationName(String publicationName) {
		this.publicationName = publicationName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getDatePublished() {
		return datePublished;
	}

	public void setDatePublished(String datePublished) {
		this.datePublished = datePublished;
	}

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public Newspaper(int publicationID, String publicationName, String publisher, String datePublished,
			boolean checkedIn, int noOfPages, String headline) {
		super();
		this.publicationID = publicationID++;
		this.publicationName = publicationName;
		this.publisher = publisher;
		this.datePublished = datePublished;
		this.checkedIn = checkedIn;
		this.noOfPages = noOfPages;
		this.headline = headline;
	}
	
	public String toString() {
		return publicationID + " / " + publicationName + " / " + publisher + " / " + datePublished + " / " + noOfPages + " / " + headline;
	}

}
