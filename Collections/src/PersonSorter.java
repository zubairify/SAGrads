import java.util.TreeSet;

public class PersonSorter {

	public static void main(String[] args) {
		PersonNameComparator pnc = new PersonNameComparator();
		PersonAgeComparator pac = new PersonAgeComparator();
		
		TreeSet<Person> people = new TreeSet<Person>();
		people.add(new Person("Jack", 20));
		people.add(new Person("Polo", 21));
		people.add(new Person("Lili", 19));
		
		for (Person p : people) 
			System.out.println(p);
	}
}
