package edu.gatech.tests;

import java.util.HashMap; // Used HashMap on Part 1
import java.util.HashSet; // Used HashSet on Part 1
import java.util.ArrayList; // Used ArrayList on Part 1

import edu.gatech.Constants; // Completed in part 1
import edu.gatech.GradesDB; // To be refined in part 3
import edu.gatech.Student; // Refine the Student.Java file in part 3
import edu.gatech.Project; // To be added in part 3
import edu.gatech.GradesToolGui; // To be added in part 3
import edu.gatech.Team; // To be added in part 3
import edu.gatech.Session; // Add a session in part 3 to account for the specific users session

import junit.framework.TestCase; // Add the jUnit test case

/*
 * These are tests for the Assignment class. The main class is the AssignmenTest class.
 * The Assignment class holds information about a particular assignment, including (Requirement 1) the number of assignments, 
 * the assignment number, the assignment description (Requirement 2) list of student grades, and (Requirement 3) average grade
 * Note that I commented excessively (more than would normally be done) for organization & to help aid in understanding 
 * an rationale for the tests (in the absence of actual code to work with or test against)
 * @Nathaniel Payne
 */

public class AssignmentTest extends TestCase { // Create the basic assignment class and extend the test case
	private Session session = null; // Create an empty session object
	GradesDB db = null; // Set the db equal initially to null

	protected void setUp() throws Exception {
		session = new Session(); // Create an empty session object
		session.login(Constants.USERNAME, Constants.PASSWORD); // Get the username and password from the user
		db = session.getName(Constants.GRADES_DB); // Get the name from the database 
		super.setUp();
	}

	protected void tearDown() throws Exception { // Create the new teardown class
		session.logout(); // Logout of the session
		super.tearDown(); // Teardown the session
	}
	
	// Requirement 1: Test that a specific assignment is in the assignment list
	// This is essential for robustness. In order for this to be the case, one can pick a random assignment
	// And test that this assignment is in the assignments list. In this situation, I will test assignment 2
	public void testCorrectAssignmentNumber() { // Create a new test to look for the number of assignments 
		ArrayList<Assignment> assignments = null; // Create a new empty assignment listing that is null
		try {
			assignments = db.getAssignments(); // Get the assignments information from the database
			boolean assignmentexists = false; // Set the initial boolean value for the assignment to false
			for (Assignment assignment : assignments) {
				if (assignment.getAssignmentNumber() == 1) {
					assignmentexists = true; // If the assignment is found, then change assignmentexists to true
					break; // Break once the loop ends here
				} // End if
			} // End for 
			assertTrue(assignmentexists); // Logical check to confirm that the assignment does actually exist

		} catch (Exception e) { // Catch an exception and return it
			fail("Exception");
		}
	}

	// Requirement 1: Test that information about a particular assignment is correct. In this case, test that the
	// assignment size is correct and that there are 3 assignments (as noted on the GradeBookSheet)
	public void testNumberOfAssignments() { // Create a test to test the number of assignments 
		ArrayList<Assignment> assignments = null; // Create an empty array list
		try { // Get the assignments from the grade book
			assignments = db.getAssignments();
		} catch (Exception e) { // If it fails provide an exception
			fail("Exception");
		}		
		assertEquals(3, assignments.size()); // Test that there are 3 assignments (the swiki page, software prototype, etc.)
	}
		
	// Requirement 2: Test that the student list for each assignment is correct
	// Specifically, confirm that the grades in the HashMap match to the grades in the "Grades" tab
	// Note that there are 3 assignments. Thus, I will try to check each assignment
		public void testStudentList() { // Create a test to test that the student list is correct
			try {
				HashMap studentgradelist = new HashMap(); // Create the new HashMap
				Assignment assignment = db.getAssignmentByNumber(1); // Create a new assignment object for assignment 1
				
				// Check the assignment information for assignment 1
				studentgradelist = assignment.getStudentList(); // Get the student listing
				assertEquals(100, studentgradelist.get("Caileigh Raybould"));
				assertEquals(100, studentgradelist.get("Genista Parrish"));
				assertNotNull(assignment); // Check that the assignment object is not null for this assignment

				// Check the assignment information for assignment 2
				assignment = db.getAssignmentByNumber(2); // Create a new assignment object for assignment 2
				studentgradelist = assignment.getStudentList(); // Get the student listing
				assertEquals(90, studentgradelist.get("Kym Hiles"));
				assertEquals(100, studentgradelist.get("Josepha Jube"));
				assertNotNull(assignment); // Check that the assignment object is not null for this assignment

				// Check the assignment information for assignment 3
				assignment = db.getAssignmentByNumber(3); // Create a new assignment object for assignment 3
				studentgradelist = assignment.getStudentList(); // Get the student listing
				assertEquals(71, studentgradelist.get("Ernesta Anderson"));
				assertEquals(85, studentgradelist.get("Wilfrid Eastwood"));
				assertNotNull(assignment); // Check that the assignment object is not null for this assignment
				
			} catch (Exception e) { // Catch any exceptions that occur
				fail("Exception");
			}
		}

		// Requirement 3: Test that the average grade for each assignment is correct
		// To do this, I will test out the average grade for each of the three assignments
		// The average would be calculated by some function used to get the AverageGrade, with values rounded down
	public void testAverageAssignmentGrade() { // Create the test AverageAssignmentGrade test
		try {
			
			// Check the average assignment grade assignment 1
			Assignment assignment = db.getAssignmentByNumber(1); // Create a new object to hold assignment information
			assertEquals(99, assignment.getAverageGrade()); // Check that the assignment average is 99 (rounded down)
			assertNotNull(assignment); // Check that the created object is not null
			
			// Check the avarege assignment grade for assignment 2 
			assignment = db.getAssignmentByNumber(2); // Create a new object to hold assignment information
			assertEquals(100, assignment.getAverageGrade()); // Check that the assignment average is 100 (rounded down)
			assertNotNull(assignment); // Check that the created object is not null

			// Check the average assignment grade for assignment 3
			assignment = db.getAssignmentByNumber(3); // Create a new object to hold assignment information
			assertEquals(76, assignment.getAverageGrade()); // Check that the assignment average is 76 (rounded down)
			assertNotNull(assignment); // Check that the created object is not null
			 
		} catch (Exception e) { // Catch exceptions
			fail("Exception");
		}
	}

}
