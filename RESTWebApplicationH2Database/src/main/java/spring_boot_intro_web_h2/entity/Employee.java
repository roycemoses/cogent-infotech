package spring_boot_intro_web_h2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empID;// sets empID to primary key
	private String empName;
	private String empAddress;
	private String empPhone;
	
//	public Employee() {
//		
//	}
//	
//	public Employee(Long empID, String empName, String empAddress, String empPhone) {
//		super();
//		this.empID = empID;
//		this.empName = empName;
//		this.empAddress = empAddress;
//		this.empPhone = empPhone;
//	}

//	public Long getEmpID() {
//		return empID;
//	}
//
//	public void setEmpID(Long empID) {
//		this.empID = empID;
//	}
//
//	public String getEmpName() {
//		return empName;
//	}
//
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
//
//	public String getEmpAddress() {
//		return empAddress;
//	}
//
//	public void setEmpAddress(String empAddress) {
//		this.empAddress = empAddress;
//	}
//
//	public String getEmpPhone() {
//		return empPhone;
//	}
//
//	public void setEmpPhone(String empPhone) {
//		this.empPhone = empPhone;
//	}

	
	
}
