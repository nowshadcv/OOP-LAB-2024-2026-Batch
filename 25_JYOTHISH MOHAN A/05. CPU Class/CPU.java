package MODULE1;
import java.util.Scanner;


class CPUDetails {
	double price;
	class Processor{
		double cores;
		String manufacturer;
		double getCache(double f) {
			return f;}}
	static class RAM{
		double memory;
		String manufacturer;
		double getClockSpeed(double r) {
			return r;}}
		}
public class CPU {
	public static void main(String[] args) {
		double p,m;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cache of processor:");
		p=sc.nextDouble();
		
		System.out.println("Enter the clock speed:");
		m=sc.nextDouble();
		
		CPUDetails cpu=new CPUDetails();
		CPUDetails.Processor processor=cpu.new Processor();
		CPUDetails.RAM ram=new CPUDetails.RAM();
		
		
		System.out.println("Processor Cache ="+processor.getCache(p));
		System.out.println("RAM clock speed ="+ram.getClockSpeed(m));
		}
}