package MODULE1;

public class CPUdetails {
public static void main(String[] args) {
   
    CPU cpu = new CPU();

  
    CPU.processor processor = cpu.new processor();

  
    CPU.RAM ram = new CPU.RAM();

  
    System.out.println("Processor cache = " + processor.getCache());
    System.out.println("RAM clock speed = " + ram.getClockspeed());
}
}
