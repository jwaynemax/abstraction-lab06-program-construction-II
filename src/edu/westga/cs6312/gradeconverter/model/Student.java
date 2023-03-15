package edu.westga.cs6312.gradeconverter.model;

import java.sql.Date;

/**
 * Defines a student
 * 
 * @author justinmaxwell
 * @version 3/10/23
 */
public class Student {
	private static final String GRADE_OUT_OF_RANGE = "grade must be >= 0 and <= 100";
	private static final String INVALID_NAME = "name cannot be null or empty";
	private static final String INVALID_YEAR = "Year cannot be greater than 1913";
	private static final String INVALID_MONTH = "Month must be >= 0 and <= 11";
	private static final String INVALID_DATE = "Month must be >= 1 and <= 31";
	private String name;
	private int grade;
	private Date birthdate = new Date(0, 10, 10);

	/**
	 * Creates a new Student with the specified name and grade.
	 * 
	 * @precondition name!=null && !name.isEmpty() && grade >=0 && grade <= 100
	 * @postcondition getName() == name && getGrade() == grade
	 * 
	 * @param name  name of the student
	 * @param grade the students numeric grade (between 0 and 100, inclusive)
	 * @param year
	 * @param month
	 * @param date
	 */
	public Student(String name, int grade, int year, int month, int date) {
		this.setName(name);
		this.setGrade(grade);
		this.setBirthdateYear(year);
		this.setBirthdateMonth(month);
		this.setBirthdateDate(date);
	}
	
	/**
	 * 0-param constructor
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public Student() {
		
	}

	/**
	 * Returns the Student's grade
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return the Student's grade
	 */
	public int getGrade() {
		return this.grade;
	}

	/**
	 * Update the grade
	 * 
	 * @precondition grade must be >= 0 and <= 100
	 * @postcondition this.grade == gradeUpdate
	 * 
	 * @param gradeUpdate
	 */
	public void setGrade(int gradeUpdate) {
		
		if (gradeUpdate < 0 || gradeUpdate > 100) {
			throw new IllegalArgumentException(GRADE_OUT_OF_RANGE);
		}
	
		this.grade = gradeUpdate;
	}

	/**
	 * Returns the Student's name
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return the Student's grade
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Update the name
	 * 
	 * @precondition name!=null && !name.isEmpty()
	 * @postcondition this.name == nameUpdate
	 * 
	 * @param nameUpdate
	 */
	public void setName(String nameUpdate) {
	
		if (nameUpdate == null || nameUpdate.isEmpty()) {
			throw new IllegalArgumentException(INVALID_NAME);
		}
	
		this.name = nameUpdate;
	}
	
	/**
	 * Returns the Student's birthdate
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return the Student's birthdate
	 */
	public Date getBirthdate() {
		return this.birthdate;
	}
	
	/**
	 * set students birth year
	 * 
	 * @precondition year > 1913
	 * @postcondition this.birthdate = setYear
	 * 
	 * @param year
	 */
	public void setBirthdateYear(int year) {
		if (year < 1914) {
			throw new IllegalArgumentException(INVALID_YEAR);
		}
		this.birthdate.setYear(year - 1900);
	}
	
	/**
	 * set students birth month
	 * 
	 * @precondition month => 0 || month <= 11
	 * @postcondition this.birthdate = setMonth
	 * 
	 * @param month
	 */
	public void setBirthdateMonth(int month) {
		if (month < 0 || month > 11) {
			throw new IllegalArgumentException(INVALID_MONTH);
		}
		this.birthdate.setMonth(month);
	}
	
	/**
	 * set students birth date
	 * 
	 * @precondition date >= 1 || month <= 31
	 * @postcondition this.birthdate = setDate
	 * 
	 * @param date
	 */
	public void setBirthdateDate(int date) {
		if (date < 1 || date > 31) {
			throw new IllegalArgumentException(INVALID_DATE);
		}
		this.birthdate.setDate(date);
	}
	

	@Override
	public String toString() {
		return this.name + ": " + this.grade + ", Birthdate: " + this.birthdate;
	}

}
