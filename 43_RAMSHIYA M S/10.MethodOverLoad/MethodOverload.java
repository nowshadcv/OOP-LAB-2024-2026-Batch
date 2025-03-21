package MODULE2;
import java.util.Scanner;
public class MethodOverload {
	void area(float n) {
		System.out.println("the area of the square is"+Math.pow(n,2)+"sq unites");}
	void area(float m,float k) {
		System.out.println("the area of the rectangle is "+m*k+"sq units");}
	void area(double r) {
		double z=3.14 * r * r;
		System.out.println("the area of the circle is "+z+ "sq units");}}
	class OverLoad{
	public static void main(String[] args) {
		float n,m,k;
		double r;
		MethodOverload ob=new MethodOverload();
		Scanner in=new Scanner (System.in);
		System.out.println("enter length square");
		n=in.nextFloat();
		ob.area(n);
		System.out.println("enter length ");
		m=in.nextFloat();
		System.out.println("enter the breadth of rectangle");
		k=in.nextFloat();
		ob.area(m, k);
		System.out.println("enter the radius of circle");
		r=in.nextDouble();
		ob.area(r);
		
}}
