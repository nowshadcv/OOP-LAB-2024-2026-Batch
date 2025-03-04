package MODULE1;

import java.util.Scanner;

public class CpuDetails {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		double c,sp;
		System.out.println("Enter the cache:");
		c = s.nextDouble();
		System.out.println("Enter the clock speed:");
		sp = s.nextDouble();

		Cpu cpu = new Cpu();
		Cpu.Processor processor = cpu.new Processor();
		Cpu.RAM ram = new Cpu.RAM();
		System.out.println("Processor Cache :"+processor.getCache(c));
		System.out.println("RAM clockspeed :"+ram.getClockSpeed(sp));
		
	}

}