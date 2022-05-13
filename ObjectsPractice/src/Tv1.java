import java.util.ArrayList;
import java.util.Scanner;

public class Tv1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        ArrayList<Tv1> tvShows = new ArrayList<>();
        System.out.println("Okay Ill  help u list ur fav tv shows ...");
        System.out.println("To stop, do empty line ");

        int numShows = 0;
        while (true) {
            System.out.println("Show name?");
            String showName = in.nextLine();
            if (showName == "") {
                break;
            }

            System.out.println("Num of episodes in show is: ");
            int numEpisodes = Integer.parseInt(in.nextLine());
            
            System.out.println("Genre of show is:");
            String genre = in.nextLine();

            tvShows.add(new Tv(showName, numEpisodes, genre));
            numShows++;
        }

        System.out.println("list of shows i made for u based on what u entered is:");

        for (Tv1 show : tvShows) {
            System.out.println(show);
        }

        System.out.println("See this: ");
        int i = 0;
        while (i < numShows) {
            System.out.println(" oop");
            i++;
        }
        in.close();
    }
}