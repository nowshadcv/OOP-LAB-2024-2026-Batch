package MODULE1;

public class Cpu {
    double price;

    
    class processor {
        double cores;
        String manufacturer;
        
        double getCache() {
            return 4.3;
        }
    }

   
    static class RAM {
        double memory;
        String manufacturer;

        double getClockspeed() {
            return 5.5;
        }
    }
}

