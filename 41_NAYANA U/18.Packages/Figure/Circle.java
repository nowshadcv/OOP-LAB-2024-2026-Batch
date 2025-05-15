package figures;

public class Circle implements FigureCi {
	private double radius;
	public Circle(double r) {
		radius=r;
	}

	@Override
	public double perimeter() {
		return (radius*3.14*2);
	}

	@Override
	public double area() {
		return (radius*radius*3.14);
	}

}
