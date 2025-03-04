package module_1;

import java.util.Scanner;

class CPU 
{
    double price;

    class Processor 
    {
        double cores;
        String manufacturer;
        double cache;

        double getCache() 
        {
            return cache;
        }
    }

    static class RAM 
    {
        double memory;
        String manufacturer;
        double clockSpeed;

        double getClockSpeed() 
        {
            return clockSpeed;
        }
    }
}

public class CpuDetails 
{
    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);

        CPU cpu = new CPU();

        CPU.Processor processor = cpu.new Processor();

        System.out.print("Enter cache value for the processor: ");
        processor.cache = scanner.nextDouble();
        scanner.nextLine(); 

        CPU.RAM ram = new CPU.RAM();

        System.out.print("Enter clock speed for RAM: ");
        ram.clockSpeed = scanner.nextDouble();
        
        System.out.println("\nProcessor Details:");
        System.out.println("Processor Cache = " + processor.getCache() + " MB");
       
        System.out.println("RAM Clock Speed = " + ram.getClockSpeed() + " GHz");
    }
}
