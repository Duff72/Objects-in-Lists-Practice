import java.util.ArrayList;
import java.util.Scanner;

public class Animal {

    private String name;
    private boolean isDog;


    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }


    public String getName() {
        return name;
    }


    public boolean isDog() {
        return isDog;
    }


    @Override
    public String toString() {
        return "Animal Name: " + name + ", Is Dog: " + (isDog ? "Yes" : "No");
    }


    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Animal Menu");
            System.out.println("Entering nothing will stop the loop");
            System.out.println("Please enter a name:");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("Is it a dog? Yes or no: ");
            String isDogInput = scanner.nextLine().trim().toLowerCase();
            boolean isDog;


            if (isDogInput.equals("yes")) {
                isDog = true;
            } else if (isDogInput.equals("no")) {
                isDog = false;
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                continue;
            }

            Animal animal = new Animal(name, isDog);
            animals.add(animal);
        }

        System.out.println("\nAnimal List:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}

