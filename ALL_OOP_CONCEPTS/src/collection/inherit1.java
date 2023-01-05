package collection;

// Inheritance means parents class property is used by the child class using 
// extends keywords .....

public class inherit1 {
	String name ="Nirmal  lamichhane.";
	String Fname="Bharat prasad lamichhane.";
	String Mname="Shanta lamichhane.";
	
	void Study() {
		System.out.println("My brother name is "+name+"\n I study in grade 11.");
	}

public static void main(String args[]){
	inherit1 obj = new inherit1();
	obj.Study();
	System.out.println("My father name is "+obj.Fname);
	System.out.println("My Mother name is "+obj.Mname);
	
	
	
}

}
