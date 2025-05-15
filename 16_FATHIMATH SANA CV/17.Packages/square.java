
package figures;
interface Figuresquare{
	int perimeter();
	int area();

}
public class square implements Figuresquare
{
	private int side;
	public square(int s) {side = s;}
	public int perimeter() {return (4*side);}
	public int area() {return (side*side);}}


