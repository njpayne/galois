package edu.gatech.tests;

import junit.framework.TestCase;
import edu.gatech.Constants; // Completed in part 1
import edu.gatech.GradesDB; // To be refined in part 3
import edu.gatech.Student; // Refine the Student.Java file in part 3
import edu.gatech.Project; // To be added in part 3
import edu.gatech.GradesToolGui; // To be added in part 3
import edu.gatech.Session; // Add a session in part 3 to account for the specific users session

/*
 * These are tests for the Project class. The main class is the ProjectTest class.
 * The project class holds information about a particular project, including project number (Requirement 1), 
 * project description (Requirement 2), list of teams (Requirement 3), and average project grade (Requirement 4) 
 * Note that I commented excessively (more than would normally be done) for organization & to help aid in understanding 
 * an rationale for the tests (in the absence of actual code to work with or test against)
 * @Nathaniel Payne
 */

public class ProjectTest extends TestCase {
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
	
	// Requirement 1: Test that the project number for a particular project is correct & that there are the
	// appropriate number of projects to be tested
	public void testCorrectProjectNumber() { // Create the initial base test class
		ArrayList<Project> testprojectlist = null; // Create an empty array to test the project list
		
		try {
			testprojectlist = db.getProjects(); // Get the the projects from the db and fill the empty array
		} catch (Exception e) {
			fail("Exception"); // If there are any exceptions, catch the exceptions
		}
		assertEquals(3, testprojectlist.size()); // Check that there are indeed 3 projects in the db
		// This will implicitly test that the project numbers are correct within the testprojectlist
	}

	// Requirement 2: Test that the project description is indeed correct
	// To do this, I will test the project description for project 3
	public void testProjectDescription() {
		ArrayList<Project> projects = null; // Create an empty array to test the project list
		
		try {
			projects = db.getProjects(); // Get the the projects from the db and fill the empty array
			boolean projectexists = false; // Create a boolean that is initially false (indicating that a project does not exist
			for (Project testproject : projects) { // 
				if (testproject.getProjectName().equals("P3")) { // If the project name is equal to P3
					projectexists = true; // Then the project itself exists
					break; // Break if this is true
				}
			}
			assertTrue(projectexists); // Check and validate that the project in question does actually exists

		} catch (Exception e) { // Catch and generate the exception if it does exist
			fail("Exception");
		}
	}
	
	// Requirement 3: Test that the team list for each project is correct & hold accurate information
	// This will also check that the team description is correct
	public void testCorrectProjectTeamsList()
		{	
			ArrayList<Project> testprojectlist = null; // Create an empty array list to hold the project information

		try {
			testprojectlist = db.getProjects(); // Fill the empty test project array with the get projects information
			if(testprojectlist == null){ // If the project list is empty
				fail("Exception"); // Return an exception
			}
			for (Project project : testprojectlist) { // For the filled project list
				
				HashMap hashmap = new HashMap(); // Create a new Hashmap

				// Test the grades for the team projects (Project 1)	
				if(project.getProjectName().equals("P1"))
				{
					hashmap = project.getTeamProjectList();  // Create a new Hashmap
					assertEquals(93,hashmap.get("Team 1"));  // Confirm that the project grades for the team are correct
					assertEquals(96,hashmap.get("Team 2"));  // Confirm that the project grades for the team are correct
					assertEquals(90,hashmap.get("Team 3"));  // Confirm that the project grades for the team are correct
				}

				// Test the grades for the team projects (Project 2)
				else if(project.getProjectName().equals("P2"))
				{
					hashmap = project.getTeamProjectList();  // Create a new Hashmap
					assertEquals(95,hashmap.get("Team 1"));  // Confirm that the project grades for the team are correct
					assertEquals(96,hashmap.get("Team 2"));  // Confirm that the project grades for the team are correct
					assertEquals(86,hashmap.get("Team 3"));  // Confirm that the project grades for the team are correct
				}

				// Test the grades for the team projects (Project 3)
				else if(project.getProjectName().equals("P3"))
				{
					hashmap = project.getTeamProjectList();  // Create a new Hashmap
					assertEquals(100,hashmap.get("Team 1")); // Confirm that the project grades for the team are correct
					assertEquals(96,hashmap.get("Team 2"));  // Confirm that the project grades for the team are correct
					assertEquals(102,hashmap.get("Team 3")); // Confirm that the project grades for the team are correct
				}
			}
		} catch(Exception e){ // Catch an exception if it is generated
			fail("Exception");  // Return an error
		}
	}
	
	// Requirement 4: Test that the average grade for each project is correct
	public void testAverageProjectGrade()
	{
		ArrayList<Project> projectlist = null; // Create an empty array list to hold the project information
		
		try {
			projectlist = db.getProjects(); // Fill the project list with information
			assertNotNull(projectlist); // Check that the project list is not empty
			
			for (Project specificproject : projectlist) { // For each of the specific projects in the project listing
				if(specificproject.getProjectName().equals("P1")) // If the project name is equal to P1
				{assertEquals(93,specificproject.getAverageProjectGrade());} // Then check if the average grade is correct
				// Note that the average project grade is calculated to be 93 here

				else if(specificproject.getProjectName().equals("P2")) // If the project name is equal to P2
				{assertEquals(92,specificproject.getAverageProjectGrade());} // Then check if the average grade is correct
				// Note that the average project grade is calculated to be 92 here

				else if(specificproject.getProjectName().equals("P3")) // If the project name is equal to P3
				{assertEquals(99,specificproject.getAverageProjectGrade());} // Then check if the average grade is correct
				// Note that the average project grade is calculated to be 99 here	
			}
		}catch(Exception e){ // If there is an exception, then catch the exception
			fail("Exception");
		}
	}
}
