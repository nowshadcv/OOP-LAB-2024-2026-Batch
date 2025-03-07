package MODULE5;

public class CPU {
	double price;
	class Processor{
		double cores,Cache;
		String manufacturer;
		Processor(double cache){
			Cache = cache;
		}
		double getCach() {
			return Cache;
		}
	}
	static class RAM{
		double memory,Clockspeed;
		String manufacturer;
		RAM(double clockspeed){
			Clockspeed = clockspeed;
		}
		double getClockSpeed() {
			return Clockspeed;
		}
	}
}
