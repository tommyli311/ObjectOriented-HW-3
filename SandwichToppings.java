package edu.albany.sandwich;
public enum SandwichToppings

{

   // enum, contains the lists of available sandwich toppings and the numerical value is the price of each topping

   AVOCADO("Avocado", 2.99),

   SALAMI("Salami", 2.99),

   CHEDDAR ("Cheese", 0.99),

   PARMESAN ("Cheese2", 0.99),

   HAM ("Ham", 1.99);
	

   private String toppings;//toppings available

   private double toppingPrice;//price of each topping

  
   //constructor

   private SandwichToppings (String topping, double price) {

   this.toppings= topping;

   this.toppingPrice = price;

   }

  
//getters and setters
   public String getToppingName() {

   return toppings;

   }
   
   public void setToppingName(String toppings) {
	this.toppings=toppings;
   }

  

   public double getToppingPrice() {

   return toppingPrice;

   }
   public void setToppingPrice(double toppingPrice) {
		 this.toppingPrice=toppingPrice;
	   }

   }