
public class Car {
	private String model;
	private String[] features;
	
	public Car(String model, String...features) {	// ... represents var-args
		this.model = model;
		this.features = features;
	}
	
	public void specs() {
		System.out.println("Features of " + model);
		for (String f : features) 
			System.out.println(f);
	}
	
	public static void main(String[] args) {
		String[] altof = {"Power Window", "Power Steering", "A/C"};
		Car alto = new Car("Alto", altof);
		alto.specs();
		
		Car x1 = new Car("BMW X1", "Key less", "Pano Roof", "ABS", "Rear Cam");
		x1.specs();
	}
}
