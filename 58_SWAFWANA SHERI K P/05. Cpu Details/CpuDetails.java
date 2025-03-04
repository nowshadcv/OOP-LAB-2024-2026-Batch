package MODULE1;

import java.util.Scanner;

public class CpuDetails {

	public static void main(String[] args) {
		
			Scanner s=new Scanner(System.in);
			Cpu cpu=new Cpu();
			Cpu.Processor processor=cpu.new Processor();
			Cpu.RAM ram=new Cpu.RAM();
			System.out.print("Enter the cache: ");
			double cache=s.nextDouble();
			System.out.print("Enter the Clock Speed: ");
			double clockspeed=s.nextDouble();
			
			System.out.println("Processor Cache= "+processor.getCache(cache));
			System.out.println("Processor Cache= "+ram.getClockSpeed(clockspeed));
			}
			


	}


