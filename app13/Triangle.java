package app13;

public class Triangle extends TwoDimensionalShape {

	public Triangle(double a, double b, double c) {
		super(a, b, c);
	}

	@Override
	public double getArea() {
		double a = super.getSide1();
		double b = super.getSide2();
		double c = super.getSide3();
		double poluPerimeter = (a + b + c) / 2;
		return Math.sqrt(poluPerimeter * (poluPerimeter - a) * (poluPerimeter - b) * (poluPerimeter - c));
	}

	@Override
	public String toString() {
		return "Triangle";
	}
}
