package collection;
// Encapsulation means variables Attributes Hiding that means making private and 
// using getter and setter Methods for calling....
class Info{
	private String name;
	private int age;

	
	// Now we have to use getter methods and setter methods 
	
public void setName(String newName) { // while setting value we can used void methods and inside we have 
	// to fixed data type we have used 
	
	name = newName;
}

public String getName(){ // while in getter methods we have to used fixed data type to return from get methods 
	return name;
}
public void setAge(int newAge) { 
	age = newAge;
}
public int getAge(){
	return age;
}
}

public class encapsu {

	public static void main(String[] args) {
		
		Info obj = new Info();
		obj.setName("Niraj lamichhane"); // first of all set 
		obj.setAge(19);
		
		
		System.out.println(obj.getName());// then get methods 
		System.out.println(obj.getAge());
		
		
	}

}
