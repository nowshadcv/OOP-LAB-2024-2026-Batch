package mod4;

interface Student{
	int score=10;
	void displayScore();
}

interface Sports{
	int score=25;
	void displaySports();
}

class Result implements Student ,Sports{
	public void displayScore() {
		System.out.println("Academic score : "+Student.score);
	}
	public void displaySports() {
		System.out.println("sports score : "+Sports.score);
	}
	
}
public class SportResult {

	public static void main(String[] args) {
		Result r = new Result();
		r.displayScore();
		r.displaySports();

	}

}
