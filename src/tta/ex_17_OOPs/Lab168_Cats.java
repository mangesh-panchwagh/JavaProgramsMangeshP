package tta.ex_17_OOPs;

public class Lab168_Cats {

	Lab168_Cats(){
		System.out.println("DC - Main Class");
	}
	public static void main(String[] args) {
		
		Cat c1 = new Cat();
		new Cat();
		Cat c2;
		
		c1.runnig();
	//	c2.runnig();
		new Cat().runnig();
	}
}

class Cat{
	
	String name;	// null
	void runnig() {
		System.out.println("Running");
	}
	
}
