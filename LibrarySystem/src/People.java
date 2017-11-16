
public abstract class People {
	
	private String name;
	private int age;
	private String gender;
	private String postCode;
	private int userID;
	
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	
	public People(String name, int age, String gender, String postCode, int userID) {
		super();
		this.userID = userID;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.postCode = postCode;
	}
	
	@Override
	public String toString() {
		return userID + " / " + name + " / " + age + " / " + gender + " / " + postCode;
	}
}
