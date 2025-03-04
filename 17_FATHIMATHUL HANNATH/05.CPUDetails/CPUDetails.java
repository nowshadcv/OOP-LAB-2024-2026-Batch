package MODULE_1;

class CPU {
	double price ;
	class processor {
		double cores ;
		String manufacturer;
		double getCache ( ) {
			return 4.3 ; }}
	static class RAM{
		double memory ;
		String manufacturer ; 
		double getClockSpeed() {
			return 5.5 ; }}}
public class CPUDetails {
	public static void main(String[] args) {
		CPU cpu = new CPU();
		CPU.processor processor = cpu.new processor() ;
		CPU.RAM ram = new CPU.RAM();
		System.out.println(("processor cache = " + processor.getCache()));
		System.out.println("ram clock speed = " + ram.getClockSpeed());
		
		}
	}


