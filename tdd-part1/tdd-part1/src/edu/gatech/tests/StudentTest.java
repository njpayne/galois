package edu.gatech.tests;

import java.util.ArrayList;

import edu.gatech.Constants; // Completed in part 1
import edu.gatech.GradesDB; // To be refined in part 3
import edu.gatech.Student; // Refine the Student.Java file in part 3
import edu.gatech.Project; // To be added in part 3
import edu.gatech.GradesToolGUI; // To be added in part 3
import edu.gatech.Team; // To be added in part 3
import edu.gatech.Session; // Add a session in part 3 to account for the specific users session

import junit.framework.TestCase;

/*
 * These are tests for the Student class
 * The Student class holds information about the student, including email address, and each team the student was on
 * Note that this information is held or tested within an embedded test (Requirement 1)
 * The main class is the StudentTest class
 * Note that I commented excessively (more than would normally be done) for organization & to help aid in understanding 
 * an rationale for the tests (in the absence of actual code to work with or test against)
 * @Nathaniel Payne
 */

public class StudentTest extends TestCase {
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
	
	// Requirement 1: Test that the students name, gtid, e-mail, and other associated information (including assignment results), is correct
	public void testStudentInformation() {
		try {			
			HashSet<Student> studentlist = null; // Create an empty has set to be used for testing in the the student set
			
			try { // As per normal, use a try catch loop for the construction here
				studentlist = db.getStudents(); // Fill the empty student list with student information
			} catch (Exception e) { // If there is an exception, generate a relevant exception
				fail("Exception");
			}
			
			boolean studentsexist = false; // Create an initial boolean = the fact that the student does not exist
			Student studentinquestion = null; // Create a null studentinquestion object
			
			for (Student specificstudent: studentlist) { // For each of the students in the studentlist				
				if ((specificstudent.getName().compareTo("Rastus Kight") == 0) // Test that Rastus Kight name matches
						&& (specificstudent.getGtid().compareTo("901234512") == 0) // Test that that student number is correct
						&& (specificstudent.getEmail().compareTo("rk@gatech.edu") == 0)) { // Test that the e-mail is rk@gatech.edu
				
					studentsexist = true; // If this is true, then the student exists
					studentinquestion = specificstudent; // The student that we are looking at = the correct student
					break;
				}
			}
			
			assertTrue(studentsexist); // Assert than that the student does indeed exist
			
		} catch (Exception e) {
			fail("Exception"); // If the student does exist, then catch the exception
		}
	}
	
    // Requirement 2: Test that a random student is on the correct team for a specific project in the db
	public void testStudentOnCorrectTeam() // Generate a test to test whether a student is on a particular team
		boolean studentexists = false; // Create the boolean of student exists equal to false
		StudentProject specificproject = null; // Make a specific student project that is null
		try {
			Student selectedstudent = db.getStudentByName("Genista Parrish"); // Grab a random student from the db
			ArrayList <StudentProject> studentProjects = selectedstudent.getInvolvedProjects(); // Get the selected students info
			for ( StudentProject studentProject: studentProjects) { // For the specific student project
				if (studentProject.getProjectName().equals("P2") && studentProject.getTeam().equals("Team 3")) // Get project ingo
				{
					studentexists = true; // If the student exists, then change this variable to true
					specificproject = studentProject; // In this case, the specific project = the studentProject in question
				}
			}
			
		} catch(Exception e){ // If there is an error, catch it 
			fail("Exception"); // Generate an error message
		}
        
		assertTrue(studentexists); // Confirm whether the student in question exists
		// Note that this also implicitly tests whether the student is in the correct group		
	}
}
