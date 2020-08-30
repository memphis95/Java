package collections;

import java.util.ArrayList;
import java.util.Iterator;



public class Course {
	String courseName;
	public Course(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return courseName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> numList = new ArrayList<>();
//		numList.add(10);
//		numList.add(new Integer(22));
//		System.out.println(numList.get(1));
		
		ArrayList<Course> courseList = new ArrayList<>();
		courseList.add(new Course("java"));
		courseList.add(new Course("Hibernate"));
		courseList.add(new Course("AngularJS"));
		System.out.println("using iterator to access the list of courses");
		Iterator<Course> courseIterator = courseList.iterator();
		while(courseIterator.hasNext()) {
			Course c = courseIterator.next();
			System.out.println(c);
		}
		
		System.out.println("Using loop to accees the list of courses");
		for(int index=0; index<courseList.size(); index++) {
			System.out.println(courseList.get(index));
		}
		
		System.out.println("Using enhanced for loop to access the list of courses");
		for(Course c :courseList) {
			System.out.println(c);
		}
		
	}

}
