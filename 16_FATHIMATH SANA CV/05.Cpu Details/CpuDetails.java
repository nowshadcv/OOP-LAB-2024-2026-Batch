package MODULE1;

import java.util.Scanner;

public class CpuDetails{
	public static void main(String[] args) {
		Cpu cpu = new Cpu();
		Scanner s = new Scanner(System.in);
		System.out.println("What's cache of your processor");
		double cache = s.nextDouble();
		System.out.println("Ram ClockSpeed?");
		double clockSpeed = s.nextDouble();
		Cpu.Processor p = cpu.new Processor(cache);
		Cpu.Ram ram = new Cpu.Ram(clockSpeed);
		s.close();
		System.out.println("Processor Cache  "+p.getCache()+" MB");
		System.out.println("Ram Clock Speed  "+ram.getClockSpeed()+" GHz");
//		System.out.println(p.getCache(cache));
//		System.out.println(ram.getClockSpeed(clockSpeed));
	}
	
}