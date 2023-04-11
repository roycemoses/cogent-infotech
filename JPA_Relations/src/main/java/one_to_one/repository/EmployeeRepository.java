package one_to_one.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import one_to_one.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
