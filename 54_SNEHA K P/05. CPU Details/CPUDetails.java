package MODULE_1;

import java.util.Scanner;


public class CPUDetails {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter processor cache: ");
		double p = s.nextDouble();
		System.out.println("Enter RAM Clock speed: ");
		double r = s.nextDouble();
		CPU cpu =new CPU();
		CPU.Processor processor=cpu.new Processor();
		CPU.RAM ram=new CPU.RAM();
		System.out.println("Processor Cache = "+processor.getCache(p));
		System.out.println("RAM Clock speed= "+ ram.getClockSpeed(r));
	}

}          
