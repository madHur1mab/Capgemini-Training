package abstraction;
import java.util.*;

public class EmployeeDriver {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of employees: ");
		int n = sc.nextInt();

		Employee[] employees = new Employee[n];

		for (int i = 0; i < n; i++) {

			System.out.println("\nEnter details of employee " + (i + 1));

			System.out.print("ID: ");
			int id = sc.nextInt();

			System.out.print("Name: ");
			String name = sc.next();

			System.out.print("Salary: ");
			double sal = sc.nextDouble();

			System.out.print("Department: ");
			String department = sc.next();

			System.out.print("Experience (years): ");
			int experience = sc.nextInt();

			employees[i] = new Employee(id, name, sal, department, experience);
		}

		
		EmployeeService service = new EmployeeServiceImp();


		System.out.print("\nEnter minimum salary: ");
		double minSalary = sc.nextDouble();

		Employee[] highSalaryEmps = service.getHighSalaryEmployees(employees, minSalary);

		System.out.println("\nEmployees with salary >= " + minSalary);
		for (Employee e : highSalaryEmps) {
			System.out.println(e.id + " " + e.name + " " + e.sal);
		}

		System.out.println("\nAverage Salary of all employees: " + service.calculateAverageSalary(employees));


		Employee top = service.getTopPaidEmployee(employees);
		System.out.println("\nTop Paid Employee:");
		System.out.println(top.id + " " + top.name + " " + top.sal);

		
		System.out.print("\nEnter minimum experience: ");
		int minYears = sc.nextInt();

		Employee[] experiencedEmps =
				service.getExperiencedEmployees(employees, minYears);

		System.out.println("\nEmployees with experience >= " + minYears);
		for (Employee e : experiencedEmps) {
			System.out.println(e.id + " " + e.name + " " + e.experience);
		}

		System.out.print("\nEnter department name: ");
		String dept = sc.next();

		Employee deptTop = service.getTopPaidEmployeeByDepartment(employees, dept);

		if (deptTop != null) {
			System.out.println("\nTop paid employee in " + dept + " department:");
			System.out.println(deptTop.id + " " + deptTop.name + " " + deptTop.sal);
		} else {
			System.out.println("\nNo employee found in " + dept + " department");
		}

		System.out.println("\nAverage salary in " + dept + " department: " + service.getAverageSalaryByDepartment(employees, dept));
	}
}
