package app13;

public abstract class TwoDimensionalShape extends Shape {

	public TwoDimensionalShape(double side1, double side2, double side3) {
		super(side1, side2, side3);
	}

	public TwoDimensionalShape(double side1, double side2) {
		super(side1, side2);
	}

	public TwoDimensionalShape(double side1) {
		super(side1);
	}

	public TwoDimensionalShape() {
		super();
	}

	public abstract double getArea();
}
