package MODULE2;

public class OverloadDemo {
	void area(float x) {
		System.out.println("the area of the square is" +Math.pow(x,2)+" sq unit");}
	void area(float x,float y){
		System.out.println("the area of the reactaangle is" +x*y+" sq unit");}
	void area(double x) {
		double z=3.14*x*x;
		System.out.println("the area of the circle is "+z+" sq units");}}

	
	
