package module;

public class Result implements Student,Sports {


	@Override
	public void displayScore() {
		System.out.println("Academic Score is: "+Student.score);
		
	}

	@Override
	public void displaySportsScore() {
		System.out.println("Sports Score is: "+Sports.score);
		
	}

}
