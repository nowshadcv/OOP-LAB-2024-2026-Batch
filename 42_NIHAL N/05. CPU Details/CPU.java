package MODULE1;
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
	}

}