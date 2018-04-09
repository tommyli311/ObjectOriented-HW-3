//package
package edu.albany.cruise;

//child class inherits from the Parent Class which is Ship
public class CruiseShip extends Ship {
	
	//max number of passengers on the cruise ship
	int maxPassengers;

//get the max number of passengers on the ship
public int getmaxPassengers() {
	return maxPassengers;
}

//set the max number of passengers on the ship
public void setmaxPassenegers(int maxPassengers) {
	this.maxPassengers=maxPassengers;
}

//constructor, Shipname,BuiltYear, and maxPassengers as parameters
public CruiseShip(String ShipName,String BuiltYear,int maxPassengers) {
	super(ShipName, BuiltYear);//calls the parent constructor
	
	this.maxPassengers=maxPassengers;

}
//toString method, returns the name of the ship, and the max number of passengers
public String toString() {
	
	String c= "Name of ship is " + getShipName() + ", Maximum number of passengers is "+ getmaxPassengers();
	return c;
	
	
 }
}
