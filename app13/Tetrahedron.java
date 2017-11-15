package app13;

public class Tetrahedron extends ThreeDimensionalShape {

	public Tetrahedron(double length) {
		super(length);
	}

	@Override
	public double getArea() {

		return super.getSide1() * super.getSide1() * Math.sqrt(3);
	}

	@Override
	public double getVolume() {

		return super.getSide1() * super.getSide1() * super.getSide1() * (Math.sqrt(2) / 12);
	}

	@Override
	public String toString() {
		return "Tetrahedron";
	}
}
