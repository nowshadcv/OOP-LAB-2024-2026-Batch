package MODULE2;
import java.util.Scanner;
public class CPUdetails {
	public static void main(String[] args) {
		CPU cpu = new CPU();
		Scanner sc = new Scanner(System.in);
		System.out.println("Processor Cache:");
		double cache = sc.nextDouble();
		System.out.println("Ram ClockSpeed:");
		double clockSpeed = sc.nextDouble();
		CPU.Processor p = cpu.new Processor(cache);
		CPU.Ram ram = new CPU.Ram(clockSpeed);
		sc.close();
		System.out.println("Processor Cache  "+p.getCache());
		System.out.println("Ram Clock Speed  "+ram.getClockSpeed()+" GHz");
	}
}
