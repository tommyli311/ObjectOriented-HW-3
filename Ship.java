//package
package edu.albany.cruise;
//ship class, also the parent class
public class Ship{
	//name of the ship
	String ShipName;
	//year the ship was built
	String YearBuilt;
	
	//constructor, takes paremeters of the ShipName, and the YearBuilt
	public Ship(String ShipName, String YearBuilt) {
		this.ShipName=ShipName;
		this.YearBuilt=YearBuilt;
	}

//method that gets the ship name
public String getShipName() {
	return ShipName;
}
//method that sets the shipname
public void setShipName(String ShipName) {

	this.ShipName=ShipName;
	
}
//method that gets the year it was built
public String getYearBuilt() {
	return YearBuilt;
}
//method that sets the year it was built
public void setYearBuilt(String YearBuilt) {
	this.YearBuilt=YearBuilt;
}

// toString method that returns the name of the ship and the year it was built.
public String toString() {
	String a= "Name of ship is "+ getShipName()+ ", Year Built is: "+ getYearBuilt();
	return a;
}
}