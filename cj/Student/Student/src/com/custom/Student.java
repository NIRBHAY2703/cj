package com.custom;

import java.util.Comparator;

public class Student implements Comparable<Student>{
	                                                   //student details
	private int student_roll;
	private String student_name;
	private String student_city;
	private double student_marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	// Parameterised Constructor
	
	public Student(int stud_roll, String stud_name, String stud_city, double stud_marks) {
		super();
		this.student_roll = stud_roll;
		this.student_name = stud_name;
		this.student_city = stud_city;
		this.student_marks = stud_marks;
	}

	//getter and Setter
	
	public int getStud_roll() {
		return student_roll;
	}

	public void setStud_roll(int stud_roll) {
		this.student_roll = stud_roll;
	}

	public String getStud_name() {
		return student_name;
	}

	public void setStud_name(String stud_name) {
		this.student_name = stud_name;
	}

	public String getStud_city() {
		return student_city;
	}

	public void setStud_city(String stud_city) {
		this.student_city = stud_city;
	}

	public double getStud_marks() {
		return student_marks;
	}

	public void setStud_marks(double stud_marks) {
		this.student_marks = stud_marks;
	}

	//Tostring Funcion
	@Override
	public String toString() {
		return "Student [stud_roll=" + student_roll + ", stud_name=" + student_name + ", stud_city=" + student_city
				+ ", stud_marks=" + student_marks + "]";
	}

	public int compareTo(Student compareStudent) {
		
		int compareRollNo = compareStudent.getStud_roll(); 
		
		return this.student_roll - compareRollNo;
		
	}
	
	public static Comparator<Student> StudentNameComparator 
                          = new Comparator<Student>() {

	    public int compare(Student student1, Student student2) {
	    	
	      String studentName1 = student1.getStud_name().toUpperCase();
	      String studentName2 = student2.getStud_name().toUpperCase();
	      
	     
	      return studentName1.compareTo(studentName2);
	    }

	};
	
	
}
