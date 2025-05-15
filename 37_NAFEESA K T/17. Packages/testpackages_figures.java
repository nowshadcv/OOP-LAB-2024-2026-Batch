package test;


import figures.*;

import java.util.Scanner;

public class testpackages_figures 
{
public static void main(String srgs[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the side of square:");
	int s=sc.nextInt();
	square sq=new square(s);
	System.out.println("perimeter:"+sq.perimeter());
	System.out.println("area:"+sq.area());
	System.out.println("enter the radius of circle:");
	int r=sc.nextInt();
	circle ci=new circle(r);
	System.out.println("perimeter:"+ci.perimeter());
	System.out.println("area:"+ci.area());
	System.out.println("enter the side1 of triangle:");
	int s1=sc.nextInt();
	System.out.println("enter the side2 of triangle:");
	int s2=sc.nextInt();
	System.out.println("enter the side3 of triangle:");
	int s3=sc.nextInt();
	triangle tr=new triangle(s1,s2,s3);
	System.out.println("perimeter:"+tr.perimeter());
	System.out.println("area:"+tr.area());
	}
}
	
	
