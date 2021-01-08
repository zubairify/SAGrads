import java.util.HashMap;
import java.util.LinkedList;

public class PersonCollection {

	public static void main(String[] args) {
		
		LinkedList<Person>  people = new LinkedList<Person>();
		
		people.add(new Person("Jack", 20));
		people.add(new Person("Polo", 21));
		people.add(new Person("Lili", 19));
		
		for (Person p : people) 
			System.out.println(p);
		
		HashMap<String, Person> map = new HashMap<String, Person>();
		map.put("john", new Person("John", 20));
		map.put("duke", new Person("Duke", 21));
		
		for (String key : map.keySet()) 
			System.out.println(map.get(key));
	}
}
