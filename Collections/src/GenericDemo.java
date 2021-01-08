
public class GenericDemo<Z> {
	private Z data;

	public GenericDemo(Z data) {
		this.data = data;
	}

	public Z getData() {
		return data;
	}

	public void setData(Z data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		GenericDemo<String> g1 = new GenericDemo<String>("Hello");
		System.out.println(g1.getData());
//		g1.setData(99);
		
		GenericDemo<Integer> g2 = new GenericDemo<Integer>(100);
		System.out.println(g2.getData());
//		g2.setData("Hi");
	}
}
