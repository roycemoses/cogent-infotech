package application;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		return e1.getEmployeeName().compareTo(e2.getEmployeeName());
	}
}