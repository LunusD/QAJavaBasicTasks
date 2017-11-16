import java.util.ArrayList;

public class ReadWriteMain {
	
	public static void main(String[] args) {

		FileReadWrite fileReadWriter = new FileReadWrite();

		String filePath = "C:\\Users\\Admin\\Desktop\\file.txt";

		ArrayList<Person> peopleToFile = new ArrayList<Person>();

		peopleToFile.add(new Person("James", 22, "Ace Pilot"));
		peopleToFile.add(new Person("Joe", 21, "Daredevil"));
		peopleToFile.add(new Person("Andy", 22, "Pelican Handler"));
		peopleToFile.add(new Person("Lucy", 12, "Child"));
		peopleToFile.add(new Person("Dan", 60, "Profession Weightlifter"));

		System.out.println(fileReadWriter.writeToFile(peopleToFile, filePath));

		ArrayList<Person> peopleFromFile = fileReadWriter.readFromFile(filePath);
		for (Person person : peopleFromFile) {
			System.out.println(person.toString());
		}
	}

}
