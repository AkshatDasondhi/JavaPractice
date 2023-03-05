import java.util.Scanner;

class Students {
    String name;
    String email;
    public void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student name and email address : ");
        name = sc.nextLine();
        email = sc.nextLine();
        sc.close();
    }
    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Email : " + email);
    }
}
class Book {
    String title;
    String author;
    public void readB() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Book Title and Author Name : ");
        title = sc.nextLine();
        author = sc.nextLine();
        sc.close();
    }
    void displayB() {
        System.out.println("Book Title : " + title);
        System.out.println("Book Author : " + author);
    }
}

class EnggStudent extends Students {
    String branch = "Computer Science";
    void displayBranch() {
        System.out.println(branch);
    }
}
class ArtStudent {
    String subject = "Arts";
}
public class Aggregation {
    public static void main(String[] args) {
        Students student1 = new Students();
        EnggStudent student2 = new EnggStudent();
        student1.readData();
        Book book1 = new Book();
        book1.readB();
        student1.display();
        book1.displayB();
        student2.displayBranch();
    }
}
