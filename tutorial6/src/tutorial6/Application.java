package tutorial6;

public class Application {

	public static void main(String[] args) {
		int loop= -2;
		
		while(true)
		{
			System.out.println("looping is : "+loop);
			
			if(loop == 0)
			{
				break;
			}
			loop++;
			System.out.println("running");
		}
	}

}
