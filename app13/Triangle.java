package app13;

public class Triangle extends TwoDimensionalShape {

	private double semiPerimeter;
	
	public Triangle(double side1, double side2, double side3) {
			super(side1, side2, side3);
			semiPerimeter = (side1 + side2 + side3) / 2;
			if(!(semiPerimeter > side1 && semiPerimeter > side2 && semiPerimeter > side3)) {
				throw new IllegalArgumentException("These values do not represent the sides of a triangle!!!");
			}
	}

	@Override
	public double getArea() {
		double side1 = super.getSide1();
		double side2 = super.getSide2();
		double side3 = super.getSide3();
		return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
	}

	@Override
	public String toString() {
		return "Triangle";
	}
}
