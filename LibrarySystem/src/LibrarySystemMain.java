import java.util.Date;

public class LibrarySystemMain {
	
	public static void main (String[] args) {
		
		Date date = new Date();
		
		LibrarySystem mySystem = new LibrarySystem();
		
		Publication book1 = new Book(0,"Ice ice baby","penguin", "3rd September 2012",  true, 300, 40, "Horror");
		Publication paper1 = new Newspaper(0,"Metro","penguin", "3rd September 2012",  false, 300, "Horror on the docks!");
		Publication book2 = new Book(0,"Ice ice baby3","penguin", "3rd September 2012",  true, 300, 40, "Horror");
		Publication book3 = new Book(0,"Ice ice baby3","penguin", "3rd September 2012",  true, 300, 40, "Horror");
		User user1 = new User(0, "john", 21, "male", "postcode", date.toString(), null);
		
		mySystem.addItem(book1);
		mySystem.addItem(paper1);
		mySystem.addItem(book2);
		mySystem.addItem(book3);
		
		mySystem.checkOutItemByName("Ice ice baby");
		mySystem.addUser(user1);
		
		
		System.out.println(mySystem.showFullSystem());
		System.out.println(mySystem.showCheckedInItems());
		
		System.out.println(mySystem.showUsers());
		
		mySystem.writeToFile("library.txt");
	}

}
