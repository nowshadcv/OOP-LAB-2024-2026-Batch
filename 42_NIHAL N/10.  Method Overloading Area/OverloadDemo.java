package MODULE2;

public class OverloadDemo {
	void area(long x) {
		long a = x * x;
		System.out.println("Area of Square is: "+a+" sq units");
	}
	void area(float x, float y) {
		float a = x * y;
		System.out.println("Area of Rectangle is: "+a+" sq units");
	}
	void area(double x) {
		double a = Math.PI*x*x;
		System.out.println("Area of Circle is: "+a+" sq units");
	}
}
