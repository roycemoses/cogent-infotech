package spring_boot_intro_web_h2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spring_boot_intro_web_h2.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> { // pass in the object (Employee) and the primary key data type
	
}
