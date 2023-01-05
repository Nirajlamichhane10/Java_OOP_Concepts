package collection;

public class abst2 extends abst1 {
	// Overriding the abstract method
	 void  Det() {
		System.out.println("I am Curretnly Studying BIT in Herald College..");
	}
	// overriding concepts 
	 void Vill() {
		 System.out.println("My Village Name is Helambu-4,Sera \n i Love my Village");
	 }
public void MyAim() {
	System.out.println("I want to be a good programmer in future ...");
}

	public static void main(String[] args) {
		abst2 obj = new abst2();
		obj.Det();
		obj.Vill();
		obj.MyAim();
		
		
	

	}

}
