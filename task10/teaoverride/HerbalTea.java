package task10.teaoverride;

//Task10-Question6 - Method Override

//subclass of Tea1 

public class HerbalTea extends Tea1 {

	// override method is used.

	@Override
	public void prepareTea() {

		System.out.println("Preparing Herbal Tea with chamomile, mint,hot water and its brewing time is 5-7 minutes");
	}

}
