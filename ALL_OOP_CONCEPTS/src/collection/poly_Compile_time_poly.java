package collection;

public class poly_Compile_time_poly { // it occurs within one classes 
	
	public void Add() {
		System.out.println(" we are doing the addiction \n operation in this task ");
		
	} 
	
	public int Add(int a, int b) {
		return a+b;
	}
	
	
	public int Add(int a, int b, int c) {
		return a+b+c;
	}
	
	
	
// Overridding  is called Compile time polymerphism
	public static void main(String[] args) {
		poly_Compile_time_poly obj = new poly_Compile_time_poly();
		obj.Add();
		System.out.println(obj.Add(55, 88));
		System.out.println(obj.Add(55, 88, 99));
	}

}

// We can have one or more methods with the same name 
that are solely distinguishable by argument numbers, type, or order.

Method Overloading occurs when a class has many methods with 
the same name but different parameters. Two or more 
methods may have the same name if they have other numbers of parameters,
different data types, or different numbers of parameters and different data types. 