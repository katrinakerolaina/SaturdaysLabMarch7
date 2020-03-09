package Lab.Saturday;

/**
Calculates the area of a square given a side SaturdayLab1: Data types. Variables. Constants. Problem 2
Write a java program that declares a variable to represent the side of a square.
The side of the square is 7 units. Compute and display the area of the square.
Save the program as Square.java */

//declare a class called Carpet
public class Square {

	//declare main method to run the App
	public static void main(String[] args) {
	
		//declare the variables to represent side
		int side;
		
		//input
		//assign/store the value 7 to variable named side
		side = 7;
		
		//processing
		
		//declare a variable named area to store
		//area of the square
		int area;
		area = side * side;
		
		//output
		System.out.println("The area of square is " + area);
	}

}
