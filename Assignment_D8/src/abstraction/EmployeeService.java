package abstraction;

public interface EmployeeService {
	Employee[] getHighSalaryEmployees(Employee[] employees, double minSalary);

	double calculateAverageSalary(Employee[] employees);

	Employee getTopPaidEmployee(Employee[] employees);

	Employee[] getExperiencedEmployees(Employee[] employees, int minYears);

	Employee getTopPaidEmployeeByDepartment(Employee[] employees, String department);

	double getAverageSalaryByDepartment(Employee[] employees, String department);
}

class EmployeeServiceImp implements EmployeeService {

	@Override
	public Employee[] getHighSalaryEmployees(Employee[] employees, double minSalary) {

		int count = 0;
		for (Employee e : employees) {
			if (e.sal >= minSalary) {
				count++;
			}
		}

		Employee[] result = new Employee[count];
		int index = 0;

		for (Employee e : employees) {
			if (e.sal >= minSalary) {
				result[index++] = e;
			}
		}
		return result;
	}

	@Override
	public double calculateAverageSalary(Employee[] employees) {
		double sum = 0;
		for (Employee e : employees) {
			sum += e.sal;
		}
		return sum / employees.length;
	}

	@Override
	public Employee getTopPaidEmployee(Employee[] employees) {
		Employee top = employees[0];

		for (Employee e : employees) {
			if (e.sal > top.sal) {
				top = e;
			}
		}
		return top;
	}

	@Override
	public Employee[] getExperiencedEmployees(Employee[] employees, int minYears) {

		int count = 0;
		for (Employee e : employees) {
			if (e.experience >= minYears) {
				count++;
			}
		}

		Employee[] result = new Employee[count];
		int index = 0;

		for (Employee e : employees) {
			if (e.experience >= minYears) {
				result[index++] = e;
			}
		}
		return result;
	}

	@Override
	public Employee getTopPaidEmployeeByDepartment(Employee[] employees, String department) {

		Employee top = null;

		for (Employee e : employees) {
			if (e.department.equals(department)) {
				if (top == null || e.sal > top.sal) {
					top = e;
				}
			}
		}
		return top;
	}

	@Override
	public double getAverageSalaryByDepartment(Employee[] employees, String department) {

		double sum = 0;
		int count = 0;

		for (Employee e : employees) {
			if (e.department.equals(department)) {
				sum += e.sal;
				count++;
			}
		}
		return count == 0 ? 0 : sum / count;
	}
}
