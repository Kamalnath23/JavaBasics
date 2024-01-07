package tutorial25;

import world.Oak;
import world.Plant;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Plant plant1= new Plant();
		Plant plant2= new Plant();
		plant2.name= "lily";
		Plant plant3= new Plant();
		
		System.out.println(plant1.name);
		System.out.println(plant2.name);
		System.out.println(plant3.name);
		
		System.out.println(Plant.ID);
		
		//wont work type is private
		//System.out.println(plant.type);
		
		//System.out.println(Plant.size); // wont work bcos size is protected ; App is not in same package as plant//self experiment
		//System.out.println(Oak.size); //self experiment
		
		//System.out.println(plant.height);
		// wont work app and plant in different package, height has package lvl visibility
		
		
	}

}

/* temp op
 * I am groot
lily
I am groot
3
Medium
Medium */
