package tutorila31genericswildcard;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
class Machine{

	@Override
	public String toString() {
		return "I'm a Machine";
	}
	
	public void start() {
		System.out.println("Machine starting.");
	}
	
}

class Camera extends Machine{
	
	@Override
	public String toString() {
		return "I am a Camera";
	}
	
	public void snap() {
		System.out.println("Picture taking");
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Machine> list1 = new ArrayList<Machine>();
		list1.add(new Machine());
		list1.add(new Machine());
		
		

		
		ArrayList<Camera> list2 = new ArrayList<Camera>();
		list2.add(new Camera());
		list2.add(new Camera());
		
		
		showList(list2);
		showList2(list1);
	}
	
	
	

	public static void showList(ArrayList<? extends Machine> list) {
		for(Machine value : list) {
			System.out.println(value);
			value.start();
		}
	}
			public static void showList2(ArrayList<? super Camera> list) {
				for(Object value : list) {
					System.out.println(value);
					
				}
			
		
		
		
	}

} 

