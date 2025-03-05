package MODULE_1;

import java.util.Scanner;

public class CPU {
	Scanner s = new Scanner(System.in);
	double c,sp;
	double price;
	class Processor
	{
		double cores;
		String manufacturer;
		double getCache()
		{
			System.out.println("Enter the cache:");
			c = s.nextDouble();
			return c;
		}
	}
	
	static class RAM
	{
		double memory;
		String manufacturer;
		double getClockSpeed()
		{
			System.out.println("Enter the clock speed:");
			sp = s.nextDouble();
			return sp;
		}
	}

}
