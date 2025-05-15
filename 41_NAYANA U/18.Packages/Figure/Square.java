package figures;

public class Square implements FigureSq{
	private int side;

	public Square(int s) {
		side =s;
	}

	@Override
	public int perimeter() {
		return (4*side);
	}

	@Override
	public int area() {
	
		return (side*side);
	}

}
