//package
package edu.albany.cruise;

//driver class
public class ShipTest {
	//main method
	public static void main(String[] args) {
		
		//array declaration
		Ship[] ships= new Ship[3];
		
		//objects for ship, CargoShip, CruiseShip that are assigned to array elements
		Ship ship1= new Ship("American Ship", "1960");
		CargoShip cargo= new CargoShip("New York Ship","1990",7600);
		CruiseShip cruise= new CruiseShip("Norweigian Ship","2018",4500);
		ships[0]= ship1;
		ships[1]= cruise;
		ships[2]= cargo;
		
		//loops through and calls the toString method associated with each array index.
		 for (int i = 0; i <ships.length; i++) {
			 // prints the string in the toString method
			 System.out.println(ships[i].toString());
			 System.out.println();
		 }

}
}
