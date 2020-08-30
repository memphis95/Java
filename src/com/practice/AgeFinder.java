package com.practice;

import java.time.LocalDate;
public class AgeFinder{
	public int getAge(LocalDate dateOfBirth) {
		LocalDate presentDate = LocalDate.now();
		int age = presentDate.compareTo(dateOfBirth);
		return age;
		//Implementation required
	}
	public LocalDate getDateAfterNDays(int noOfDays) {
		LocalDate presentDate = LocalDate.now();
		LocalDate dateAfterNDays = presentDate.plusDays(noOfDays);
		return dateAfterNDays;
		//Implementation required
	}
	public LocalDate getDateAfterXYearYMonthZDays(int year, int month, int day) {
		LocalDate presentDate = LocalDate.now();
		LocalDate nextDate = presentDate.plusYears(year).plusMonths(month).plusDays(day);
		return nextDate;
		//Implementation required
	}
}

