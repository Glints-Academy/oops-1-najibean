package week1;

public class Person {
	String name, address;
	
	// Constructor
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	String getName() {
		return this.name;
	}
	
	String getAddress() {
		return this.address;
	}
	
	void setAdress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return this.name + "(" +this.address+ ")";
	}
}
