package collection;

public class Run_time_2 extends poly_Run_time_poly{
	 
		
		public void eat() {
			
			System.out.println("Nirmal is Comming home..........");
		}
		

	public static void main(String[] args) {
		poly_Run_time_poly obj = new poly_Run_time_poly(); // 
		obj.eat();
		
		poly_Run_time_poly obj1 = new Run_time_2(); // UPCASTING 
		obj1.eat();
		
		Run_time_2 obj2 = new Run_time_2();
		obj2.eat();

	}

}
