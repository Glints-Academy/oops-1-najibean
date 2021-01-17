package week1;

public class Teacher extends Person{

	public Teacher(String name, String address) {
		super(name, address);
	}

	// New variable and array
	int numCourses = 0;
	String[] courses = {"Math", "History", "Computer Science"};
	
	boolean addCourse(String course) {
		boolean hasil = true;
		for(int i=0; i<courses.length; i++) {
			if(course == courses[i]) {
				hasil = false;
			}
		}
		return hasil;
	}
	
	boolean removeCourse(String course) {
		boolean hasil = true;
		for(int i=0; i<courses.length; i++) {
			if(course != courses[i]) {
				hasil = false;
			}
		}
		return hasil;
	}
	
	public String toString() {
		return "Teacher: " +this.name+ "(" +this.address+ ")";
	}
}
