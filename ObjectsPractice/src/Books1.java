import java.util.ArrayList;
import java.util.Scanner;

public class Books1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Books> books = new ArrayList<>();

        books.add(new Books("Hippies by Eric Cartman", 50, 1994));
        books.add(new Books("How to Eradicate Hippies by Eric Cartman", 51, 1995));
        books.add(new Books("Why KFC's New Chicken Sandwhich is the Second Coming and Hippies Should be Afraid by Eric Cartman", 52, 1996));

        System.out.println("Do u want everything or titles only");
        String res2 = in.nextLine();
        if (res2.equalsIgnoreCase("everything")) {
            for (Books book : books) {
                System.out.println(book);
            }
        } else {
            for (Books book : books) {
                System.out.println(book.getTitle());
            }
        }

        in.close();
    }
}