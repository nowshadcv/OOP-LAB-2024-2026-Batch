package MODULE_1;
import java.util.Scanner;
public class CPUDetails {
	public static void main(String[] args) {
		CPU cpu = new CPU();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your Cache :");
		double cache = sc.nextDouble();
		
		System.out.println("Enter your RAM clockspeed :");
		double clockspeed = sc.nextDouble();
		
		CPU.Processor processor = cpu.new Processor(cache);
		CPU.RAM ram = new CPU.RAM(clockspeed);
		
		System.out.println("Processor Cache = " + processor.getCach());
		System.out.println("RAM CLock speed = " + ram.getClockSpeed());
		
		sc.close();
	}
}
