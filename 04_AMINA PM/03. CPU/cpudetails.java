package MODULE1;

import java.util.Scanner;
public class cpudetails {
    public static void main(String[] args) {
        
       cpu cpu=new cpu();
       cpu.Processor processor = cpu.new Processor();
       cpu.RAM ram = new cpu.RAM();
       
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