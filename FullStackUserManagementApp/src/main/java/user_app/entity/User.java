package user_app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private int age;
	private int salary;
	
	// AllArgsConstructor (EXCLUDES Auto-Generated primary key: ID) 
	public User(String name, int age, int salary)
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
}
