package collections;

import java.util.HashSet;
import java.util.Set;

class Student{
	private String name;
	private int rollNumber;
	
	public Student(int rollNumber, String name ) {
		this.name = name;
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	@Override
	public String toString() {
		return "Student [name = "+name+"roll Number = "+rollNumber+"]";
		
	}
	public int hashCode() {
		int hashCode = 0;
		hashCode = this.rollNumber;
		return hashCode;
	}
}

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> setCollection = new HashSet<>();
		Student stud1 = new Student(10001, "xxxxxx");

		setCollection.add(stud1);
		Student stud2 = new Student(10002, "yyyyyy");
		setCollection.add(stud2);
		System.out.println(setCollection);

	}

}
