package inheritance.assisted_prob.employee_management;

public class EmployeeManagement {
	public static void main(String[] args) {
		Employee manager = new Manager("Alice", 101, 80000, 10);
        Employee developer = new Developer("Bob", 102, 60000, "Java");
        Employee intern = new Intern("Charlie", 103, 20000, 6);

        // Display employee details
        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
        System.out.println();
        intern.displayDetails();
	}
}
