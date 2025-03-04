package MODULE1;
import java.util.Scanner;

public class Cpu 
{
	double price;
	class Processor
	{
		double cores;
		String manufactures;
		double getcache(double c)
		{
			return c;
		}
	}
	static class RAM
	{
		double memory;
		String manufactures;
		double getClockSpeed(double s)
		{
			return s;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Cpu cpu=new Cpu();
		Cpu.Processor processor= cpu.new Processor();
		Cpu.RAM ram=new Cpu.RAM();
		System.out.println("Enter the cache :");
		double c=sc.nextDouble();
		System.out.println("Enter the Clock Speed :");
		double s=sc.nextDouble();
		System.out.println("processor cache= "+processor.getcache(c));
		System.out.println("RAM clock speed ="+ram.getClockSpeed(s));
		sc.close();
	}
}
