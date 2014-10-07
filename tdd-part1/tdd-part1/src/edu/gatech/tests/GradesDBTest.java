package edu.gatech.tests;

import java.util.HashSet;

import junit.framework.TestCase;
import edu.gatech.Constants;
import edu.gatech.GradesDB;
import edu.gatech.Student;
import edu.gatech.GradesToolGUIUtilities;
import edu.gatech.GradesToolGUI;
import edu.gatech.Team;
import edu.gatech.Project;
import edu.gatech.Assignment;

/*
 * These are tests for the GradesDB class
 * For this part of the assignment, I will expand the GradesDBTest class to account for a new list of projects, accessible by 
 * project number, and a list of assignments, accessible by assignment number (Requirements 1). I will also create a method 
 * to output all information for a student (Requirement 2), which can be either written to a text file or the the text 
 * box in the GUI (test this in Requirement 3). The main class is the AssignmenTest class. 
 * Note that I commented excessively (more than would normally be done) for organization & to help aid in understanding 
 * an rationale for the tests (in the absence of actual code to work with or test against)
 * @Nathaniel Payne
 */

public class GradesDBTest extends TestCase { // Create the new GradesDBTest case
	 private Session session = null; // Create a new empty session object
	    GradesDB db = null; // Set the initial GradesDB object to null

	    // Setup and create a new session
	    protected void setUp() throws Exception {
	        session = new Session(); // Create a new session object
	        session.login(Constants.USERNAME, Constants.PASSWORD); // Login using the username and password for the person
	        db = session.getName(Constants.GRADES_DB); // Get the name of the user
	        super.setUp(); // Set up the new session
	    }

	    protected void tearDown() throws Exception { // Create the teardown
	        session.logout(); // Logout from the session
	        super.tearDown(); // Teardown the script
	    }
	    
	    // Requirement 1: Test that the assignment and project information is all correct
	    // Requirement 1a: Test that we can get the correct assignment number and description for a specific assignment
	    public void testGetCorrectAssignmentNumberDescription() { // Create the new test class
	        Assignment assignment = null; // Ensure that the new assignment object that was created is null
	        try {
	            assignment = db.getAssignmentByNumber(3); // Get the assignment information for assignment 3
	        } catch (Exception e) {
	            fail("Exception"); // If there is no assignment 3, then return an exception
	        }
	        assertTrue(assignment.getAssignmentDescription() // Test whether the assignment description for assignment 3 matches
	                .compareTo("junit and coverage") == 0);
	        assertNotNull(assignment); // Confirm that the assignment attribute is not null
	    }
	    
	 // Requirement 1b: Test that the assignment mark for a specific student is indeed correct. Try assignment 2 this time.
	    public void testCorrectAssignmentScore() { // Create the test correct assignment score class
	        try {
	            Assignment a = db.getAssignmentByNumber(2); // Get the assignment scores for assignment 2
	            Map<String, Integer> marks = a.getStudentList(); // Get a student list that corresponds to the assignment
	            assertEquals(95, marks.get("Wilfred Eastwood").intValue()); // Check that assignment 2 score for Wilfred is 95 
	        } catch (Exception e) { // If there is an exception, catch the exception
	            fail("Exception"); // Generate an exception
	        }
	    }

	    // Requirement 1c: Test that there are indeed 3 assignments (note that this was tested in the Assignment test also)
	    public void testCorrectNumberOfAssignments() { // Test that there are actually 3 assignments
	        List<Assignment> assignments = null; // Create an empty list of assignments
	        try {
	            assignments = db.getAssignments(); // Get the list of assignments from the database
	        } catch (Exception e) { // Catch an exception if one occurs
	            fail("Exception"); // Return fail if there is an exception
	        }
	        
	        assertNotNull(assignments); // Check that the assignments list is not empty
	        
	        // Check now that the assignment descriptions are correct (carrying over from the assignment tests	     
	        boolean assignmentsexist = false; // Create a boolean where assignments exist
	        for (Assignment test : assignments) { // For the specific test assignment (in this case, assignment 2)
	            if (test.getAssignmentDescription().compareTo("software prototyping") == 0 // Check that software prototyping description is accurate
	                    && test.getAssignmentNumber() == 2) { // Confirm that software prototyping is the description for assignment 2
	            	assignmentsexist = true; // If this is true, then the assignments exist
	                break;
	            }
	        }
	        assertTrue(assignmentsexist); // Check again that the assignments exist
	        assertEquals(3, assignments.size()); // Check that there are indeed 3 assignments
	    }

	    // Requirement 2: Test that the student information is correct
	    // The fields that need to be tested from the first test were NAME, GTID, and EMAIL
	    // For the test, I am going to use the student Caileigh Raybould, 901234506, cr@gatech.edu
	    // His attendance, rounded down, was 83%
	   
	    // Requirement 2a: Test that the names of the students is correct
	    public void testCorrectName() { // Create the base test class
	        try {
	            Student student = db.getStudentByID("901234506"); // Get the student by ID
	            assertEquals("Caileigh Raybould", student.getName()); // Confirm that the name matches Caileigh Raybould
	        } catch (Exception e) {
	            fail("Exception"); // Generate an exception if there is one
	        }
	    }
	    
	    // Requirement 2b: Test that the ID of the students is correct
	    public void testCorrectGtid() { // Create the base test class
	        try {
	            Student student = db.getStudentByName("Caileigh Raybould"); // Get the student name
	            assertEquals("901234506", student.getGtid());
	        } catch (Exception e) { // If it is not, generate an exception
	            fail("Exception"); // Generate an exception if necessary
	        }
	    }
	    
	    // Requirement 2c: Test that Attendance is correct
	    public void testCorrectAttendance() { // Create the base test class
	        try {
	            Student student = db.getStudentByName("Caileigh Raybould"); // Get the student in the db
	            assertEquals(83, student.getAttendance()); // Check that the attendance is correct
	        } catch (Exception e) { // If it is not, generate an exception
	            fail("Exception"); // Generate an exception if necessary
	        }
	    }	    
	   
	    // Requirement 2d: Test that the students e-mail address is correct
	    public void testCorrectEmail() { // Create the base test class
	        try {
	            Student student = db.getStudentByName("Caileigh Raybould"); // Get the student by name
	            assertEquals("cr@gatech.edu", student.getEmail()); // Confirm that the student e-mail is correct
	        } catch (Exception e) { // If it is not, generate an exception
	            fail("Exception"); // Generate an exception if necessary
	        }
	    }
	    
		 // Requirement 3: Test that the files can be saved out correctly (as noted in the requirements
	    public void testFileSavedCorrectly() {
	        try {
	        	Student student = db.getStudentByName("Caileigh Raybould"); // Get the student in the db
	            student.saveStudentInformation(); // Save the student information
	            String text = student.readStudentInformationFromFile(); // Read the student information from the file
	            assertTrue(text.contains("Caileigh Raybould") // Confirm that the name is correct
	                    && text.contains("901234506") // Confirm that the student number is correct
	                    && text.contains("ca@gatech.edu") && text.contains("83")); // Confirm that the e-mail and attendance match
	        } catch (Exception e) { // If there is an exception, catch the exception
	            fail("Exception"); // Generate an exception if necessary
	        }
	    }
}
