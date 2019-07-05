package com.custom;

import java.util.ArrayList;
import java.util.Arrays;

public class MainApplication {                                      //main function

	public static void main(String[] args) {
		Student[] Students = new Student[5];
		                                                               //put Student Information
		
		Student st1 = new Student(1073, "Saurabh","Gwalior",20); 
		Student st2 = new Student(1065, "Ashu","Indore",15); 
		Student st3 = new Student(1016, "Mayank","New Delhi",22); 
		Student st4 = new Student(1052, "Shiv","Gaziabad",26); 
		Student st5 = new Student(1023, "Mahesh","Pune",23); 
		
		Students[0]=st1;
		Students[1]=st2;
		Students[2]=st3;
		Students[3]=st4;
		Students[4]=st5;
		
		Arrays.sort(Students);

		int i=0;
		for(Student temp: Students){
		   System.out.println("Students " + ++i + " : " + temp.getStud_name() + 
			", Roll No : " + temp.getStud_roll());
		}

	}

}
