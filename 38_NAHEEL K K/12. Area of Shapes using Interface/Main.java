package module_3.interface_1;

abstract class  Car{
	public abstract void drive();
	public void playMusic() {
		System.out.println("Play Music");
	}
}


class Wagonr extends Car {
	public void drive() {
		System.out.println("Car is Driving");
	}
	public void playMusic() {
		System.out.println("Car is playing music");
	}

}

public class Main{
	public static void main(String[] args) {
		Wagonr white = new Wagonr();
		white.drive();
		white.playMusic();
	}
	
}