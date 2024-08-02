import java.util.ArrayList;
import java.util.Scanner;

public class TvShow {
    // Attributes
    private String showName;
    private int numberOfEpisodes;
    private String genre;

    // Constructor
    public TvShow(String showName, int numberOfEpisodes, String genre) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }

    // Getter for showName
    public String getShowName() {
        return showName;
    }

    // Getter for numberOfEpisodes
    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    // Getter for genre
    public String getGenre() {
        return genre;
    }

    // Overriding the toString() method to provide a meaningful representation
    @Override
    public String toString() {
        return "Show Name: " + showName + ", Number of Episodes: " + numberOfEpisodes + ", Genre: " + genre;
    }

    // Main method
    public static void main(String[] args) {
        // Create an ArrayList to store TvShow objects
        ArrayList<TvShow> tvShows = new ArrayList<>();

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Prompt user for the TV show name
            System.out.print("Enter the TV show name (or press Enter to finish): ");
            String showName = scanner.nextLine();

            // If the name is empty, break the loop
            if (showName.isEmpty()) {
                break;
            }

            // Prompt user for the number of episodes
            System.out.print("Enter the number of episodes: ");
            int numberOfEpisodes;
            while (true) {
                try {
                    numberOfEpisodes = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Invalid input. Please enter a valid number for episodes: ");
                }
            }

            // Prompt user for the genre
            System.out.print("Enter the genre of the show: ");
            String genre = scanner.nextLine();

            // Create a new TvShow object and add it to the list
            TvShow tvShow = new TvShow(showName, numberOfEpisodes, genre);
            tvShows.add(tvShow);
        }

        // Close the scanner
        scanner.close();

        // Print the details of all TV shows in the list
        System.out.println("\nTV Show List:");
        for (TvShow tvShow : tvShows) {
            System.out.println(tvShow);
        }
    }
}
