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
		this.myStudent = new Student("John", 95, 1996, 6, 7);
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
			this.myStudent = new Student("John", -4, 1996, 6, 7);
		});

	}
	
	@Test
	void testInvalidName() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.myStudent = new Student("", 40, 1996, 6, 7);
		});

	}
	
	@Test
	void testNullName() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.myStudent = new Student(null, 40, 1996, 6, 7);
		});

	}
	
	@Test
	void testGreaterThanGrade() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.myStudent = new Student("John", 200, 1996, 6, 7);
		});

	}
	
	@Test
	void testInvalidYear() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.myStudent = new Student("John", 20, 1900, 6, 7);
		});

	}
	
	@Test
	void testInvalidMonth() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.myStudent = new Student("John", 20, 1996, 13, 7);
		});

	}
	
	@Test
	void testInvalidDate() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.myStudent = new Student("John", 20, 1996, 9, 133);
		});

	}

}
