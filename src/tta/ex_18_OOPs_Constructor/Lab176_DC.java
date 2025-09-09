package tta.ex_18_OOPs_Constructor;

public class Lab176_DC {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car();
		c1.name = "Tesla";
		System.out.println(c1.name);
		System.out.println(c1.model);
		System.out.println(c1.year);
		
		System.out.println(c2.name);
		c2.name = "Audi";
		System.out.println(c2.name);
		
		Baby1 b1 = new Baby1();
//		b1.name = "Nivisha";
		System.out.println(b1.name);

	}
}

class Car{
	
	String name;
	int year;
	String model;
	
	// DC : Deault consrtuctor
	Car(){
		name = "Unknown Car";
		year = 1991;
		model = "xxx";
	}
}

class Baby1{
	
	String name;
	
	Baby1(){
		name = "mangesh";
	}
}