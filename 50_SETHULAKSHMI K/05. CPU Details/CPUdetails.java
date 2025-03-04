
package MODULE;

import java.util.Scanner;

public class CPUdetails{
	public static void main(String[] args) {
		CPU cpu = new CPU();
		Scanner name = new Scanner(System.in);
		System.out.println("What's cache of your processor");
		double cache = name.nextDouble();
		System.out.println("Ram ClockSpeed?");
		double clockSpeed = name.nextDouble();
		CPU.Processor p = cpu.new Processor(cache);
		CPU.Ram ram = new CPU.Ram(clockSpeed);
		name.close();
		System.out.println("Processor Cache  "+p.getCache());
		System.out.println("Ram Clock Speed  "+ram.getClockSpeed()+" GHz");
	}
	
}
