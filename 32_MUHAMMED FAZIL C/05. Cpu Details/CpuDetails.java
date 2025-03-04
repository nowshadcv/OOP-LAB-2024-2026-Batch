package MODULE1;

import java.util.Scanner;

class CPU {
	double price;
	class Processor{
		double cores;
		String manufacturer;
		double cache;
		double clockSpeed;
		double getcache() {
			return cache;
		}
	}
	static class RAM{
		double memory;
		String manufacturer;
		double clockSpeed;
		double getClockSpeed() {
			return clockSpeed;
		}
	}
}

public class CPUDetails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CPU cpu = new CPU();
		CPU.Processor processor = cpu.new Processor();
		
		System.out.println("Enter Cache Value for the Processor: ");
		processor.cache = scanner.nextDouble();
		scanner.nextLine();
		CPU.RAM ram = new CPU.RAM();
		System.out.println("Enter Clock Speed For Ram: ");
		processor.clockSpeed = scanner.nextDouble();
		System.out.println("Processor Cache = "+ processor.getcache());
		System.out.println("RAM Clock Speed = "+ ram.getClockSpeed());
	}
}
