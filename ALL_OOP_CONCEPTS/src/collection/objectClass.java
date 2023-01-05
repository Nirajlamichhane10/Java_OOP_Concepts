package collection;
// class is the blue print of an Object where it has its Attributes and 
// Behaviors 

public class objectClass {
	
	// Attributes knows as Variables :
	String name="Niraj lamichhane";
	String address="Helambu-4,Sera";
	int age =19;
	
	
	// Behaviors knows as Methods 
	
	void Sport() {
		System.out.println("I like to watch Football and Wrestling..... ");
	}
	
	void Football() {
		System.out.println("My favourate footballer is Lional Messi......");
	}

	public static void main(String[] args) {
		
		// making object 
		// class name object name = new class constructor:
		objectClass obj = new objectClass();
		obj.Sport();
		obj.Football();
		System.out.println(obj.name);
		System.out.println(obj.address);
		System.out.println(obj.age);
		
	}

}
