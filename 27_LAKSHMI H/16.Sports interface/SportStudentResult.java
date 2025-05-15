package MODULE4;
import java.util.Scanner;

interface Student{
	void displayScore();
}

interface Sports{
	void displaySportsScore();
}

class Result implements Student,Sports{
	int academicScore;
	int sportsScore;
	
	Result(int academicScore,int sportsScore){
		this.academicScore=academicScore;
		this.sportsScore=sportsScore;
	}
	public void displayScore() {
		System.out.println("Academic score:"+academicScore);
	}
	
	public void displaySportsScore() {
		System.out.println("Sports score:"+sportsScore);
	}
	
}
public class SportStudentResult {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the academic score:");
		int academicScore=sc.nextInt();
		
		System.out.println("Enter the Sports score:");
		int sportsScore=sc.nextInt();
		
		Result r=new Result(academicScore,sportsScore);

		r.displayScore();
		r.displaySportsScore();
	}

}
