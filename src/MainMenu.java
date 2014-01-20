import java.util.Scanner;


public class MainMenu {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		while(num!=4)
		{
			System.out.println("Press 1 to Create Dictionary");
			System.out.println("Press 2 to Load Dictionary");
			System.out.println("Press 3 to exit");
			System.out.println("Enter choice:");
			
			while(!sc.hasNextInt())
			{
				System.out.println("Enter correct int num mister");
				sc.next();
			}
			num = sc.nextInt();
			
			switch(num)
			{
			case 1:	
				System.out.println("Creation of Dictionary");
				CreateDictionary c= new CreateDictionary();
				c.CreateDict();				
				break;
			case 2:
				System.out.println("Loading of Dictionary");
				OpenDict op=new OpenDict();
				op.open();
				break;
			case 3:
				System.out.println("Exiting the Dictionary Mode");
				num=4;
				break;
			default: 
				System.out.println("Enter 1,2 or 3 buddy boy...");
				break;
			}
		}

	}

}
