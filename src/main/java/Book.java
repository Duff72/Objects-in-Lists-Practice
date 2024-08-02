import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    // Attributes
    private String title;
    private int numberOfPages;
    private int publicationYear;

    // Constructor
    public Book(String title, int numberOfPages, int publicationYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for numberOfPages
    public int getNumberOfPages() {
        return numberOfPages;
    }

    // Getter for publicationYear
    public int getPublicationYear() {
        return publicationYear;
    }

    // Overriding the toString() method to provide a meaningful representation
    @Override
    public String toString() {
        return "Title: " + title + ", Pages: " + numberOfPages + ", Year: " + publicationYear;
    }

    // Main method
    public static void main(String[] args) {
        // Create an ArrayList to store Book objects
        ArrayList<Book> books = new ArrayList<>();

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Prompt user for the book title
            System.out.print("Enter the title of the book (or press Enter to finish): ");
            String title = scanner.nextLine();

            // If the title is empty, break the loop
            if (title.isEmpty()) {
                break;
            }

            // Prompt user for the number of pages
            System.out.print("Enter the number of pages: ");
            int numberOfPages;
            while (true) {
                try {
                    numberOfPages = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Invalid input. Please enter a valid number for pages: ");
                }
            }

            // Prompt user for the publication year
            System.out.print("Enter the publication year: ");
            int publicationYear;
            while (true) {
                try {
                    publicationYear = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Invalid input. Please enter a valid year: ");
                }
            }

            // Create a new Book object and add it to the list
            Book book = new Book(title, numberOfPages, publicationYear);
            books.add(book);
        }



        // Ask user what to print
        System.out.print("What would you like to print? (name/everything): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        // Print the requested information
        System.out.println("\nBook List:");
        for (Book book : books) {
            if (choice.equals("everything")) {
                System.out.println(book);
            } else if (choice.equals("name")) {
                System.out.println(book.getTitle());
            } else {
                System.out.println("Invalid choice.");
                break;
            }
        }
    }
}
