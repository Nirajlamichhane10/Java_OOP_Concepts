package collection;

// extends class of inherit1 and its property AS WELL

public class inherit2 extends inherit1{
	String mname="Niraj lamichhane";
	
	void Mstudy() {
		System.out.println("I am curretnly study in Bachlors in Compter Science");
	}

	public static void main(String[] args) {
		inherit2 obj2 = new 	inherit2();
		System.out.println("My name is "+obj2.mname);
		obj2.Mstudy();
		
		// Inherit from from parents class this property 
		
		obj2.Study();                                
		System.out.println("My Father name is "+obj2.Fname);
		System.out.println("My Mother name is "+obj2.Mname);
		
		
		

	}

}
