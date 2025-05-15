package figures;

 interface figureci{
	double perimeter();
	double area();
}
public class circle implements figureci
{
	private double radius;
	public circle(double r) {radius=r;}
	public double perimeter() {return(2*3.14*radius);}
	public double area() {return(3.14*radius*radius);}
}
