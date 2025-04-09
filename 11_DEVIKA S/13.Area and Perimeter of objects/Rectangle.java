package MODULE3;
import java.util.Scanner;
public class Rectangle {
	int l=0,b=0;
	double area,perimeter;
	public void input() {
		Scanner r=new Scanner(System.in);
		l=r.nextInt();
		b=r.nextInt();
}
	public void area(){
		area=l*b;
		System.out.println("Area of rectangle:"+area);
	}
	public void perimeter() {
		perimeter=2*(l+b);
		System.out.println("Perimeter of rectangle:"+perimeter);
	}

}
