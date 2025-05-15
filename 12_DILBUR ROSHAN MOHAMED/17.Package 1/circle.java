package figures;

public class circle implements figureCi {
	private double radius ;
	public circle (double r) {radius=r;}
	public double perimeter() {return (2*3.14*radius);}
	public double area() {return (3.14*radius*radius);}
}
