package edu.gatech.tests;

import junit.framework.TestCase;

import javax.swing.JButton; // Note that I am proposing to use Java swing for the interface
import javax.swing.JComboBox; // Note that I am proposing to use Java swing for the interface
import javax.swing.JLabel; // Note that I am proposing to use Java swing for the interface
import javax.swing.JTextArea; // Note that I am proposing to use Java swing for the interface

import edu.gatech.Constants; // Completed in part 1
import edu.gatech.GradesDB; // To be refined in part 3
import edu.gatech.Student; // Refine the Student.Java file in part 3
import edu.gatech.Project; // To be added in part 3
import edu.gatech.GradesToolGui; // To be added in part 3
import edu.gatech.Team; // To be added in part 3
import edu.gatech.Session; // Add a session in part 3 to account for the specific users session
import edu.gatech.Window; // Proposing to add a class dedicated to making the main window
import edu.gatech.GradesToolGUIUtilities; // This may be needed to serve the main window
// This window could then be created or destroyed as needed

import java.io.BufferedReader; // Need to add this for the save text test
import java.io.FileInputStream; // Need to add this for the save text test

/*
 * These are optional tests for the GradesToolGUI. The main class is the GradesTootlGUITest class.
 * Note that the GradesToolGUI is proposed to have a title bar to display the application name, combo box (Requirement 1) 
 * to display a list of Students (Requirement 2), text box to display information about the selected Student, and a save button 
 * to save the Student information to a text file (Requirement 3). To test this, I will execute the test in 3 different parts * 
 * @Nathaniel Payne
 */

public class GradesToolGUITest extends TestCase { // Create the new gradeGUItest tool class
	Window window = null; // Create an empty window

	public void setUp() throws Exception { // Initiate the window set-up
		window = new Window(); // Create a new window
		window.setVisible(true); // Ensure that the window is set to be visible on the main screen
		super.setUp(); // Set up the window
	}

	public void tearDown() throws Exception { // Create a tear down function that can tear down the window when it is not needed
		window.dispose(); // Dispose of the window
		super.tearDown(); // Tear down the window object
	}
	
	// Requirement 1: This section will test information about the application, including the title bar, application name
	// the combo box display, etc. I may need to also create a utilities file for the main window.
	// If this is the case, it could be called something like GradesToolGUIUtilities
	public void testWindowInformation() {
		try {
			
			// Requirement 1a: Check to confirm that the title is correct
			JLabel title = (JLabel) UITestUtils.getChildByName(frame, "title");
			assertEquals("CS6300 GRADING TOOL", title.getText()); // Check that the title is as per the diagram provided
			assertNotNull("No title!", title); // Confirm that there is not an error served that no title is provided			
			// In the provided diagram, the title is listed as CS6300 Grading Tool

			// Requirement 1b: Confirm that text is displayed in the GUI interface area
			JTextArea textdisplayarea = (JTextArea) GradesToolGUIUtilities.getChildByName(window, "textdisplayarea"); // Note that JTextArea displays text
			assertTrue(!textdisplayarea.getText().equals("")); // Confirm that the text display area is not blank	
			assertNotNull("The text display has no information and cannot be served!", textdisplayarea); // Confirm that this is not null
						
			// Requirement 1c: Confirm that the combo box display is set up properly (needs one index as a default)
			JComboBox chooseastudent = (JComboBox) GradesToolGUIUtilities.getChildByName(frame, "studentsList");
			assertNotNull("Can't get combo box for students list!!", chooseastudent);
			assertTrue(chooseastudent.getSelectedIndex() > 0); // If an index is selected, it should be greater than 0
			
		} catch (Exception e) { // If there is an error, then catch the error
			fail("Exception");
		}
	}

	// Requirement 2: Test that a list of student information is displayed correctly in the student box
	// This requirement comes from the provided drawing which indicates that there will be a rectangular text box
	public void testTextBoxDisplaysStudentInfoPropertly(){ // Create the new test class
		try{
			JComboBox textBox = (JComboBox) GradesToolGUIUtilities.getChildByName(window, "studentsList");
			assertNotNull("The student text box area is empty.", textBox); // Check whether the student text box is empty
			Student selectedstudent = new Student(); // Select a new student and create a new student object
			selectedstudent.setName("Rastus Kight"); // I will select the student Rastus Kight
			selectedstudent.setGtid("901234512"); // Get the Gtid for the selected student
			textBox.setSelectedItem(selectedstudent); // Add the student information to the text box area

			//Now, verify text area can display the correct student information in correct format.
			String expectedStudentInfo = "NAME: Rastus Kight\n GTID: 901234512\n EMAIL: rk@gatech.edu\n Attendance: 96\n"
					                   + "Assignment Details:\n - Assignment 1\n Grade: 100\n"
					                   + "- Assignment 2\n Grade: 100\n"
					                   + "- Assignment 3\n Grade: 40\n"
					                   + "Project Details:\n - P1\n Team Grade: 90\n Individual Contribution: 9.33\n"
					                   + "- P2\n Team Grade: 95\n Individual Contribution: 9.33\n"
					                   + "- P3\n Team Grade: 96\n Individual Contribution: 8.00\n";
			
			JTextArea textBox = (JTextArea) GradesToolGUIUtilities.getChildByName(window, "studentsList"); // Get the information in the student list
			assertEquals(expectedStudentInfo, textBox.getText()); // Check that the expected student information = the textBox content from above
			assertNotNull("The student text box area is empty.", textBox); // Check to confirm that the textbox is not empty
			
		}catch(Exception e){ // If there is an exception, catch the exception
			fail("Exception");
		}
	}

	// Requirement 3: Confirm that the student information gets saved correctly
	public void testStudentInformationIsSavedCorrectly(){ // Create the base test class
		BufferedReader in = null; // Set the buffered reader (added using the import java.io.BufferedReader;) equal to null		
		try{
			JComboBox textBox = (JComboBox) GradesToolGUIUtilities.getChildByName(window, "studentsList"); // f

			Student selectedstudent = new Student(); // Select a new student and create a new student object
			selectedstudent.setName("Rastus Kight"); // I will select the student Rastus Kight
			selectedstudent.setGtid("901234512"); // Get the Gtid for the selected student
			textBox.setSelectedItem(selectedstudent); // Add the student information to the text box area
			
			//Now, verify text area can display the correct student information in correct format.
			String expectedStudentInfo = "NAME: Rastus Kight\n GTID: 901234512\n EMAIL: rk@gatech.edu\n Attendance: 96\n"
	                   + "Assignment Details:\n - Assignment 1\n Grade: 100\n"
	                   + "- Assignment 2\n Grade: 100\n"
	                   + "- Assignment 3\n Grade: 40\n"
	                   + "Project Details:\n - P1\n Team Grade: 90\n Individual Contribution: 9.33\n"
	                   + "- P2\n Team Grade: 95\n Individual Contribution: 9.33\n"
	                   + "- P3\n Team Grade: 96\n Individual Contribution: 8.00\n";

			// Check that the save button works correctly (need to click on the save button to make it work)
			JButton clickSaveButton = (JButton) GradesToolGUIUtilities.getChildByName(window, "clickSaveButton");
			clickSaveButton.doClick(); // Click on the save button that has been created

			//Verify file for the student is generated and content is correct.
			String expectedTextFileName = "Rastus Kight.txt"; // Create a text file called Rastus Kight.txt
		    in = new BufferedReader(new InputStreamReader(new FileInputStream(expectedTextFileName))); // Read in the information
			StringBuilder textFileContent = new StringBuilder(); String line = null; // Be prepared to build a string content
			while((line = in.readLine()) != null){ // While the line that is read in is not empty
				textFileContent.append(line + "\n"); // Append the line with the text file content
			}			
			
			assertEquals(expectedStudentInfo, textfileContent.toString()); // Check whether the text file content matches the
			// student content. This will confirm / satisfy the requirements of requirement 3

		}catch(Exception e){
			fail("Exception);
		}
	}
}
