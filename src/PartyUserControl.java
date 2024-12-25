package runparties;

import java.util.Scanner;

/**
 
 */
 
public class PartyUserControl 
{
    private Party[] parties;
    private int numberOfParties; // Fixed naming convention

    public PartyUserControl()
    {
        parties = new Party[20];
        // Adding 5 sample parties
        parties[0] = new DinnerParty(10, 30, "123 Main St", "Shiya Nyama");
        parties[1] = new ChildrenParty(8, 20, "456 Foreshore Ave", "Superhero", "Thembi");
        parties[2] = new DinnerParty(15, 40, "789 Mandela Rd", "Braai");
        parties[3] = new ChildrenParty(5, 25, "321 Adderly St", "Princess", "Vusi");
        parties[4] = new DinnerParty(12, 35, "654 Long st", "African cuisine");

        numberOfParties = 5;
    }

    private int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Add a party");
        System.out.println("2. Change cost per head for dinner parties");
        System.out.println("3. Display invitations");
        System.out.println("4. Display all parties");
        System.out.println("9. Exit");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }

    private void add() 
    {
        System.out.println("Under construction");
        System.out.println("To be completed with next iteration");
    }

    private void changeDinnerCostPerHead() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dinner choice: ");
        String dinnerChoice = scanner.next();
        System.out.print("Enter increase amount: ");
        double increaseAmount = scanner.nextDouble();

        for (int i = 0; i < numberOfParties; i++) 
        {
            if (parties[i] instanceof DinnerParty) 
            {
                DinnerParty dp = (DinnerParty) parties[i];
                // Ensure dinnerChoice is a field in DinnerParty
                if (dp.getDinnerChoice().equalsIgnoreCase(dinnerChoice)) 
                {
                    dp.costPerHead += increaseAmount;
                    System.out.println("Cost per head updated for " + dinnerChoice);
                    return;
                }
            }
        }
        System.out.println("Dinner choice not found.");
    }

    private void displayInvites() 
    {
        System.out.println("Invitations:");
        for (int i = 0; i < numberOfParties; i++) 
        {
            if (parties[i] != null) { // Null check
                System.out.println(parties[i].displayInvitation());
            }
        }
    }

    private void displayParty() 
    {
        System.out.println("All Parties:");
        for (int i = 0; i < numberOfParties; i++) 
        {
            if (parties[i] != null) 
            { // Null check
                System.out.println("Party " + (i + 1) + ": " + parties[i].getClass().getSimpleName());
            }
        }
    }

    public void menuControl()
    {
        while (true) 
        {
            int choice = menu();
            switch (choice) 
            {
                case 1:
                    add();
                    break;
                case 2:
                    changeDinnerCostPerHead();
                    break;
                case 3:
                    displayInvites();
                    break;
                case 4:
                    displayParty();
                    break;
                case 9:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}