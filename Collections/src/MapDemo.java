import java.util.HashMap;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("scott", "tiger");
		map.put("jack", "jill");
		map.put("sun", "java");
		map.put("jack", "rose");
		
		System.out.println(map.get("scott"));
		System.out.println(map.get("sun"));
		System.out.println(map.get("jack"));
		
		// Getting all the keys of map
		Set<String> keys = map.keySet();
		for (String k : keys) 
			System.out.println(k + " = " + map.get(k));
		
	}
}
