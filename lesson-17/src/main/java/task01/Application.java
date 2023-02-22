package task01;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import task01.domain.University;
import task01.service.UniversityService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UniversityService universityService = context.getBean(UniversityService.class);
		
		List<University> listOfUniversities = new ArrayList<>();
		listOfUniversities.add(new University("Ivan Franko National University of Lviv", 4, 19, 25000,"Lviv, st. Universitetska, 1"));
		listOfUniversities.add(new University("Lviv Polytechnic National University", 4, 15, 35000,"Lviv, st. Stepan Bandera, 12"));
		listOfUniversities.add(new University("Taras Shevchenko National University of Kyiv", 4, 21, 32000,"Ukraine, Kyiv, Volodymyrska, 60"));
		listOfUniversities.add(new University("West Ukrainian National University", 4, 9, 14963,"Ukraine, Ternopil, Lvivska, 11"));
		listOfUniversities.add(new University("Odesa I. Mechnykov National University", 4, 11, 14500,"Odesa, st. Dvoryanskaya, 2"));
		universityService.saveAll(listOfUniversities);

		System.out.println("\nFindById method result:\n" + universityService.findById(1));

		System.out.println("\nfindByName method result:\n" + universityService.findByName("Lviv Polytechnic National University"));

		System.out.println("\nfindByNumberOfStudents method result:\n" + universityService.findByNumberOfStudents(14963));

		University forUpdate = universityService.findById(5);
		forUpdate.setNumberOfStudents(17000);
		universityService.update(forUpdate);
		System.out.println("\nupdate and findAll methods result:");
		universityService.findAll().stream().forEach(System.out::println);

		universityService.deleteById(4);
		System.out.println("\ndeleteById method result:");
		universityService.findAll().stream().forEach(System.out::println);

	}

}