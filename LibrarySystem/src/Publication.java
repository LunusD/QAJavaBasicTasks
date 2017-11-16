
public interface Publication {
	
	static int nextID = 1;
	
	public boolean isCheckedIn();
	public void setCheckedIn(boolean checkedIn);
	public String getPublisher();
	public void setPublisher(String publisher);
	public String getDatePublished();
	public void setDatePublished(String datePublished);
	
	public String getPublicationName();
	public void setPublicationName(String publicationName);
	
	public int getPublicationID();
	public void setPublicationID(int publicationID);
	
}
