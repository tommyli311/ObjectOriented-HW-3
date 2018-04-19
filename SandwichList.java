package edu.albany.sandwich;
public enum SandwichList

{
  // enum that contain names of sandwiches available and the number is the price of the sandwich

   IRONMAN ("Iron Man", 2.99),

   MB ("Meatball", 7.99),

   PIG ("Fantasic Pig Deluxe", 10.99),

   NY ("New Yorker", 9.99);
   
	
   private String sandwichType;//name of sandwich

   private double sandwichPrice;//price of each sandwich

   //constructor
   private SandwichList (String sandwichType, double sandwichPrice)

   {

   this.sandwichType = sandwichType;

   this.sandwichPrice = sandwichPrice;

   }

  
   //getters and setters
   public String getSandwichName()

   {

   return sandwichType;

   }
   
   public void setSandwichName(String sandwichType)

   {

   this.sandwichType=sandwichType;

   }

   public double getSandwichPrice()

   {

   return sandwichPrice;

   }
   public void setSandwichPrice(double sandwichPrice)

   {

   this.sandwichPrice=sandwichPrice;

   }

   }