package edu.westga.cs6312.gradeconverter;

import java.io.IOException;

import edu.westga.cs6312.gradeconverter.controller.DemoController;

/**
 * Entry point for the program.
 * 
 * @author CS 6312
 * @version Spring 2023
 */
public class Main {

	/**
	 * Default entry point for the program.
	 * 
	 * @param args command line arguments for the program
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		DemoController demo = new DemoController();
		System.out.println("Started running the demo.");

		demo.run();

		System.out.println("\nFinished running the demo.\n"
				+ "(If you see this printed it means the program terminated correctly,\n"
				+ "and no unexpected errors/exceptions stopped the execution prematurely.)");
	}

}
