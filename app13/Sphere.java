package app13;

public class Sphere extends ThreeDimensionalShape {

	public Sphere(double radius) {
		super(radius);
	}

	@Override
	public double getArea() {

		return 4 * Math.PI * Math.pow(super.getSide1(), 2);
	}

	@Override
	public double getVolume() {

		return 4 / 3 * Math.PI * Math.pow(super.getSide1(), 3);
	}
	
	@Override
	public String toString() {
		return "Sphere";
	}

}
