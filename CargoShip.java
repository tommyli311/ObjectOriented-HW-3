//package
package edu.albany.cruise;

//CargoShip class, is the also the child class, inherits from the Parent Class
public class CargoShip extends Ship{
 
  //cargo capacity
  int CargoCapacity;
  
  //constructor, Shipname,BuiltYear, and CargoCapacity as parameters
  public CargoShip(String ShipName,String BuiltYear, int CargoCapacity) {
	  super(ShipName,BuiltYear);//calls the parent constructor
	  this.CargoCapacity=CargoCapacity;
  }
  
  //method that gets the CargoCapacity
  public int getCargoCapacity() {
	  return CargoCapacity;
  }
  
  //method that sets the CargoCapacity
  public void setCargoCapacity(int CargoCapacity) {
	  this.CargoCapacity=CargoCapacity;
  }
  
  //toString method that return the name of the ship, and its cargo capacity
  public String toString() {
	  String b= "Name of the ship is "+ getShipName() + ", The Cargo Capacity of the ship is "+ getCargoCapacity() + " tons";
	  return b;
  }
}
