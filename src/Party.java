/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runparties;

/**

 */
abstract class Party 
{
    protected int guests;
    protected double costPerHead;
    protected String address;
    
    public Party(int guests, double costPerHead, String address)
    {
        this.guests = guests;
        this.costPerHead = costPerHead;
        this.address = address;
    }

    public double calculateCost() 
    {
        return guests * costPerHead;
    }

    public abstract String displayInvitation();
}
