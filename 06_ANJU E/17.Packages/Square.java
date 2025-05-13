package figures;

interface FigureSquare {
	int perimeter();
	int area();
}
public class Square implements FigureSquare{
	private int side;
	public Square(int s) {side=s;}
	public int perimeter() {return(4*side);}
	public int area() {return(side*side);}}










