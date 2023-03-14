package edu.westga.cs6312.gradeconverter.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.westga.cs6312.gradeconverter.model.Student;

class TestStudent {
	
	private Student myStudent;

	@BeforeEach
	void setUp() throws Exception {
		this.myStudent = new Student("John", 95);
	}

	@AfterEach
	void tearDown() throws Exception {
		this.myStudent = null;
	}

	@Test
	void testGetName() {
		assertEquals("John", this.myStudent.getName(), "Testing get name");

	}
	
	@Test
	void testGetGrade() {
		assertEquals(95, this.myStudent.getGrade(), "Testing get grade");

	}
	
	@Test
	void testInvalidGrade() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.myStudent = new Student("John", -4);
		});

	}
	
	@Test
	void testInvalidName() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.myStudent = new Student("", 40);
		});

	}
	
	@Test
	void testNullName() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.myStudent = new Student(null, 40);
		});

	}
	
	@Test
	void testGraterThanGrade() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.myStudent = new Student("John", 200);
		});

	}

}
