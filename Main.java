package karthikaproject;

public class Main {
	public static void main(String[] args){
		Circle circle = new Circle("red", 3);
		System.out.println(circle.calculateArea());
		circle.display();
	
	
	Triangle triangle = new Triangle("blue", 1, 3); 
		System.out.println(triangle.calculatePerimeter());
		triangle.display();
	    
	
	Rectangle rectangle = new Rectangle("Green", 2, 3); 
		System.out.println(rectangle.calculateArea());
		System.out.println(rectangle.calculatePerimeter());
		rectangle.display();
	
	
	Square square = new Square("Orange", 5); 
		System.out.println(square.calculateArea());	
		square.display();
	}
}

	