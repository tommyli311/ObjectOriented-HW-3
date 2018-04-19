package edu.albany.sandwich;

//driver class
public class SandwichDriver

{

   public static void main(String[] args) {
   
	//cashier object, lists cashier name, and amount of money in the register
   Cashier cashier = new Cashier("Joseph", 3000.0);
   
   //custome objects with customer name, amount of money they have, their requested sandwich and toppings
   Customer customer1 = new Customer("Hank", 50.0, new String[] {"New Yorker", "Fantasic Pig Deluxe"}, new String[] {"Ham", "Avocado"});
   Customer customer2 = new Customer("Jonathan", 755.0, new String[] {"Meatball", "Fantasic Pig Deluxe","New Yorker"}, new String[] {"Salami", "Avocado"});
   Customer customer3 = new Customer("Stewie", 3.0, new String[] {"Fantasic Pig Deluxe","New Yorker"}, new String[] {"Cheese1", "Avocado","Salami"});

   
   //sandwich maker object with their name, lists available ingredients
   SandwichMaker sandwichMaker = new SandwichMaker("Bobby", new String[] {"Cheese", "Avocado", "Ham"}, cashier);
   SandwichMaker sandwichMaker2 = new SandwichMaker("Bobby", new String[] {"Cheese", "Avocado", "Ham","Salami"}, cashier);

  
   //prints the name of the sandwich shopp
   System.out.println("Welcome the New York Sandwich Shop");
   System.out.println();
   System.out.println("What type of sandwich would you like?");
   System.out.println();
   
  //prints the total for each sandwich that the customer requested with topping, if the customer doesn't have enough money, will prompt for alternative payment
   System.out.println("Total for customer 1 for each sandwich is");
   customer1.orderSandwich(sandwichMaker);
   
   System.out.println();
   System.out.println("Total for customer 2 for each sandwich is");
   customer2.orderSandwich(sandwichMaker2);
   
   System.out.println();
   System.out.println("Total for customer 3");
   customer3.orderSandwich(sandwichMaker);


   }

   }