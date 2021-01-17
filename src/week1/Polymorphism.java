package week1;

public class Polymorphism {
	public static void main(String[] args) {
		
		Person orang = new Person("Sulaiman", "Belian");
		orang.setAdress("Lubuk Baja");
		System.out.println(orang.getName());
		System.out.println(orang.getAddress());
		System.out.println(orang.toString());
		
		Student murid = new Student("Najib", "Happy Garden");
		murid.addCourseGrade("Math", 8);
		murid.printGrades();
		System.out.println(murid.getAverageGrade());
		System.out.println(murid.toString());
		
		Teacher guru = new Teacher("Raihan", "KDA");
		System.out.println(guru.addCourse("Math"));
		System.out.println(guru.removeCourse("IPA"));
		System.out.println(guru.toString());
	}
}
