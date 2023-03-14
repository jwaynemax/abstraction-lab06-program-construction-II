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
		System.out.print("Enter a name: ");
		String name = keyboardInput.nextLine();
	
		System.out.print("Enter a number: ");
		String gradeInput = keyboardInput.next();
		int grade = Integer.parseInt(gradeInput);

		Student aStudent = new Student(name, grade);
		System.out.println(aStudent);

		keyboardInput.close();
	}
}
