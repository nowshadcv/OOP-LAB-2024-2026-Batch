package Module_1;

public class CPUDetails {
	public static void main (String [] args) {
		CPU cpu = new CPU() ;
		CPU.Processor processor = cpu.new Processor() ;
		CPU.RAM ram = new CPU.RAM() ;
		
		double s =processor.getCache();
		double c = ram.getClockSpeed();
		System.out.println("Processor Cache = " + s + " Mb") ;
		System.out.println("RAM Clock speed = " + c + " GHz") ;
	}

}
