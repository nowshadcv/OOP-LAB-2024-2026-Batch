package module_1;
public class CPU{
	double price;
	class Processor{
		double cores;
		String Manufacturer;
		double Cache;
		public Processor(double cache)
		{
			Cache = cache;
		}
		double getCache() {
			return Cache;
		}
//		double getCache(double a) {return a}
	}
	static class Ram{
		double memory,clockSpeed;
		String Manufacurer;
		Ram(double cs)
		{
			clockSpeed = cs;
		}
		double getClockSpeed() {
			return clockSpeed;
		}
//		double getClockSpeed(double b) {return b}
	}

}
