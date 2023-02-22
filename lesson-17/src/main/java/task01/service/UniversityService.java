package task01.service;

import java.util.List;

import task01.domain.University;

public interface UniversityService {

	University save(University university);

	List<University> saveAll(List<University> listOfUniversities);

	University findById(int id);

	University update(University university);

	void deleteById(int id);

	List<University> findAll();

	List<University> findByName(String name);

	List<University> findByNumberOfStudents(int numberOfStudents);

}