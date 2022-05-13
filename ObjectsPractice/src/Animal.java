import java.util.ArrayList;
import java.util.Scanner;

public class Animal {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        ArrayList<Animal> animals = new ArrayList<>();
        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");

        while (true) {
            System.out.println("Please enter a name: ");
            String name = in.nextLine();
            if (name == "") {
                break;
            }

            System.out.println("Is" + name + "a dog? yes or no: ");
            boolean dogStats;
            String ans = in.nextLine();
            if (ans.equalsIgnoreCase("yes ")) {
                dogStats = true;
            } else {
                dogStats = false;
            }

            animals.add(new Animal(name, dogStats));
        }

        System.out.println("Looks like animals are back on the menu, boys:");

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        in.close();
    }
}