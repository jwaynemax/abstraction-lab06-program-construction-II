package edu.westga.cs6312.gradeconverter.model;

/**
 * Defines a student
 * 
 * @author justinmaxwell
 * @version 3/10/23
 */
public class Student {
	private static final String GRADE_OUT_OF_RANGE = "grade must be >= 0 and <= 100";
	private String name;
	private int grade;

	/**
	 * Creates a new Student with the specified name and grade.
	 * 
	 * @precondition name!=null && !name.isEmpty() && grade >=0 && grade <= 100
	 * @postcondition getName() == name && getGrade() == grade
	 * 
	 * @param name  name of the student
	 * @param grade the students numeric grade (between 0 and 100, inclusive)
	 */
	public Student(String name, int grade) {
		this.setName(name);
		this.setGrade(grade);
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
			throw new IllegalArgumentException("grade must be greater than or equal to 0 and less than or equal to 100 ");
		}
	
		this.grade = gradeUpdate;
	}

	/**
	 * Returns the Student's name
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return the Student's name
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
			throw new IllegalArgumentException("name cannot be null or empty");
		}
	
		this.name = nameUpdate;
	}

	@Override
	public String toString() {
		return this.name + ": " + this.grade;
	}

}
