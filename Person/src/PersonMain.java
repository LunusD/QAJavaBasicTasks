
public class PersonMain {

	public static void main(String[] args) {
		
		PersonManager personManager = new PersonManager();
		
		Person john = new Person("John", 30, "Builder");
		Person james = new Person("James", 22, "Student");
		Person sarah = new Person("Sarah", 48, "Policewoman");
		
		personManager.people.add(john);
		personManager.people.add(james);
		personManager.people.add(sarah);
		
		for(Person person : personManager.people) {
			System.out.println(person.toString());
		}
		 Person foundPerson = personManager.search("John");
		 if(foundPerson != null) {
			 System.out.println(foundPerson);
		 } else {
			 System.out.println("Person not found");
		 }
		 

	}

}


