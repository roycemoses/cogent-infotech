package spring_boot_intro_web_h2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import spring_boot_intro_web_h2.entity.Employee;

@Service
public interface EmployeeService {

	Employee saveEmployee(Employee employee);
	List<Employee> fetchEmployees();
	
	
}
