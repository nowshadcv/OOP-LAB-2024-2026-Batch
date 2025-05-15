package MODULE3;

import java.util.Scanner;

class Publisher {
    String publisher;
    Publisher(String publi) {
        this.publisher = publi;
    }
}

class Book {
    String name;
    Publisher publisher;

    public Book(String name, Publisher publisher) {
        this.name = name;
        this.publisher = publisher;
    }
}

class Literature extends Book {
    String Lit_type = "Literature";

    Literature(String name, Publisher publisher) {
        super(name, publisher);
    }

    void display() {
        System.out.println("\nName: " + super.name);
        System.out.println("Type: " + this.Lit_type);
        System.out.println("Publisher: " + this.publisher.publisher);
    }
}

class Fiction extends Book {
    String Lit_type = "Fiction";

    Fiction(String name, Publisher publisher) {
        super(name, publisher);
    }

    void display() {
        System.out.println("\nName: " + super.name);
        System.out.println("Type: " + this.Lit_type);
        System.out.println("Publisher: " + this.publisher.publisher);
    }
}

public class InheritanceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting input for Literature book
        System.out.print("Enter Literature book name: ");
        String litName = scanner.nextLine();
        System.out.print("Enter Literature publisher: ");
        String litPublisher = scanner.nextLine();
        Publisher lp = new Publisher(litPublisher);
        Literature literatureBook = new Literature(litName, lp);
        literatureBook.display();

        // Getting input for Fiction book
        System.out.print("\nEnter Fiction book name: ");
        String ficName = scanner.nextLine();
        System.out.print("Enter Fiction publisher: ");
        String ficPublisher = scanner.nextLine();
        Publisher fp = new Publisher(ficPublisher);
        Fiction fictionBook = new Fiction(ficName, fp);
        fictionBook.display();

        scanner.close();
    }
}
