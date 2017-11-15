package app13;

public abstract class ThreeDimensionalShape extends Shape {
	
	public ThreeDimensionalShape(double side1, double side2,double side3) {
		super(side1, side2, side3);
	}
	public ThreeDimensionalShape(double side1,double side2) {
		super(side1,side2);
	}
	public ThreeDimensionalShape(double side1) {
		super(side1);
	}
	public ThreeDimensionalShape() {
		super();
	}
	
	
	
	public abstract double getArea(); 
	public abstract double getVolume(); 
		
	
}
