package task10;

public class Tea {
	//Task10 - Question5 - Tea
	
	//Input-addmilk-false,addsugar-false;

	
	// Storing addmilk & addsugar variable in boolean data type.
	
	boolean addMilk;
	boolean addSugar;
	
	public static void main(String[] args) {
		
		// object creation for the class Tea.
		
		Tea myTea = new Tea();
		
		// all methods are been called by object (myTea)
		
		myTea.prepareTea();
		myTea.addMilk();
		myTea.addSugar();
		myTea.serveTea();
		

	}
	
	//Constructor method without parameters
	
	public Tea() {
		
		this.addMilk = false;
		this.addSugar = false;
	}
	
	// Implementing Tea method
	
	public void prepareTea() {
		
		System.out.println("Prepares a basic tea with hot water & tea leaves");
	}
	// Implementing addMilk Method
	
	public void addMilk() {
		
		this.addMilk = true;
		
		System.out.println("Adds Milk to basic tea");
	}
	
	// Implementing addSugar Method
	
	public void addSugar() {
		
		this.addSugar = true;
		
		System.out.println("Adds sugar to basic tea");
	}
	
	// Implementing ServeTea Method with else-if statement
	
	public void serveTea() {
		
		if(this.addMilk && this.addSugar) {
			
			System.out.println("Serving Tea with milk & sugar");
		}
		else if (this.addMilk) {
			
			System.out.println("Serving Tea with milk");
		}
		else if (this.addSugar) {
			
			System.out.println("Serving Tea with milk & Sugar");
		}
		else {
			System.out.println("Serving Tea with Hot water & tea leaves");
		}
	}

}

// Output

/* Prepares a basic tea with hot water & tea leaves
   Adds Milk to basic tea
   Adds sugar to basic tea
   Serving Tea with milk & sugar    
   */


