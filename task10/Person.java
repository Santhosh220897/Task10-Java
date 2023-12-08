package task10;

public class Person {
	// Task10 - Question1 - age & name using get method & constructor

	// input name-Santhosh, age-26;

	// Storing name & age variable in String & integer.
	String name;
	int age;

	public static void main(String[] args) {

		// implementing object creation

		Person person1 = new Person("Santhosh", 26);

		// Execution of result

		System.out.println(person1.getName() + " is " + person1.getAge() + "years old");

	}

	// Constructors method with parameters
	public Person(String name, int age) {

		this.name = name;
		this.age = age;

	}

	// Constructors methods with no parameters

	public String getName() {

		return name;

	}

	public int getAge() {

		return age;

	}

}

//Output - Santhosh is 26years old
