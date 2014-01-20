import java.io.*;
import java.util.*;

public class Listing {
	public void listWords(String fileName){
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while(num!=4)
		{
			System.out.println("Press 1 to List by alphabatic order");
			System.out.println("Press 2 to list by word length ");
			System.out.println("Press 3 to go back to Edit Menu");
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
				System.out.println("Alphabatical Order");
				try {
					TreeSet<String> h=new TreeSet<String>();
					BufferedReader input;
					input = new BufferedReader(new FileReader("C:"+File.separator+"Dictionary"+File.separator+"names"+File.separator+fileName+".txt"));
					String s;
					while((s = input.readLine())!=null)
					{
						String[] s1=s.split("=");
						h.add(s1[0]);
					}
					Iterator<String> it=h.iterator();
					while(it.hasNext()){
						Object o=it.next();
						System.out.println(o);
					}
				}
				catch (FileNotFoundException e1) {
					
					e1.printStackTrace();
				}
				catch (IOException e) {
					
					e.printStackTrace();
				}
					
				break;
			case 2:
				System.out.println("listing by word length");
				BufferedReader output = null;
				String str;
				ArrayList<String> al= new ArrayList<String>();
				try {
					output = new BufferedReader(new FileReader("C:"+File.separator+"Dictionary"+File.separator+"names"+File.separator+fileName+".txt"));
					while((str=output.readLine())!=null)
					{
						String[] s1=str.split("=");
						al.add(s1[0]);
				    }					 
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Collections.sort(al,new WordLength());
				for(String s4:al)
				   System.out.println(s4);
				break;						
			case 3:
				System.out.println("Exiting the Listing Mode");
				num=4;
				break;
			default: 
				System.out.println("Enter 1,2 or 3 buddy boy...");
				break;
			}
		}
	}

}
