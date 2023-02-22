package task01.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class University {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column
	private String name;

	@Column
	private int accreditationLevel;

	@Column
	private int numberOfFaculties;

	@Column
	private int numberOfStudents;

	@Column
	private String universityAddress;

	public University() {

	}

	public University(String name, int accreditationLevel, int numberOfFaculties, int numberOfStudents,String universityAddress) {
		this.name = name;
		this.accreditationLevel = accreditationLevel;
		this.numberOfFaculties = numberOfFaculties;
		this.numberOfStudents = numberOfStudents;
		this.universityAddress = universityAddress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccreditationLevel() {
		return accreditationLevel;
	}

	public void setAccreditationLevel(int accreditationLevel) {
		this.accreditationLevel = accreditationLevel;
	}

	public int getNumberOfFaculties() {
		return numberOfFaculties;
	}

	public void setNumberOfFaculties(int numberOfFaculties) {
		this.numberOfFaculties = numberOfFaculties;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public String getUniversityAddress() {
		return universityAddress;
	}

	public void setUniversityAddress(String universityAddress) {
		this.universityAddress = universityAddress;
	}

	@Override
	public String toString() {
		return "Univercity id = " + id + ", name = " + name + ", accreditationLevel = " + accreditationLevel
				+ ", numberOfFaculties = " + numberOfFaculties + ", numberOfStudents = " + numberOfStudents
				+ ", universityAddress = " + universityAddress;
	}

}