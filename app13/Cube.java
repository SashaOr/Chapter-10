package app13;

public class Cube extends ThreeDimensionalShape {

	public Cube(double length) {
		super(length);
	}

	@Override
	public double getArea() {
		return super.getSide1() * super.getSide1() * 6;
	}

	@Override
	public double getVolume() {
		return super.getSide1() * super.getSide1() * super.getSide1();
	}

	@Override
	public String toString() {
		return "Cube";
	}
	
}
