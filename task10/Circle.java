package task10;

public class Circle {

	// Task10 - Question3 - Circle circumference
	
	// input radius-5.0,8.0
	
	// Storing radius variable in double data type

	double radius;

	public static void main(String[] args) {
		
		//Implementing Object cicrcle1 with radius 5.0

		Circle circle1 = new Circle();
		
		circle1.setRadius(5.0);
		
		double circumference1 = circle1.circumference();
		
		System.out.println("Circle 1 circumference : " + circumference1);
		
		//Implementing Object cicrcle2 with radius 8.0

		Circle circle2 = new Circle(8.0);

		double circumference2 = circle2.circumference();

		System.out.println("Circle 2 circumference : " + circumference2);

	}
     //implementing constructor method without parameters
	
	public Circle() {

		this.radius = 0.0;
	}
	//implementing constructor method with parameters

	public Circle(double radius) {

		this.radius = radius;
	}
	//Method1:Circumference 

	public double circumference() {

		return 2 * Math.PI * this.radius;

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}

// Output 

/*   Circle 1 circumference : 31.41592653589793
     Circle 2 circumference : 50.26548245743669  */

