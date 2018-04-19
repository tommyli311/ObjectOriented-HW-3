package edu.albany.sandwich;
public class SandwichMaker

{

   private String employeeName; // name of the sandwich maker/s

   private Sandwich currentSandwich; // the sandwich is that is currently being built

   private String[] sandwichToppings; // the sandwich toppings that are currently available

   private Cashier cashier; // the available cashier at the moment

   //constructor
   public SandwichMaker(String name, String[] availableToppings, Cashier cashier) {

   this.employeeName = name;

   this.sandwichToppings = availableToppings;

   this.cashier = cashier;

   }
   
   //this method begins the process of building a sandwich
   public void buildSandwich(Customer customer, String sandwichType) {

   currentSandwich = new Sandwich(sandwichType); // begin building a sandwich based on the customer's preference

  // loops through the available ingredients, and asks the customer if they want it

   for (String SandwichTopping: sandwichToppings) {

   askForToppings(customer, SandwichTopping);

   }

   //calls the moveSandwich method
   moveSandwich(customer);

   }

   public void askForToppings(Customer customer, String toppingChoice) {

   // if the customer wants the specified ingredient, then add it to the sandwich

   if (customer.pickToppings(toppingChoice)) {

   currentSandwich.pickSandwichToppings(toppingChoice);

   }}
   //method that passes the current built sandwich to the cashier to ring up
   public void moveSandwich(Customer customer) {

   //ringUpOrder method is called with the cashier object that computes the prices of each sandwich
   cashier.ringUpOrder(customer, currentSandwich);
   }}