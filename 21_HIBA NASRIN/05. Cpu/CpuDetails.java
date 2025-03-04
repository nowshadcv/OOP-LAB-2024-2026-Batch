package MODULE_1;

import java.util.Scanner;
public class CpuDetails {
    public static void main(String[] args) {
        
       Cpu cpu=new Cpu();
       Cpu.processor processor = cpu.new processor();
       Cpu.RAM ram = new Cpu.RAM();
       
       Scanner scanner=new Scanner(System.in);
       System.out.print("Enter Processor Cache: ");
       double userCache=scanner.nextDouble();
       processor.getCache();
       System.out.println("User Entered Processor Cache= "+ userCache);
       Scanner Sc=new Scanner(System.in);
       System.out.println("Enter RAM CLock Speed: ");
       double userClockSpeed = scanner.nextDouble();
       System.out.println("User Entered RAM Clock Speed = " + userClockSpeed);
       scanner.close();
       Sc.close();
    }
}