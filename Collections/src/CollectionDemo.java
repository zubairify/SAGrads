import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionDemo {
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		
		v.add("Apple");
		v.add("Google");
		v.add("Oracle");
		v.add("Microsoft");
		v.add("Amazon");
		v.add("Google");
		
		System.out.println("-- Traversing over Vector using Iterator");
		Iterator<String> itr = v.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("-- Traversing over Vector using For..loop");
		for(int i=0; i<v.size(); i++)
			System.out.println(v.get(i));
		
		System.out.println("-- Traversing over Vector using For-each..loop");
		for(String s : v)
			System.out.println(s);
		
		ArrayList<String> lst = new ArrayList<String>();
		lst.add("Apache");
		lst.add("IBM");
		lst.addAll(v);	// Merging vector into array list
		lst.add(4, "Facebook");	// Adding element at specific index
		lst.remove(8);	// Removing elements at specified index
		
		System.out.println("-- Traversing over ArrayList using For-each..loop");
		for(String s : lst)
			System.out.println(s);
		
		// Converting List collection in Set collection
		HashSet<String> set = new HashSet<String>(lst);
		System.out.println("-- Traversing over HashSet using For-each..loop");
		for(String s : set)
			System.out.println(s);
		
		// Converting Set into SortedSet
		TreeSet<String> tree = new TreeSet<String>(set);
		System.out.println("-- Traversing over TreeSet using For-each..loop");
		for(String s : tree)
			System.out.println(s);
		
		tree.forEach(System.out::println);
	}
}
