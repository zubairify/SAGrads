
public class Manager extends Employee {
	private double commission;

	public Manager() {
		// Optional call, anyways Child class always calls the default constructor of parent class
		super();	// Calling default constructor of super class
	}

	public Manager(String empName, double salary, double commission) {
		super(empName, salary);	// Calling parameterised constructor of super class
		this.commission = commission;
	}

	@Override
	public void payslip() {
		super.payslip();	// Calling payslip() of Employee class
		System.out.println("Commission: " + commission);
	}

	@Override
	public double getSalary() {
		return super.getSalary() + commission;
	}
	
}
