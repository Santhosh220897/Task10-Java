package task10.teaoverride;

public class Tea1 {
	// Task10 - Question6 - Prepare tea override

	// void method is created for prepareTea

	public void prepareTea() {

		System.out.println("Preparing Tea....");
	}

	public static void main(String[] args) {

		// object calling for the main class Tea1
		Tea1 obj = new Tea1();

		obj.prepareTea();

		// object calling for the Sub class BlackTea

		BlackTea obj1 = new BlackTea();

		obj1.prepareTea();

		// object calling for the Sub class GreenTea

		GreenTea obj2 = new GreenTea();

		obj2.prepareTea();

		// object calling for the Sub class HerbalTea

		HerbalTea obj3 = new HerbalTea();

		obj3.prepareTea();

	}

}

//Output

/*
 * Preparing Tea.... Preparing Black Tea with Black tea leaves, boiling water
 * and its Brewing time is 3-5 minutes Preparing Green Tea with Green tea
 * leaves, warm water and its brewing time is 2-3 minutes Preparing Herbal Tea
 * with chamomile, mint,hot water and its brewing time is 5-7 minutes
 */