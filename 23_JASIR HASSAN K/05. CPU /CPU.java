package Module_1;
import java.util.Scanner;

public class CPU {
	Scanner sc = new Scanner(System.in);
	double price;
	double s;
	class Processor {
		double cores ;
		String manufacturer ;
		double getCache ( ) {
			System.out.println("Enter the Cache:");
			s = sc.nextDouble();
			return s;
		}
	}
	static class RAM {
		Scanner sc = new Scanner(System.in);
		double memory ;
		double c;
		String manufacturer ;
		double getClockSpeed() {	
			System.out.println("Enter the Clock speed:");
			c = sc.nextDouble();
			return c ;
		}
	}
}
