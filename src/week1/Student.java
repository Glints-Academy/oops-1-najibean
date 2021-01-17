package week1;

public class Student extends Person {
	
	public Student(String name, String address) {
		super(name, address);
	}

	// New variable and array
	int numCourses = 0;
	int[] grades = {4,6,7,8};
	String[] courses = {"Math", "History", "Computer Science"};
	
	
	void addCourseGrade(String course, int grade) {
		System.out.println("I take "+ course +", which has grade "+ grade);
	}
	
	void printGrades() {
		for(int i : grades) {
			System.out.println(i);
		}
	}
	
	double getAverageGrade() {
		for(int i=0; i<grades.length; i++) {
			numCourses = numCourses + grades[i];
		}
		
		return numCourses / grades.length;
	}
	
	public String toString() {
		return "Student: " +this.name+ "(" +this.address+ ")";
	}
}
