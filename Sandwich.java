package edu.albany.sandwich;
import java.util.ArrayList;

// this class has methods that add sandwich toppings to the arraylist
public class Sandwich {

   private String sandwichType;

   private ArrayList<String> toppings; // list to hold all the of ingredients placed on the sandwich

   //constructor
   public Sandwich(String sandwichType) {

   this.sandwichType = sandwichType;

   toppings = new ArrayList<String>();

   }

  //this method add sandwich toppings to the array list
   public void pickSandwichToppings(String toppingChoice) {

	   toppings.add(toppingChoice); // add the topping to the to the arraylist

   }

   //getters and setters
   public String getSandwichType() {

   return sandwichType;

   }
   
   public void setSandwichType(String sandwichType) {

	   this.sandwichType=sandwichType;

	   }

   public ArrayList<String> getToppings() {

   return toppings;
}
}

