
public class Dvd implements Publication{

	private int publicationID;
	private String publicationName;
	private String publisher;
	private String datePublished;
	private boolean checkedIn;
	private String genre;
	private int runtime;
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
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	public Dvd(int publicationID, String publicationName, String publisher, String datePublished, boolean checkedIn,
			String genre, int runtime) {
		super();
		this.publicationID = publicationID;
		this.publicationName = publicationName;
		this.publisher = publisher;
		this.datePublished = datePublished;
		this.checkedIn = checkedIn;
		this.genre = genre;
		this.runtime = runtime;
	}
	
	public String toString() {
		return publicationID + " / " + publicationName + " / " + publisher + " / " + datePublished + " / " + genre + " / " + runtime;
	}
	
}
