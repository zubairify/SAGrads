
public class StringDemo {
	
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = "Hello";
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		s1 = s1 + "World";
		System.out.println(s1);
		System.out.println(s1.length());
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.charAt(5));
		
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 6));
		
		String s4 = "hello";
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		String week = "sun-mon-tue-wed-thu-fri-sat";
		String[] days = week.split("-");
		for (String day : days) 
			System.out.println(day);
		
	}
}
