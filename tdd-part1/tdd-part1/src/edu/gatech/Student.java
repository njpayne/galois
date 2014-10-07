package edu.gatech;

/*
 * This is a copy of the student class.
 * This class (Student) holds information about a student, such as name and GT ID.
 * This document is create to reference or mirror what is in the example "screenshot"
 * Note that e-mail isn't included in our GradesDB test at the moment. That said, I have included it
 * for reference here anyways based on the screenshot provided (thinking ahead as part of TDD)
 * @author Nathaniel Payne
 */

public class Student { // Create the student class
	private String name; // Create a string for the student name
	private String gtid; // Create a string for the student id
	private int attendance;	// Create a string for the attendance
	private String email; // Create a private string for e-mail	

	public Student(String name, String gtid, int attendance, String email) // Create the student object
	{
		this.name = name; // This is the students name
		this.gtid = gtid; // This is the students gtid
		this.attendance = attendance; // This is the students attendance
		this.email = email; // Create a strung for e-mail
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) { // Set the name here to name
		this.name = name; // name
	}

	public void setGtid(String gtid) { // Set the GTid to gtid
		this.gtid = gtid; // gtid
	}

	public void setEmail(String email) { // Set the E-mail to email
		this.email = email; // email; thinking ahead based on the interface
	}

	public void setAttendance(int attendance) { // Set Attendance to attendance 
		this.attendance = attendance; // attendance
	}

	public String getName() { // return the student name
		return name;
	}

	public String getGtid() { // return the gtid
		return gtid;
	}
	
	public int getAttendance() { // return the attendance
		return attendance;
	}
	
	public String getEmail() { // return the e-mail (future project)
		return email; // email; thinking ahead based on the interface
	}

}
