package app13;

public abstract class Shape {
	private double side1;
	private double side2;
	private double side3;

	public Shape(double side1, double side2, double side3) {
		setSide1(side1);
		setSide2(side2);
		setSide3(side3);
	}

	public Shape(double side1, double side2) {
		this(side1, side2, 1);
	}

	public Shape(double side1) {
		this(side1, 1, 1);
	}

	public Shape() {
		this(1, 1, 1);
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		if (side1 > 0) {
			this.side1 = side1;
		} else {
			throw new IllegalArgumentException("Значение должно быть больше 0");
		}
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		if (side2 > 0) {
			this.side2 = side2;
		} else {
			throw new IllegalArgumentException("Значение должно быть больше 0");
		}

	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		if (side3 > 0) {
			this.side3 = side3;
		} else {
			throw new IllegalArgumentException("Значение должно быть больше 0");
		}
	}
}
