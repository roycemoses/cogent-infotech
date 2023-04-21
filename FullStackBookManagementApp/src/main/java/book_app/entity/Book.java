package book_app.entity;

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
@Table(name="USER_TABLE")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private float price;
	
	// AllArgsConstructor (EXCLUDES Auto-Generated primary key: ID) 
	public Book(String name, float price)
	{
		this.name = name;
		this.price = price;
	}
	
}
