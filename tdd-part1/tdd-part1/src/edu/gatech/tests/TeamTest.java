package edu.gatech.tests;

import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.io.IOException;

import junit.framework.TestCase;
import edu.gatech.Constants; // Completed in part 1
import edu.gatech.GradesDB; // To be refined in part 3
import edu.gatech.Student; // Refine the Student.Java file in part 3
import edu.gatech.Project; // To be added in part 3
import edu.gatech.GradesToolGui; // To be added in part 3
import edu.gatech.Session; // Add a session in part 3 to account for the specific users session

/*
 * These are tests for the Team class. The main class is the TeamTest class.
 * The team class holds information about a particular team, including team number (Requirement 1), 
 * as well as the list of Student names, team grade, and list of average contribution ratings (Requirement 2).
 * Note that I commented excessively (more than would normally be done) for organization & to help aid in understanding 
 * an rationale for the tests (in the absence of actual code to work with or test against)
 * @Nathaniel Payne
 */

public class TeamTest extends TestCase {
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
	
	// Requirement 1: Test that the team number for a specific team is correct
	// To do this, I will get the number of teams for each test and also verify the project team name is correct
	public void testTeamNumberIsCorrect() { // Create the class to test whether the team number is correct
		try {
			HashSet<Team> teamtest; // Use the Hashset to set up for testing the correct teams
			teamtest = db.getTeamsByProject("P1"); // Call the database and get the list of teams for project 1
			assertEquals(3, teamtest.size()); // Test that the team size for project 1 is 3

			teamtest = db.getTeamsByProject("P2"); // Call the database and get the list of teams for project 2
			assertEquals(3, teamtest.size()); // Test that the team size for project 2 is 3

			teamtest = db.getTeamsByProject("P3"); // Call the database and get the list of teams for project 3
			assertEquals(3, teamtest.size()); // Test that the team size for project 3 is 3
		} catch (Exception e) {
			fail("Exception"); // Generate an exception
		}
	}

	// Requirement 2: Test that the student names, team grade, and list of average contribution ratings
	// For this test I will test a total of 2 students per team to ensure that requirement 2 is satisfied
	public void testStudentTeamAttributes() { // Create a new class that tests the specific team attributes
		HashSet<Team> teamsattributes;
		try {
			teamdesc = db.getTeamsByProject("P2"); // Let us test the project 2 team attributes

			Team teamdata  = db.getTeam("P2", "Team 1");
			assertNotNull(teamdata); // Check that the teamdata object is not null
			HashMap hashmap = teamdata.getStudentList();
			assertEquals("8.67", hashmap.get("Sheree Gadow")); // Check the average contribution ratings of the team members
			assertEquals("9.33", hashmap.get("Rastus Kight")); // Check the average contribution ratings of the team members
			assertEquals(95, teamdata.getTeamProjectScore()); // Check that the team total project score is correct 

			teamdata = db.getTeam("P2", "Team 2");
			hashmap = teamdata.getStudentList();
			assertNotNull(teamdata); // Check that the teamdata object is not null
			assertEquals("6.75", hashmap.get("Ernesta Anderson")); // Check the average contribution ratings of the team members
			assertEquals("8.00", hashmap.get("Christine Schaeffer")); // Check the average contribution ratings of the team members
			assertEquals(96, teamdata.getTeamProjectScore()); // Check that the team total project score is correct
						
			teamdata = db.getTeam("P2", "Team 3");
			hashmap = teamdata.getStudentList();
			assertNotNull(teamdata); // Check that the teamdata object is not null
			assertEquals("8.25", hashmap.get("Wilfrid Eastwood")); // Check the average contribution ratings of the team members
			assertEquals("8.75", hashmap.get("Genista Parrish")); // Check the average contribution ratings of the team members
			assertEquals(86, teamdata.getTeamProjectScore()); // Check that the team total project score is correct
		} catch (Exception e) {
			fail("Exception"); // Catch an exception if the exception occurs
		}

	}

}
