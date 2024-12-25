/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runparties;

/**
 * 
 */
public class ChildrenParty extends Party 
{ 
    
    private String theme;
    private String supervisor;
    
    public ChildrenParty(int guests, double costPerHead, String address, String theme, String supervisor) 
    {
        super(guests, costPerHead, address);
        this.theme = theme;
        this.supervisor = supervisor;
    }

    @Override
    public double calculateCost() 
    {
        return super.calculateCost() + 200;
    }

    @Override
    public String displayInvitation() 
    {
        return "You're invited to a Children's Party!\n" +
               "Theme: " + theme + "\n" +
               "Supervisor: " + supervisor + "\n" +
               "Guests: " + guests + "\n" +
               "Address: " + address + "\n" +
               "Total Cost: R" + calculateCost() + "\n";
    }
    
}
