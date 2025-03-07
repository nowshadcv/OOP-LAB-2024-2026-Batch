package MODULE1;
import java.util.Arrays;
import java.util.Scanner;

public class Stringsort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of strings to sort:");
        int count = scan.nextInt();
        scan.nextLine();

        String[] strlist = new String[count];
        System.out.println("Enter your strings:");
        for (int i = 0; i < count; i++) {
            strlist[i] = scan.nextLine();
        }

        System.out.println("Choose sorting method:");
        System.out.println("1: In-built sort");
        System.out.println("2: User-defined sort");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                Arrays.sort(strlist);
                System.out.println("Sorted Strings (In-built): " + Arrays.toString(strlist));
                break;
            case 2:
                for (int i = 0; i < count - 1; i++) {
                    for (int j = i + 1; j < strlist.length; j++) {
                        if (strlist[i].compareTo(strlist[j]) > 0) {
                            String temp = strlist[i];
                            strlist[i] = strlist[j];
                            strlist[j] = temp;
                        }
                    }
                }
                System.out.println("Sorted Strings (User-defined): " + Arrays.toString(strlist));
                break;
           
        }
    }
}
