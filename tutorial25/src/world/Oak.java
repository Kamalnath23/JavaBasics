package world;

public class Oak extends Plant {
	public Oak() {
		//type= "tree"; //not VISIBLE due to PRIVATE
		//wont work type is private
		
		this.size= "Large"; // work size is protected, oak is a sub class of plant.
		
		this.height=10; //NO Access specifer-work bcos Oak and Plant in same package 
		
	}

}
