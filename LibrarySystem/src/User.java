import java.util.ArrayList;

public class User extends People{
	
	private String dateJoined;
	private ArrayList<Publication> checkedOutItems;
	
	public String getDateJoined() {
		return dateJoined;
	}

	public void setDateJoined(String dateJoined) {
		this.dateJoined = dateJoined;
	}

	public ArrayList<Publication> getCheckedOutItems() {
		return checkedOutItems;
	}

	public void setCheckedOutItems(ArrayList<Publication> checkedOutItems) {
		this.checkedOutItems = checkedOutItems;
	}
	
	public User(int userID, String name, int age, String gender, String postCode,  String dateJoined, ArrayList<Publication> checkedOutItems) {
		super(name, age, gender, postCode, userID);
		this.dateJoined = dateJoined;
		this.checkedOutItems = checkedOutItems;
	}
	
	public String toString() {
		return super.toString() + " / " + dateJoined;
	}

}
