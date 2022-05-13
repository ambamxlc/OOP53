import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount1 {
    public static ArrayList<BankAccount> bankAccounts = new ArrayList<>();
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        bankAccounts.add(new BankAccount("Jimin", 3_000, 100));
        bankAccounts.add(new BankAccount("Jungkook", 1_000, 101));

        System.out.println("Hi I'm bank, welcome. ");

        while (true) {
            System.out.println("Already exist as a customer here? to escape this cruel world press 0.");
            System.out.println("1. Yah ");
            System.out.println("2. Nah ");

            int input = Integer.parseInt(in.nextLine());

            if (input == 1) {
                System.out.println("Which number acct are u trying to access...?");
                int acctNum = Integer.parseInt(in.nextLine());

                boolean found = false;
                int index = -1;
                for (int i = 0; i < bankAccounts.size(); i++) {
                    if (bankAccounts.get(i).getAcctNumber() == acctNum) {
                        found = true;
                        index = i;
                    }
                }

                if (!found) {
                    System.out.println("That acct seems to not be in our directory/not found....#awkward.");
                } else if (found && index >= 0) {
                    mainMenu(bankAccounts.get(index));
                } else {
                    System.out.println("Yikes. This is an ERROR.");
                }

            } else if (input == 2) {
                System.out.println("Let me make u a new acct.... if u want...");
                BankAccount newAcct = new BankAccount();

                System.out.println("New name for new acct? Pls list it");
                String responseName = in.nextLine();
                newAcct.setName(responseName);

                System.out.println("Starting balance of said new acct is....");
                double responseBalance = Double.parseDouble(in.nextLine());
                newAcct.setBalance(responseBalance);

                bankAccounts.add(newAcct);
                mainMenu(bankAccounts.get((bankAccounts.size()) - 1));
            } else if (input == 0) {
                System.out.println("Thank you. Come again. bye felicia");
                break;
            }
        }
    }

    public static void mainMenu(BankAccount acct) {
        System.out.println("Howdy " + acct.getName() + ", welome to the main menu.");

        while (true) {
            System.out.println("""
            Please select from the following options :
            1. Check account balance :)
            2. Make a withdrawal :)
            3. Make a deposit :)
            4. Transfer funds to another account :)
            0. Exit :(
            """);

            int choice = Integer.valueOf(in.nextLine());
            
            if (choice == 1) {
                System.out.println(acct.getBalance());
            } else if (choice == 2) {
                System.out.println("What amnt do u want to withdraw ");
                double amt = Integer.valueOf(in.nextLine());
                acct.withdrawal(amt);
                System.out.println("Ur new balance (not the shoe) is :" + acct.getBalance());
            } else if (choice == 3) {
                System.out.println("What amnt do u wish to deposit");
                double amt = Integer.valueOf(in.nextLine());
                acct.deposit(amt);
                System.out.println("Ur new balance (not the shoe) is :" + acct.getBalance());
            } else if (choice == 4) {
                System.out.println("Which acct do u wish to transfer mondey too?");
                int targetAcct = Integer.parseInt(in.nextLine());

                boolean found = false;
                int index = -1;
                for (int i = 0; i < bankAccounts.size(); i++) {
                    if (bankAccounts.get(i).getAcctNumber() == targetAcct) {
                        found = true;
                        index = i;
                    }
                }

                if (!found) {
                    System.out.println("This acct is not on file/found. Hmm... ");
                } else if (found && index >= 0) {
                    System.out.println("Great, I found the acct. How much do u want to traansfer. ");
                    double amt = Double.valueOf(in.nextLine());
                    acct.transfer(bankAccounts.get(index), amt);
                    System.out.println("This is a transfer of $ " + amt
                            + " happening from " + acct.getName()
                            + " to " + bankAccounts.get(index).getName()
                            + " and done.");
                } else {
                    System.out.println("Uh-oh. An oopsie. (Error)");
                }
            } else if (choice == 0) {
                break;
            }
        }
    }
}