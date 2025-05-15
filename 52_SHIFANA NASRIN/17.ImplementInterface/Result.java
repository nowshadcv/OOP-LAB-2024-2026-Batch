package module;

public class Result  implements Student,Sports{

	@Override
	public void displaySportsScore() {
		System.out.println("sports score is:"+Sports.score);
	}

	@Override
	public void displayScore() {
		System.out.println("Academic Score is:"+Student.score);
		
	}
	

}
