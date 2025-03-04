package MODULE1;

import java.util.Scanner;

public class CPUDetails{
	public static void main(String[] args) {
		CPU cpu = new CPU();
		Scanner s = new Scanner(System.in);
		System.out.println("What's cache of your processor");
		double cache = s.nextDouble();
		System.out.println("Ram ClockSpeed?");
		double clockSpeed = s.nextDouble();
		CPU.Processor p = cpu.new Processor(cache);
		CPU.Ram ram = new CPU.Ram(clockSpeed);
		s.close();
		System.out.println("Processor Cache  "+p.getCache());
		System.out.println("Ram Clock Speed  "+ram.getClockSpeed()+" GHz");
	}
	
}