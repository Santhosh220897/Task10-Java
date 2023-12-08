package task10.teaoverride;

//Task10-Question6 -Method override

//subclass of Tea1 

public class BlackTea extends Tea1 {

	// override method is used.

	@Override
	public void prepareTea() {

		System.out.println(
				"Preparing Black Tea with Black tea leaves, boiling water and its Brewing time is 3-5 minutes");
	}

}
