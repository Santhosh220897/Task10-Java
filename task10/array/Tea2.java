package task10.array;

//Task10- Question7 - Teaclass using array.

public class Tea2 {
	
	//Method is created for brew in tea2 class
	
	public void brew() {
		
		System.out.println("Brewing tea...");
	}

	public static void main(String[] args) {
		
		// for tea2 class object is created using array
		
		Tea2 obj[] = new Tea2[4];
		
		// calling subclass 
		
		obj[0]=  new Tea2();
		obj[1]= new BlackTea1();
		obj[2]= new GreenTea1();
		obj[3]= new HerbalTea1();
		
		//using for-each loop 
		for (Tea2 tea2 : obj) {
			
			//calling methods in loop
			
			tea2.brew();
			
		}
	}

}

// Output
/*  Brewing tea...
    Brewing Black tea..
    Brewing Green Tea... 
    Brewing Herbal Tea...   
    */


