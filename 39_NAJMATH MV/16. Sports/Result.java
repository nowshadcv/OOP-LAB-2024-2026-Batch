package figures;

public class Result implements Student ,Sports {
	 public void displayscore() {
		 System.out.println("Academic score is:"+Student.score);
	 }
		 public void displaySportsScore() {
			 System.out.println("Sports score is:"+ Sports.score);
		 }
	 
 }
