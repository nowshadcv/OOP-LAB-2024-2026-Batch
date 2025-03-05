package module_1;

import java.util.Scanner;

class CPU {
    double price;

    class Processor {
        double cores;
        String manufacturer;
        double cache;

        double getCache() {
            return cache;
        }
    }

    static class RAM {
        double memory;
        String manufacturer;
        double clockSpeed;

        double getClockSpeed() {
            return clockSpeed;
        }
    }
}
