package AssignmentWeek02;

public class Main
{
    public static void main(String[] args)
    {
        // Create two student accounts
        PrintAccount student1 =
                new PrintAccount("Bruno", 0.13);

        PrintAccount student2 =
                new PrintAccount("Chris", 0.20);

        // Bruno adds money to his account
        System.out.println("Bruno'S ACCOUNT");
        student1.addFunds(10.00);

        // Bruno prints 25 pages
        student1.printPages(25);

        // Display Bruno's account information
        student1.displayAccount();

        // Chris adds money to her account
        System.out.println("\nChris'S ACCOUNT");
        student2.addFunds(5.00);

        // Chris prints 20 pages
        student2.printPages(15);

        // Chris attempts to print more pages
        student2.printPages(20);

        // Display Chris's account information
        student2.displayAccount();

        // Refund remaining balances
        System.out.println("\nREFUNDS");

        student1.refundBalance();
        student2.refundBalance();

        // Display final balances
        System.out.println("\nFINAL BALANCES");

        System.out.println("Bruno: $" +
                student1.getBalance());

        System.out.println("Chris: $" +
                student2.getBalance());
    }
}

