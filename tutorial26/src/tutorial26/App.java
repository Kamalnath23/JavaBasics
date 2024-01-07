package tutorial26;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Plant plant1=new Plant();
		Tree tree = new Tree();
		
		Plant plant2=tree; //polymorphism
		
		plant2.grow();
		
		
		tree.ShedLeaves();
		
		// plant2.ShedLeaves();
		
		Plant plant3;
		//plant3.grow(); - local variable not initialized
		
		doGrow(tree);
		
		plant1.grow();
		
	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
		
	}

}
