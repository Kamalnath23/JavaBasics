package tutorial25;

import world.Plant;

/*
 * pvt=within same class
 * public= from anywhere
 * protected= same class, sub class and same package
 * default/no access specifer = same package only 
 */

public class Grass extends Plant {
	public Grass() {
		//System.out.println(this.height); // won't work --- Grass not in same packaage as plants, eventhouh its a sub class.
		
	}

}
