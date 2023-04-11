package one_to_many.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import one_to_many.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
