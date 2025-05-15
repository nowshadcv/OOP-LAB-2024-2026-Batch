package MODULE3;


import java.util.Scanner;


interface Student {
    int getScore();
    void displayScore();
}

interface Sports {
    int getSportsScore();
    void displaySportsScore();
}

class Result implements Student, Sports {
    private int academicScore;
    private int sportsScore;

    // Constructor to initialize scores from user input
    public Result(int academicScore, int sportsScore) {
        this.academicScore = academicScore;
        this.sportsScore = sportsScore;
    }

    public int getScore() {
        return academicScore;
    }

    public int getSportsScore() {
        return sportsScore;
    }

    public void displayScore() {
        System.out.println("Academic Score is: " + getScore());
    }

    public void displaySportsScore() {
        System.out.println("Sports Score is: " + getSportsScore());
    }
}

public class SportStudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Academic Score: ");
        int academicScore = sc.nextInt();

        System.out.print("Enter Sports Score: ");
        int sportsScore = sc.nextInt();

        Result r = new Result(academicScore, sportsScore);
        r.displayScore();
        r.displaySportsScore();

        sc.close();
    }
}
