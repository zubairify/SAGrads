import com.lti.org.Employee;
import com.lti.org.Executive;
import com.lti.org.Manager;

public class TestEmployee {

	public static void main(String[] args) {
//		Employee e1 = new Employee("Polo", 5000);
//		e1.payslip();
//		System.out.println("Emp Salary: " + e1.getSalary());
//		
//		Employee e2 = new Employee("Mili", 7000);
//		e2.payslip();
//		
//		Manager m1 = new Manager("Mona", 10000, 3000);
//		m1.payslip();
//		System.out.println("Mgr Salary: " + m1.getSalary());
//		
//		Executive ex1 = new Executive("Roy", 8000, 2000);
//		ex1.payslip();
//		System.out.println("Exec Salary: " + ex1.getSalary());
		
		Manager m1 = new Manager("Mona", 10000, 3000);
		
		Executive e1 = new Executive("Roy", 8000, 2000);
		
		printSalary(m1);
		printSalary(e1);
	}

	// Polymorphism
	private static void printSalary(Employee e) {
		System.out.println("Emp Salary: " + e.getSalary());
	}
	
	// Method Overloading
//	private static void printSalary(Executive e1) {
//		System.out.println("Exec Salary: " + e1.getSalary());
//	}
//
//	private static void printSalary(Manager m1) {
//		System.out.println("Mgr Salary: " + m1.getSalary());
//	}
	
}
