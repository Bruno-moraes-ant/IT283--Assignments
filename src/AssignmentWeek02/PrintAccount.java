package AssignmentWeek02;

public class PrintAccount
{
    // Instance variables
    private String studentName;
    private double costPerPage;
    private double balance;
    private double totalSpent;

    // Constructor
    public PrintAccount(String name, double price)
    {
        studentName = name;
        costPerPage = price;
        balance = 0.0;
        totalSpent = 0.0;
    }

    // Method to add funds to the account
    public void addFunds(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
            System.out.println("Deposit successful: $" + amount);
        }
        else
        {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to print pages
    public void printPages(int pages)
    {
        if (pages <= 0)
        {
            System.out.println("Invalid number of pages.");
        }
        else
        {
            double cost = pages * costPerPage;

            if (balance >= cost)
            {
                balance -= cost;
                totalSpent += cost;

                System.out.println(studentName +
                        " printed " + pages + " pages.");
                System.out.println("Printing cost: $" + cost);
            }
            else
            {
                System.out.println("Insufficient funds.");
            }
        }
    }

    // Accessor method for student name
    public String getStudentName()
    {
        return studentName;
    }

    // Accessor method for cost per page
    public double getCostPerPage()
    {
        return costPerPage;
    }

    // Accessor method for account balance
    public double getBalance()
    {
        return balance;
    }

    // Accessor method for total amount spent
    public double getTotalSpent()
    {
        return totalSpent;
    }

    // Method to refund remaining balance
    public double refundBalance()
    {
        double refund = balance;
        balance = 0.0;

        System.out.println("Refund amount: $" + refund);

        return refund;
    }

    // Method to display account information
    public void displayAccount()
    {
        System.out.println("\nStudent Name: " + studentName);
        System.out.println("Cost Per Page: $" + costPerPage);
        System.out.println("Account Balance: $" + balance);
        System.out.println("Total Amount Spent: $" + totalSpent);
    }
}

