package app13;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {

		List<Shape> shapeList = new ArrayList<Shape>() {
			{
				add(new Circle(10));
				add(new Triangle(3, 3, 3));
				add(new Square(5));
				add(new Sphere(17));
				add(new Cube(8));
				add(new Tetrahedron(9));
			}
		};

		for (Shape shape : shapeList) {
			if (shape instanceof TwoDimensionalShape) {
				System.out
						.println("Area of this " + shape + " = " + ((TwoDimensionalShape) shape).getArea());
			} else if (shape instanceof ThreeDimensionalShape) {
				System.out
						.println("Area of this " + shape + " = " + ((ThreeDimensionalShape) shape).getArea()
								+ " | Volume of this figure = " + ((ThreeDimensionalShape) shape).getVolume());
			}
		}

	}
}
