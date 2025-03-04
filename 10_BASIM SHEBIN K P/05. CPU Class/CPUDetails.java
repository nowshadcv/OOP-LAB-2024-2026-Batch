package MODULE_1;

import java.util.Scanner;

public class CPUDetails {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		double c,sp;
		System.out.println("Enter the cache:");
		c = s.nextDouble();
		System.out.println("Enter the clock speed:");
		sp = s.nextDouble();

		CPU cpu = new CPU();
		CPU.Processor processor = cpu.new Processor();
		CPU.RAM ram = new CPU.RAM();
		System.out.println("Processor Cache :"+processor.getCache(c));
		System.out.println("RAM clockspeed :"+ram.getClockSpeed(sp));
		
	}

}
