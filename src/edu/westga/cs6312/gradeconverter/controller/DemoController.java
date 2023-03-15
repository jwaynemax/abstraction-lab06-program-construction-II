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
		Student sallie = new Student("Sallie Mae", 95, 1996, 6, 7);
		Student john = new Student("John Doe", 85, 1996, 6, 7);
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
				
				if (name == null) {
					throw new NullPointerException();
				}
				
				aStudent.setName(name);
				
				continueInput = false;
				
			} catch (NullPointerException ex1) {
				System.out.println("Name cannot be null. Try again.");
			} catch (IllegalArgumentException ex2) {
				System.out.println("Name cannot be an empty string or null. Try again.");
				keyboardInput.nextLine();
			}
		} while (continueInput);
		
		
		
		//student grade	
		continueInput = true;
		System.out.print("Enter a number: ");
		do {
			try {
				String gradeInput = keyboardInput.nextLine();
				int grade = Integer.parseInt(gradeInput);
				
				if (gradeInput == null) {
					throw new NullPointerException();
				}
				
				aStudent.setGrade(grade);
				continueInput = false;
				
			} catch (NullPointerException ex1) {
				System.out.println("Grade cannot be null");
				keyboardInput.nextLine();
			} catch (IllegalArgumentException ex2) {
				System.out.println("Grade cannot be less than 0 or greater than 100. Try again.");
				keyboardInput.nextLine();
			}
			
		} while (continueInput);
		
		
		//student birth year	
		continueInput = true;
		do {
			try {
				System.out.print("Enter birth year: ");
				String birthYearInput = keyboardInput.next();
				int birthYear = Integer.parseInt(birthYearInput);
				aStudent.setBirthdateYear(birthYear);
				
				if (birthYearInput == null) {
					throw new NullPointerException();
				}
				
				continueInput = false;
				
			} catch (NullPointerException ex1) {
				System.out.println("Year cannot be null");
				keyboardInput.nextLine();
			} catch (IllegalArgumentException ex2) {
				System.out.println("Year cannot be less than 1913 (100 years old). Try again.");
				keyboardInput.nextLine();
			}
			
		} while (continueInput);
		
		//student birth month	
		continueInput = true;
		do {
			try {
				
				System.out.print("Enter birth month: ");
				String birthMonthInput = keyboardInput.next();
				int birthMonth = Integer.parseInt(birthMonthInput);
				aStudent.setBirthdateMonth(birthMonth);
				
				
				if (birthMonthInput == null) {
					throw new NullPointerException();
				}
				
				continueInput = false;
				
			} catch (NullPointerException ex1) {
				System.out.println("Month cannot be null");
				keyboardInput.nextLine();
			} catch (IllegalArgumentException ex2) {
				System.out.println("Month must be between 0 (Jan) and 11 (Dec). Try again.");
				keyboardInput.nextLine();
			}
			
		} while (continueInput);
		
		//student birth year	
		continueInput = true;
		do {
			try {
				
				System.out.print("Enter birth date: ");
				String birthDateInput = keyboardInput.next();
				int birthDate = Integer.parseInt(birthDateInput);
				aStudent.setBirthdateDate(birthDate);
				
				if (birthDateInput == null) {
					throw new NullPointerException();
				}
				
				continueInput = false;
				
			} catch (NullPointerException ex1) {
				System.out.println("Date cannot be null");
				keyboardInput.nextLine();
			} catch (IllegalArgumentException ex2) {
				System.out.println("Date must be between 1 and 31. Try again.");
				keyboardInput.nextLine();
			}
			
		} while (continueInput);

		

		System.out.println(aStudent);

		keyboardInput.close();
	}
}
