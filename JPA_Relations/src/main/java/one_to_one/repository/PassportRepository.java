package one_to_one.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import one_to_one.entity.Passport;

public interface PassportRepository extends JpaRepository<Passport, Long> {

}
