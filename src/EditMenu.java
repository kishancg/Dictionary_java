import java.util.Scanner;


public class EditMenu {
	public void edit(String fileName){
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		while(num!=7)
		{
			System.out.println("Press 1 to Add a word");
			System.out.println("Press 2 to Edit a word");
			System.out.println("Press 3 to Remove a word");
			System.out.println("Press 4 to List the words");
			System.out.println("Press 5 to Search words");
			System.out.println("Press 6 to Go back to Main Menu");
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
				System.out.println("Adding word to Dictionary");
				AddWord a=new AddWord();
				a.addWd(fileName);
				break;
			case 2:
				System.out.println("Editing a word in Dictionary");
				Editing e=new Editing();
				e.editWord(fileName);
				break;
			case 3:
				System.out.println("Removing a word in dictionary");
				Removing r=new Removing();
				r.remove(fileName);
				break;
			case 4:
				System.out.println("Listing the words in dictionary");
				Listing l=new Listing();
				l.listWords(fileName);
				break;
			case 5:
				System.out.println("Searching a word in dictionary");
				Searching s=new Searching();
				s.search(fileName);
				break;
			case 6:
				System.out.println("Going back to Main Menu");
				num=7;
				break;
			default: 
				System.out.println("Enter 1,2 or 3 buddy boy...");
				break;
			}
		}
	}

}
