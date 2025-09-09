package tta.ex_18_OOPs_Constructor;

public class Lab177_PC {

	public static void main(String[] args) {
		
		BabyA b1 = new BabyA();
		BabyA b2 = new BabyA();
		System.out.println(b1.name);
		System.out.println(b2.name);
		
	}
}

class BabyA{
	
	String name;
	
	BabyA(){
		name = "Gugu";
	}
}