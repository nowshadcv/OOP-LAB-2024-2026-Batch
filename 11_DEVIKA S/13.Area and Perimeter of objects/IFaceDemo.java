package MODULE3;
import java.util.Scanner;
public class IFaceDemo {
	public static void main(String[] args) {
		int ch;
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Area of Circle");
		System.out.println("2:Area of Rectangle");
		System.out.println("3:Perimeter of Circle");
		System.out.println("4:Perimeter of Rectangle");
		System.out.println("5:Program termination");
		lp:while(true) {
			System.out.print("Make your choice:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.print("Enter the radius of the Circle\n");
				c.input();
				c.area();
				break;
			case 2:
				System.out.print("Enter the length and breadth of the Rectangle\n");
				r.input();
				r.area();
				break;
			case 3:
				System.out.print("Enter the radius of the Circle\n");
				c.input();
				c.perimeter();
				break;
			case 4:
				System.out.print("Enter the length and breadth of the Rectangle\n");
				r.input();
				r.perimeter();
				break;
			case 5:
				break lp;
				default:
					System.out.println("Invalid choice! Please make a valid choice...");
			}
		}
	}
}
