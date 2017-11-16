import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileReadWrite {

	public String writeToFile(ArrayList<Person> peopleToFile, String filePath) {

		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			fw = new FileWriter(filePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("That is not a valid file path, please enter a valid file path");
			return null;
		}
		bw = new BufferedWriter(fw);

		for (Person person : peopleToFile) {
			try {
				bw.write(person.toString());
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

		return "Write complete!";
	}

	public ArrayList<Person> readFromFile(String filePath) {

		FileReader fr = null;
		BufferedReader br = null;
		ArrayList<String> linesFromFile = new ArrayList<String>();

		try {
			fr = new FileReader(filePath);
		} catch (FileNotFoundException e) {
			System.err.println("This is not a vaild file path, please enter a valid file path");
			return null;
		}
		br = new BufferedReader(fr);
		String currentLine;

		try {
			while ((currentLine = br.readLine()) != null) {
				linesFromFile.add(currentLine);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {

			if (br != null)
				br.close();

			if (fr != null)
				fr.close();

		} catch (IOException ex) {

			ex.printStackTrace();

		}
		
		ArrayList<Person> peopleFromFile = new ArrayList<Person>();

		for (String s : linesFromFile) {
			String[] personData = s.split(", ");
			peopleFromFile.add(new Person(personData[0], Integer.parseInt(personData[1]), personData[2]));
		}
		
		return peopleFromFile;

	}

}
