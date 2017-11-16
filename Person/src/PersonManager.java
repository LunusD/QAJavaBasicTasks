import java.util.ArrayList;

public class PersonManager {
	
    public ArrayList<Person> people = new ArrayList<Person>();
	
    public Person search(String searchedName) {
    	Person p = null;
		for(Person person : people) {
			if(person.getName().equals(searchedName)) {
				p = person;
			}
		}
		return p;
	}

}
