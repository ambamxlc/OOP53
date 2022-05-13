import java.util.Scanner;

public class Counters1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Counter will be created starting at 0 ");
        Counters count0 = new Counters();
        System.out.println(count0);
        System.out.println("Increment it ");
        count0.increase();
        System.out.println(count0);
        System.out.println("Decrement it ");
        count0.decrease();
        System.out.println(count0);

        System.out.println("Counter will be made with with the starting val ");
        System.out.print("Enter value a here pls: ");
        int startVal = Integer.parseInt(in.nextLine());
        Counters countVal = new Counters(startVal);
        System.out.println(countVal);
        System.out.println("Enter value to increase by here pls : ");
        int incrVal = Integer.parseInt(in.nextLine());
        countVal.increase(incrVal);
        System.out.println(countVal);
        System.out.println("Enter value to decrease by here pls: ");
        int decrVal = Integer.parseInt(in.nextLine());
        countVal.decrease(decrVal);
        System.out.println(countVal);

        in.close();
    }
}