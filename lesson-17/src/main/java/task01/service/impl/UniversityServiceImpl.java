package task01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import task01.dao.UniversityRepository;
import task01.domain.University;
import task01.service.UniversityService;

@Controller
public class UniversityServiceImpl implements UniversityService {

	@Autowired
	private UniversityRepository universityRepository;

	@Override
	public University save(University university) {
		return universityRepository.save(university);
	}

	@Override
	public List<University> saveAll(List<University> listOfUniversities) {
		return universityRepository.saveAll(listOfUniversities);
	}

	@Override
	public University findById(int id) {
		return universityRepository.getReferenceById(id);
	}

	@Override
	public University update(University university) {
		universityRepository.save(university);
		return null;
	}

	@Override
	public void deleteById(int id) {
		universityRepository.deleteById(id);
	}

	@Override
	public List<University> findAll() {
		return universityRepository.findAll();
	}

	@Override
	public List<University> findByName(String name) {
		return universityRepository.findByName(name);
	}

	@Override
	public List<University> findByNumberOfStudents(int numberOfStudents) {
		return universityRepository.findByNumberOfStudents(numberOfStudents);
	}

}