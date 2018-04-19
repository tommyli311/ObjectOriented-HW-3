package edu.albany.sandwich;

public class Customer{
 
   private String CustomerName;

   private double money;

   private String[] requestedSandwich, requestedToppings;


   public Customer(String name, double money, String[] requestedSandwich, String[] requestedToppings)

   {

   this.CustomerName = name;

   this.money = money;

   this.requestedSandwich = requestedSandwich;

   this.requestedToppings = requestedToppings;

   }
    
   //methods where a sandwich is orders, and the sandmaker builds the sandwich
   public void orderSandwich(SandwichMaker sandwichMaker)

   {

   for (String sandwich : requestedSandwich)

   {

   sandwichMaker.buildSandwich(this, sandwich);

   }

   }

   //toppings are chosen
   public boolean pickToppings(String ingredient)

   {

   boolean answer = false;

     
   //loops through to requested topping are available
   for (String desiredTopping : requestedToppings)

   {

   if (desiredTopping.equalsIgnoreCase(ingredient))

   {

   answer = true;

   }

   break;

   }

   return answer;

   }

   public boolean askForPayment(double amountDue)

   {

   boolean answer = false;

   // checks if customer has enough cash to pay

   if (money>= amountDue)

   {
	   money -= amountDue;

   answer = true;

   }
   return answer;

   }}