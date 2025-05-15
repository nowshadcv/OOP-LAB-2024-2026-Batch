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
        System.out.println("Name: " + super.name);
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
        System.out.println("Name: " + super.name);
        System.out.println("Type: " + this.Lit_type);
        System.out.println("Publisher: " + this.publisher.publisher);
    }
}

public class InheritanceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for number of Literature books
        System.out.print("Enter number of Literature books: ");
        int numLit = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        Literature[] litBooks = new Literature[numLit];
        for (int i = 0; i < numLit; i++) {
            System.out.println("\nEnter details for Literature Book #" + (i+1) + ":");
            System.out.print("Book Name: ");
            String litName = scanner.nextLine();
            System.out.print("Publisher: ");
            String litPublisher = scanner.nextLine();
            
            Publisher lp = new Publisher(litPublisher);
            litBooks[i] = new Literature(litName, lp);
        }
        
        System.out.print("\nEnter number of Fiction books: ");
        int numFic = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        Fiction[] ficBooks = new Fiction[numFic];
        for (int i = 0; i < numFic; i++) {
            System.out.println("\nEnter details for Fiction Book #" + (i+1) + ":");
            System.out.print("Book Name: ");
            String ficName = scanner.nextLine();
            System.out.print("Publisher: ");
            String ficPublisher = scanner.nextLine();
            
            Publisher fp = new Publisher(ficPublisher);
            ficBooks[i] = new Fiction(ficName, fp);
        }
        System.out.println("\n--- Literature Books ---");
        for (Literature book : litBooks) {
            book.display();
            System.out.println();
        }
        
        System.out.println("\n--- Fiction Books ---");
        for (Fiction book : ficBooks) {
            book.display();
            System.out.println();
        }
        
        scanner.close();
    }
}
