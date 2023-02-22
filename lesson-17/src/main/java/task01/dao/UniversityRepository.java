package task01.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import task01.domain.University;

@Repository
public interface UniversityRepository extends JpaRepository<University, Integer> {

	List<University> findByName(String name);

	List<University> findByNumberOfStudents(int numberOfStudents);

}