
public class Demo {
	private Object data;

	public Demo(Object data) {
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		Demo d1 = new Demo(500);
		d1.setData("Hey");
		System.out.println(d1.getData());
		
		Demo d2 = new Demo("Hola");
		d2.setData(200);
		System.out.println(d2.getData());
	}
}
