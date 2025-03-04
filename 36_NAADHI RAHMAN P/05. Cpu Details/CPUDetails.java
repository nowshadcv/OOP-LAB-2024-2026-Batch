package MODULE1;
import java.util.Scanner;
public class CPUDetails {

	public static void main(String[] args) {
		double p,m;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the cache processor:");
		p=s.nextDouble();
		System.out.print("enter the clock speed:");
		m=s.nextDouble();
		CPU cpu=new CPU();
		CPU.Processor processor=cpu.new Processor();
		CPU.RAM ram=new CPU.RAM();
		System.out.println("Processor Cache = " + processor.getCache(p));
		System.out.println("RAM Clock speed = " + ram.getClockspeed(m));
	}
}
		
		

	
