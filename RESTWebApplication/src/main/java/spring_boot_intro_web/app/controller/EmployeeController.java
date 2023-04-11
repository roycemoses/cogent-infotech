package spring_boot_intro_web.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {

	@GetMapping("/employee")
	public String display()
	{
		return "Employee[id=1001, name=\"Royce\", salary=950]";
	}
	
}
