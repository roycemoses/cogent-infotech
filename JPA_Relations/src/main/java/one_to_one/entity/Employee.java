package one_to_one.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity // you can save this object into the DB
@Table(name="employee")  // mention the table name to insert object
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // primary key
	private long id;
	private String name;
	private String email;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL) // one to one
	@JoinColumn(name="up_id") // two tables created: employee and passport. creates a relation between two tables
	private Passport passport; // passport has a foreign key
	// FetchType.LAZY: when we load the employee, we don't want to load the passport details
	// FetchType.EAGER: when we load the employee, we do want to load the passport details
	// CascadeType.ALL: Changes we make to this object will reflect in the child table
		// ex: Update name & expiry at the same time
		// ex2: Delete this object and its child objects (passport) get deleted
	// JoinColumn(name="up_id"): In the database, a new column with the name "up_id" shows the foreign key (passport ID) 
	
	public Employee() {
	
	}
	
	public Employee(long id, String name, String email, Passport passport) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.passport = passport;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	
	
	
	
}
