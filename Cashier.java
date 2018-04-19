package edu.albany.sandwich;
import java.util.ArrayList;

public class Cashier

{
	private String CashierName;//name of the cashier

	private Sandwich existingSandwich;//current sandwich

	private Customer existingCustomer;//current customer

	private double money;// customer's cash

   //constructor
   public Cashier(String name, double registerAmount){
   
   this.CashierName = name;

   this.money = registerAmount; }

  //method that rings up the order and calculate the amount due
   public void ringUpOrder(Customer customer, Sandwich sandwich)

   {

   existingSandwich = sandwich;

   existingCustomer = customer;

   calculateAmountDue();

   }
   
   //method that computes order amount
   public void  calculateAmountDue()

   {
   
   //the amount due is initialized to zero
   double amountDue = 0;

  

   // Check each sandwich type for a match in the existingSandwich

   for (SandwichList list : SandwichList.values())

   {

   if (existingSandwich.getSandwichType().equalsIgnoreCase(list.getSandwichName()))

   {

	   amountDue  = list.getSandwichPrice();

   break;
   }}

   ArrayList<String> sandwichToppings = existingSandwich.getToppings();

   // loops through each sandwich topping to see if there a match to sandwichTopping

   for (String sandwichTopping : sandwichToppings){

   for (SandwichToppings topping : SandwichToppings.values()){

   if (topping.getToppingName().equalsIgnoreCase(sandwichTopping)){
    
	   amountDue  += topping.getToppingPrice();

   break;

   }}}
// checks if the customer has enough money to pay for their order, if they don't, cashier will prompt the customer for another form of payment

   if (existingCustomer.askForPayment(amountDue)){

   money += amountDue ;
   System.out.println(amountDue);
   }
   else
	   System.out.println("Please use a different form of payment");
   }}