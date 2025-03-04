package MODULE1;

import java.util.Scanner;

class CPU{
	double price;
	class Processor{
		double cores;
		String manufacturer;
		double cache;
		double getcache() {
			return cache ;
		}
	}
	static class RAM{
		double memory;
		String manufacturer;
		double clockSpeed;
		double getClockSpeed() {
			return 5.5;
		}
	}
}

public class CPUDetails {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		CPU cpu = new CPU();
		CPU.Processor processor = cpu.new Processor();
		System.out.print("enter cache : ");
		processor.cache = scanner.nextDouble();
		scanner.nextLine();
		
		CPU.RAM ram = new CPU.RAM();
		
		System.out.print("Enter clock speed for RAM: ");
        ram.clockSpeed = scanner.nextDouble();
		
		System.out.println(("Processor Cache = "+ processor.getcache()));
		System.out.println("RAM Clock Speed = "+ ram.getClockSpeed());
	}
}

