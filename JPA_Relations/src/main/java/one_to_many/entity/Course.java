package one_to_many.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String course_name;
	private float course_fee;
	
	public Course() {
		
	}

	public Course(String course_name, float course_fee) {
		this.course_name = course_name;
		this.course_fee = course_fee;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public float getCourse_fee() {
		return course_fee;
	}

	public void setCourse_fee(float course_fee) {
		this.course_fee = course_fee;
	}
	
	
	
}
