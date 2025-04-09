package MODULE_3;

import java.util.Scanner;
interface AP{
	void input();
	void area();
	void peri();
}
class Circle implements AP{
	int r=0;
	double pi=3.14,area=0,peri=0;
	public void input() {
		Scanner c = new Scanner(System.in);
		r=c.nextInt();
	}
	public void area(){
		area = pi*r*r;
		System.out.println("Area of circle: "+area);
	}
	public void peri() {
		peri = 2*pi*r;
		System.out.println("Perimeter of circle: "+peri);
	}
}

class Rectangle implements AP{
	int l=0,b=0;
	double area,peri;
	public void input() {
		Scanner r = new Scanner(System.in);
		l=r.nextInt();
		b=r.nextInt();
	}
	public void area(){
		area = l*b;
		System.out.println("Area of rectangle: "+area);
	}
	public void peri() {
		peri = 2*(l+b);
		System.out.println("Perimeter of rectangle: "+peri);
	}
}

public class IFaceDemo {

	public IFaceDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int ch;
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1. Area of circle");
		System.out.println("2. Area of rectangle");
		System.out.println("3. perimeter of circle");
		System.out.println("4.perimeter of rectangle");
		System.out.println("5. program termination");
		lp: while(true) {
			System.out.println("make your choice: ");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("enter the radius of circle: ");
				c.input();
				c.area();
				break;
			case 2:
				System.out.println("enter length and breadth of rectangle");
				r.input();
				r.area();
				break;
			case 3:
				System.out.println("enter the radius of circle: ");
				c.input();
				c.area();
				break;
			case 4:
				System.out.println("enter length and breadth of rectangle: ");
				r.input();
				r.area();
				break;
			case 5:
				break lp;
			default:
				System.out.println("invalid choice!!!");
			}
		}

	}

}
