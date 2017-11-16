import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class LibrarySystem {

	static int nextPublicationID = 1;
	static int nextUserID = 1;
	ArrayList<Publication> librarySystem = new ArrayList<Publication>();
	ArrayList<User> libraryUsers = new ArrayList<User>();

	public void addItem(Publication publication) {
		publication.setPublicationID(nextPublicationID++);
		librarySystem.add(publication);

	}

	public void removeItemByID(int id) {
		for (Publication publicationInSystem : librarySystem) {
			if (publicationInSystem.getPublicationID() == id) {
				librarySystem.remove(publicationInSystem);
			}
		}
	}

	public void removeItemByName(String name) {
		for (Publication publicationInSystem : librarySystem) {
			if (publicationInSystem.getPublicationName() == name) {
				librarySystem.remove(publicationInSystem);
			}
		}
	}

	public void checkInItemByID(int id) {
		for (Publication publicationInSystem : librarySystem) {
			if (publicationInSystem.getPublicationID() == id) {
				publicationInSystem.setCheckedIn(true);
			}
		}
	}

	public void checkInItemByName(String name) {
		for (Publication publicationInSystem : librarySystem) {
			if (publicationInSystem.getPublicationName() == name) {
				publicationInSystem.setCheckedIn(true);
			}
		}
	}

	public void checkOutItemByID(int id) {
		for (Publication publicationInSystem : librarySystem) {
			if (publicationInSystem.getPublicationID() == id) {
				publicationInSystem.setCheckedIn(false);
			}
		}
	}

	public void checkOutItemByName(String name) {
		for (Publication publicationInSystem : librarySystem) {
			if (publicationInSystem.getPublicationName() == name) {
				publicationInSystem.setCheckedIn(false);
			}
		}
	}

	public String showFullSystem() {
		String output = "";
		for (Publication publicationInSystem : librarySystem) {
			output += publicationInSystem.toString() + "\n";
		}
		return output;
	}

	public String showCheckedInItems() {
		String output = "";
		for (Publication publicationInSystem : librarySystem) {
			if (publicationInSystem.isCheckedIn()) {
				output += publicationInSystem.toString() + "\n";
			}
		}
		return output;
	}

	public String showCheckedOutItems() {
		String output = "";
		for (Publication publicationInSystem : librarySystem) {
			if (!publicationInSystem.isCheckedIn()) {
				output += publicationInSystem.toString() + "\n";
			}
		}
		return output;
	}

	public void updateItemByName(String name, Publication publication) {
		for (Publication publicationInSystem : librarySystem) {
			if(publicationInSystem.getPublicationName() == name) {
				int tempID = publicationInSystem.getPublicationID();
				publication.setPublicationID(tempID);
				publicationInSystem = publication;
			}
		}
	}
	
	public void updateItemByID(int ID, Publication publication) {
		for (Publication publicationInSystem : librarySystem) {
			if(publicationInSystem.getPublicationID() == ID) {
				int tempID = publicationInSystem.getPublicationID();
				publication.setPublicationID(tempID);
				publicationInSystem = publication;
			}
		}
	}

	public void addUser(User user) {
		user.setUserID(nextUserID++);
		libraryUsers.add(user);
	}

	public void removeUserByID(int id) {
		for (User userInSystem : libraryUsers) {
			if (userInSystem.getUserID() == id) {
				libraryUsers.remove(userInSystem);
			}
		}
	}

	public void removeUserByName(String name) {
		for (User userInSystem : libraryUsers) {
			if (userInSystem.getName() == name) {
				libraryUsers.remove(userInSystem);
			}
		}
	}
	
	public void updateUserByName(String name, User user) {
		for (User userInSystem : libraryUsers) {
			if(userInSystem.getName() == name) {
				int tempID = userInSystem.getUserID();
				user.setUserID(tempID);
				userInSystem = user;
			}
		}
	}
	
	public void updateUserByID(int ID, User user) {
		for (User userInSystem : libraryUsers) {
			if(userInSystem.getUserID() == ID) {
				int tempID = userInSystem.getUserID();
				user.setUserID(tempID);
				userInSystem = user;
			}
		}
	}
	
	public String showUsers() {
		String output = "";
		for (User userInSystem : libraryUsers) {
				output += userInSystem.toString() + "\n";
		}
		return output;
	}
	
	public void writeToFile(String filePath) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			fw = new FileWriter(filePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("That is not a valid file path, please enter a valid file path");
		}
		bw = new BufferedWriter(fw);

		for (Publication publicationInSystem: librarySystem) {
			try {
				bw.write(publicationInSystem.toString());
				bw.newLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {

			if (bw != null)
				bw.close();

			if (fw != null)
				fw.close();

		} catch (IOException ex) {

			ex.printStackTrace();

		}
	}
	
//	public ArrayList<Publication> readFromFile(String filePath) {
//
//		FileReader fr = null;
//		BufferedReader br = null;
//		ArrayList<String> linesFromFile = new ArrayList<String>();
//
//		try {
//			fr = new FileReader(filePath);
//		} catch (FileNotFoundException e) {
//			System.err.println("This is not a vaild file path, please enter a valid file path");
//			return null;
//		}
//		br = new BufferedReader(fr);
//		String currentLine;
//
//		try {
//			while ((currentLine = br.readLine()) != null) {
//				linesFromFile.add(currentLine);
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		try {
//
//			if (br != null)
//				br.close();
//
//			if (fr != null)
//				fr.close();
//
//		} catch (IOException ex) {
//
//			ex.printStackTrace();
//
//		}
//		
//		ArrayList<Publication> publicationsFromFile = new ArrayList<Publication>();
//
//		for (String s : linesFromFile) {
//			String[] publicationData = s.split(" / ");
//			publicationsFromFile.add(new Publication(publicationData[0], publicationData[1]);
//		}
//		
//		return peopleFromFile;
//
//	}
}
