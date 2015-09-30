import java.lang.Math;

public class Triangle extends GeometricObject {
	
	private double side1;
	private double side2;
	private double side3;
	private double triArea;
	
	//no arg constructor that creates a default triangle
	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	//constructor that creates a triangle with specified sides
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	//accessors
	public double getSide1(){
		return this.side1;
	}

	public double getSide2(){
		return this.side2;
	}

	public double getSide3(){
		return this.side3;
	}
	
	//getArea method
	public double getArea(){
		triArea = ((side1 + side2 + side3) / (2));
		return (Math.sqrt(triArea * ((triArea-side1) * (triArea-side2) * (triArea-side3))));
		
	}
	// getPerimeter method
	public double getPerimeter(){
		return (side1 + side2 + side3);
	}
	
	// toString method
	public String toString(){
		return ("The area is" + getArea() + "the perimeter is" + getPerimeter());
	}
}