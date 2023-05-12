package user_app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user")
public class User {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id; // try to generate using uuid
	private String firstName;
	private String lastName;
	private String email;
	private String imageURL;
	
	// AllArgsConstructor (EXCLUDES Auto-Generated primary key: ID) 
	public User(String firstName, String lastName, String email, String imageURL)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.imageURL = imageURL;
	}
	
}
