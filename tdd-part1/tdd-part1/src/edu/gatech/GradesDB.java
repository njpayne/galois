package edu.gatech;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 * This file corresponding to the Task 2 in the TDD project
 * The goal here is to develop a class (GradesDB) that encapsulates most of the system functionality 
 * and provides an intuitive interface towards the information in the spreadsheet. 
 * @author Nathaniel Payne
 */

public class GradesDB { // This creates the new GradesDB class
	private HashMap<String, Student> students;
		    	
	public GradesDB(String gradesDb) throws Exception { // This creates a new GradesDB object
		File excel =  new File (Constants.GRADES_DB); // Get the excel file
		FileInputStream fis = new FileInputStream(excel); // Input the file using the filestream
		XSSFWorkbook wb = new XSSFWorkbook(fis); // Use the XSSF workbook library
		// Note that wb is the new data object
		//System.out.println(wb); // Do a test print of System.out.println()
	}

	public int getNumStudents() throws Exception { // Create a function to get the number of students
		File excel =  new File (Constants.GRADES_DB); // Get the excel file
		FileInputStream fis = new FileInputStream(excel); // Input the file using the filestream
		XSSFWorkbook wb = new XSSFWorkbook(fis); // Use the XSSF workbook library
		XSSFSheet ws = wb.getSheet("Details");
		
		int headers = 3; int columns = 3; // Specify sheet char (TDD - Manual process first / automate later)
		int count = 0; // Create an initial counter variable
		for(Row row : ws) { // For each of the rows in the worksheet
			   short minColIx = row.getFirstCellNum(); // Get the first cell number
			   short maxColIx = row.getLastCellNum(); // Get the last cell number
			   for(short colIx = minColIx; colIx<maxColIx; colIx++) {
			     Cell c = row.getCell(colIx);
			     if(c != null) {
			        if(c.getCellType() == Cell.CELL_TYPE_STRING) {			           
			        	count += 1; // Add 1 to the counter
			        } // End if
			     } // End if
			   } // End for
			} // End for
		
		int NumStudents = ((count - headers) / columns); // Calculate the total number of students
		//System.out.println("There are a total of " + NumStudents + " students in the course!"); // Print out the number of students
		return NumStudents; // This returns a value from the function
	}

	public int getNumAssignments() throws Exception { // Create a function that gets the number of assignments
		File excel =  new File (Constants.GRADES_DB); // Get the excel file
		FileInputStream fis = new FileInputStream(excel); // Input the file using the filestream
		XSSFWorkbook wb = new XSSFWorkbook(fis); // Use the XSSF workbook library
		XSSFSheet ws = wb.getSheet("Data");
		
		int headers = 4; int columns = 4; // Specify sheet char (TDD - Manual process first / automate later)
		int count = 0; // Create an initial counter variable
		for(Row row : ws) { // For each of the rows in the worksheet
			   short minColIx = row.getFirstCellNum(); // Get the first cell number
			   short maxColIx = row.getLastCellNum(); // Get the last cell number
			   for(short colIx = minColIx; colIx<maxColIx; colIx++) {
			     Cell c = row.getCell(colIx);
			     if(c != null) {
			        if(c.getCellType() == Cell.CELL_TYPE_STRING) {			           
			        	count += 1; // Add 1 to the counter
			        } // End if
			     } // End if
			   } // End for
			} // End for
				
		int NumAssignments = ((count - headers) / columns); // Calculate the total number of students
		//System.out.println("There are a total of " + NumAssignments + " assignments in the course!"); // Print out the number of students
		
		return NumAssignments; // Return back the number of total assignments
	}

	public int getNumProjects() throws Exception { // Create a function that gets the number of projects
		File excel =  new File (Constants.GRADES_DB); // Get the excel file
		FileInputStream fis = new FileInputStream(excel); // Input the file using the filestream
		XSSFWorkbook wb = new XSSFWorkbook(fis); // Use the XSSF workbook library
		XSSFSheet ws = wb.getSheet("Data");
		
		int headers = 4; int columns = 4; // Specify sheet char (TDD - Manual process first / automate later)
		int count = 0; // Create an initial counter variable
		for(Row row : ws) { // For each of the rows in the worksheet
			   short minColIx = row.getFirstCellNum(); // Get the first cell number
			   short maxColIx = row.getLastCellNum(); // Get the last cell number
			   for(short colIx = minColIx; colIx<maxColIx; colIx++) {
			     Cell c = row.getCell(colIx);
			     if(c != null) {
			        if(c.getCellType() == Cell.CELL_TYPE_STRING) {			           
			        	count += 1; // Add 1 to the counter
			        } // End if
			     } // End if
			   } // End for
			} // End for
				
		int NumProjects = ((count - headers) / columns); // Calculate the total number of students
		//System.out.println("There are a total of " + NumProjects + " projects in the course!"); // Print out the number of students
		
		return NumProjects; // Return the total number of projects
	}
	
	public HashSet<Student> getStudents() throws Exception { // This is needed for the testGetStudents1() jUnit test
		HashSet<Student> studentSet = new HashSet<Student>(); // Create a new HashSet<student>.
		
		File excel =  new File (Constants.GRADES_DB); // Get the excel file
		FileInputStream fis = new FileInputStream(excel); // Input the file using the filestream
		XSSFWorkbook wb = new XSSFWorkbook(fis); // Use the XSSF workbook library
		XSSFSheet ws = wb.getSheet("Details"); // Look on the data tab for information
		
		Iterator<Row> rowIterator = ws.iterator(); 
        
        while(rowIterator.hasNext()) { // This is a row iterator
             Row row = rowIterator.next(); // Iterate through the next row
             Student myStudent = new Student(); // Create the new student object
             Cell cellstudent = row.getCell(0); // Get the name
             Cell cellstudentID = row.getCell(1); // Get the studentID
             cellstudent.getStringCellValue(); // Convert the value to a string
                                                                    
             String studentName = cellstudent.getStringCellValue();
             // long studentID = (long) cellstudentID.getNumericCellValue();
             
             if (cellstudentID.getCellType() == Cell.CELL_TYPE_NUMERIC) {
            	 long studentID = (long) cellstudentID.getNumericCellValue();
            	 //System.out.println(studentID);
            	 String studentID_str = String.valueOf(studentID); // Convert the long into a string
            	 //System.out.println(studentID_str);
            	 myStudent.setGtid(studentID_str); // Set the studentID to the value of the 
            	 studentSet.add(myStudent);
            	}
                                                                            
             if	(studentName.matches("NAME")){ 
            	 // Skip
             }
             else{
            	 myStudent.setName(studentName);
            	 studentSet.add(myStudent);
             }             
        }
       
       HashSet<Student> studentSetAttend = new HashSet<Student>(); // Create a new HashSet<student>.
       // Capture the attendance variable
       XSSFSheet ws_attend = wb.getSheet("Attendance"); // Look on the data tab for information
       Iterator<Row> rowIteratorAttend = ws_attend.iterator();
        
        while(rowIteratorAttend.hasNext()) {
        	Row row = rowIteratorAttend.next(); // Iterate through the next row
        	Student myStudent = new Student(); // Create the new student object
        	Cell cellstudentAttend = row.getCell(1); // Get the attendance
        	//System.out.println(cellstudentAttend);
        	FormulaEvaluator evaluator = wb.getCreationHelper().createFormulaEvaluator(); // Evaluate the formula
        	
        	CellValue cellValue = evaluator.evaluate(cellstudentAttend);        	
        	double studentAttend = cellValue.getNumberValue();
    	
        	if (studentAttend == 0 || studentAttend == 30){ // This corresponds to row 1 and 2
        		// skip        		
        	}
        	else{
        		double studentAttendfinal = Math.floor(studentAttend * 100); // Convert to a double with decimals
        		int studentAttendfinalInt = (int) studentAttendfinal; // Convert to an int        		
        		myStudent.setAttendance(studentAttendfinalInt); // Set the studentID to the value of the
        		//studentSetAttend.add(myStudent);
        	}
        	  	
        }                
		// System.out.println(studentSet); // Output the studentSet
		// System.out.println(studentSet.size()); // Test the studentSet.size()
        return studentSet; // Return the student set from this function ... Note that this was blank
		
	}

	public Student getStudentByName(String name) throws Exception {
		HashSet<Student> studentList = getStudents();
        Student currentStudent = new Student();
        
        Iterator<Student> hIterator = studentList.iterator();
        
        while(hIterator.hasNext()) { // This is a row iterator
        	currentStudent = hIterator.next();
        	
        	if(currentStudent.getName().matches(name)){
        		return currentStudent;
        	}    	
        }   
		return null;	
	}

	public Student getStudentByID(String number) throws Exception {
		HashSet<Student> studentListID = getStudents();
		 Student currentStudent = new Student();
		 
		 Iterator<Student> hIterator = studentListID.iterator();
		 while(hIterator.hasNext()){
			 currentStudent = hIterator.next();
		 
			 if(currentStudent.getGtid().matches(number)){
	        		return currentStudent;        		
	        	} 			 
		 }
		return null;
	}

}
