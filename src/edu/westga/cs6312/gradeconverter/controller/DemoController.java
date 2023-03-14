package edu.westga.cs6312.gradeconverter.controller;

import java.util.Scanner;

import edu.westga.cs6312.gradeconverter.model.Student;

/**
 * The Class DemoController.
 * 
 * @author justinmaxwell
 * @version 3/10/23
 */
public class DemoController {

	/**
	 * Demos functionality
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public void run() {
		Student sallie = new Student("Sallie Mae", 95);
		Student john = new Student("John Doe", 85);
		System.out.println(sallie);
		System.out.println(john);

		this.demoReadingInput();
	}

	/**
	 * Demos reading prompting and converting data for purposes of exception
	 * handling
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public void demoReadingInput() {

		Scanner keyboardInput = new Scanner(System.in);
		Student aStudent = new Student();
		
		//student name
		boolean continueInput = true;
		System.out.print("Enter a name: ");
		
		do {
			try {
				String name = keyboardInput.nextLine();
				aStudent.setName(name);
				continueInput = false;
				
			} catch (IllegalArgumentException ex) {
				System.out.println("Name cannot be null. Try again.");
				keyboardInput.nextLine();
			}
		} while (continueInput);
		
		//student grade	
		continueInput = true;
		System.out.print("Enter a number: ");
		do {
			try {
				String gradeInput = keyboardInput.next();
				int grade = Integer.parseInt(gradeInput);
				aStudent.setGrade(grade);
				continueInput = false;
				
			} catch (IllegalArgumentException ex) {
				System.out.println("grade must be >= 0 and <= 100. Try again.");
				keyboardInput.nextLine();
			}
			
		} while (continueInput);

//		Student aStudent = new Student(name, grade);
		System.out.println(aStudent);

		keyboardInput.close();
	}
}
