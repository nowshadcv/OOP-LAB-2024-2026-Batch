package module1;
import java.util.Scanner;

interface Student {
    void sinput();
    void sdisplay();
}

interface Sports {
    void kinput();
    void kdisplay();
}

class Result implements Student, Sports {
    float sscore, kscore;
    Scanner sc = new Scanner(System.in);

    public void sinput() {
        System.out.print("Enter academic score: ");
        sscore = sc.nextFloat();
    }

    public void sdisplay() {
        System.out.println("Academic score = " + sscore);
    }

    public void kinput() {
        System.out.print("Enter sports score: ");
        kscore = sc.nextFloat();
    }

    public void kdisplay() {
        System.out.println("Sports score = " + kscore);
    }
}

public class SportsStudentResult {
    public static void main(String[] args) {
        Result r = new Result();
        r.sinput(); 
        r.sdisplay();
        r.kinput();
        r.kdisplay();
    }
}
