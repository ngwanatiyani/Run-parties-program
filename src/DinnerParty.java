package runparties;

/**

 */
public class DinnerParty extends Party {
    
    private String dinnerChoice; 
    
    public DinnerParty(int guests, double costPerHead, String address, String dinnerChoice) {
        super(guests, costPerHead, address);
        this.dinnerChoice = dinnerChoice; 
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + 100;
    }

    @Override
    public String displayInvitation()
    {
        return "You're invited to a Dinner Party!\n" +
               "Dinner Choice: " + dinnerChoice + "\n" + 
               "Guests: " + guests + "\n" +
               "Address: " + address + "\n" +
               "Total Cost: R" + calculateCost() + "\n";
    }

    // Optional: Getter for dinnerChoice
    public String getDinnerChoice() 
    {
        return dinnerChoice;
    }
}