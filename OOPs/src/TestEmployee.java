
public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee("Polo", 5000);
		e1.payslip();
		System.out.println("Emp Salary: " + e1.getSalary());
		
		Employee e2 = new Employee("Mili", 7000);
		e2.payslip();
		
		Manager m1 = new Manager("Mona", 10000, 3000);
		m1.payslip();
		System.out.println("Mgr Salary: " + m1.getSalary());
	}
}
