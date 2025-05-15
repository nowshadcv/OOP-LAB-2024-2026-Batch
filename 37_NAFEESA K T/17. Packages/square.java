package figures;


interface figuresq{
	double perimeter();
	double area();
}

public class square implements figuresq
{
	private int side;
	public square(int s) {side=s;}
	public double perimeter() {return(4*side);}
	public double area() {return(side*side);}
}
