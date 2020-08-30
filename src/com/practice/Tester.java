package com.practice;
import java.time.LocalDate;

public class Tester {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		Tester for Student class
//		Student student = new Student();
//		student.setName("Jacob");
//		student.setStudentId(1001);
//		student.setQualifyingExamMarks(80);
//		student.setResidentialStatus('H');
//		student.setYearOfEngg(3);
//		
//		System.out.println("Output: ");
//		System.out.println("Student Name : "+ student.getName());
//		System.out.println("Student Id : "+ student.getStudentId());
//		System.out.println("Qualifying marks : "+ student.getQualifyingExamMarks());
//		System.out.println("Year of Engineering : "+student.getYearOfEngg());
//		System.out.println("Residential status : "+student.getResidentialStatus());
//	}
	
//	public static void main(String[] args) {
//		Manager manager = new Manager();
//		String employeeId = "I1001";
//		char gradePoint = manager.checkEmployeeID(employeeId, 80);
//		System.out.println("the grade for "+ employeeId + " is "+ gradePoint);
//	}
	
	public static void main(String[] args) {
		AgeFinder agefinder = new AgeFinder();
//		LocalDate birthDate = LocalDate.of(1995,12,02);
		LocalDate birthDate = LocalDate.of(2020,07,02);
		System.out.println(agefinder.getAge(birthDate));
		System.out.println(agefinder.getDateAfterNDays(5));
		System.out.println(agefinder.getDateAfterXYearYMonthZDays(1, 1, 1));
	}

}
