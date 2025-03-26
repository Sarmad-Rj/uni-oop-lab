//Scenario 4: Publishing Company System
//A publishing company markets both book and audio-cassette versions of its works. The system should include:
//         A Publication class with title and price attributes.
//         A Book class derived from Publication that adds a pageCount attribute.
//         A Tape class derived from Publication that adds a playingTime attribute (in minutes).
//Problem Statement:
//         Implement set() and get() methods for each class.
//         Implement a display() function in each class to print its details.
//         Write a main() method to create instances of Book and Tape, allowing user input for details and displaying them using display()

package Assignment_2;

import java.util.Scanner;
public class P4_Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ROLL NO: SP24-BCS-069\nNAME: SARMAD\n ");

        // Create and initialize a Book instance
        System.out.println("Enter details for a Book:");
        P4_Book book = new P4_Book();
        System.out.print("Title: ");
        book.setTitle(scanner.nextLine());
        System.out.print("Price: ");
        book.setPrice(scanner.nextDouble());
        System.out.print("Page Count: ");
        book.setPageCount(scanner.nextInt());
        scanner.nextLine(); // Consume newline

        // Create and initialize a Tape instance
        System.out.println("\nEnter details for a Tape:");
        P4_Tape tape = new P4_Tape();
        System.out.print("Title: ");
        tape.setTitle(scanner.nextLine());
        System.out.print("Price: ");
        tape.setPrice(scanner.nextDouble());
        System.out.print("Playing Time (in minutes): ");
        tape.setPlayingTime(scanner.nextInt());

        // Display details
        System.out.println("\nDetails of the Book:");
        book.display();
        System.out.println("\nDetails of the Tape:");
        tape.display();

        scanner.close();
    }
}
