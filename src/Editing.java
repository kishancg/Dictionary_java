import java.io.*;
import java.util.*;


public class Editing {
	public void editWord(String fileName){
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int num = 0;
		
		while(num!=4){
			System.out.println("Press 1 to remove the semantics");
			System.out.println("Press 2 to to append new seamntics");
			System.out.println("Press 3 to go back to Edit Menu");
			System.out.println("Enter choice:");
			
			while(!sc1.hasNextInt())
			{
				System.out.println("Enter correct int num mister");
				sc1.next();
			}
			num = sc1.nextInt();
			
			
			
			switch(num){
				case 1:
					System.out.println("Enter the textword to edit");		
					String text = sc.next();
					DictValidation v = new DictValidation();
					while(!v.nameValidation(text)){
						System.out.println("Enter textword with only alphabets");
						text = sc.next();  
					}
					System.out.println("removing semantics");
					String s;
					
					BufferedReader input;
					BufferedWriter output;
					try {
						input = new BufferedReader(new FileReader("C:"+File.separator+"Dictionary"+File.separator+"names"+File.separator+fileName+".txt"));
						output = new BufferedWriter(new FileWriter("C:"+File.separator+"Dictionary"+File.separator+"names"+File.separator+fileName+".txt",true));
						while((s = input.readLine())!=null)
						{
							String[] s1=s.split("=");
							if(s1[0].equals(text)){
								System.out.println("Removing the semantics of"+s1[0]);
								Removing r=new Removing();
								r.remove(fileName,s1[0]);
								PartOfSpeech p=new PartOfSpeech();
								String a = p.pOS(fileName);
								output.write(s1[0]+a);
							}						
						}
						input.close();
						output.close();
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}						
					break;
				case 2:
					System.out.println("Enter the textword to edit");		
					String text1 = sc.next();
					DictValidation v1 = new DictValidation();
					while(!v1.nameValidation(text1)){
						System.out.println("Enter textword with only alphabets");
						text1 = sc.next();  
					}
					System.out.println("to add other Part of speech");
					String str;
					
					BufferedReader iput;
					BufferedWriter oput;
					try {
						iput = new BufferedReader(new FileReader("C:"+File.separator+"Dictionary"+File.separator+"names"+File.separator+fileName+".txt"));
						oput = new BufferedWriter(new FileWriter("C:"+File.separator+"Dictionary"+File.separator+"names"+File.separator+fileName+".txt",true));
						while((str = iput.readLine())!=null)
						{
							String[] s1=str.split("=");
							if(s1[0].equals(text1)){
								Removing r=new Removing();
								r.remove(fileName,s1[0]);
								PartOfSpeech p=new PartOfSpeech();
								String a = p.pOS(fileName,s1[1]);
								oput.write(s1[0]+a);
							}						
						}
						iput.close();
						oput.close();
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}					
					
					break;
				case 3:
					System.out.println("Exiting Editng Mode");
					num=4;
					break;
				default: 
					System.out.println("Enter 1,2 or 3 buddy boy...");
					break;
			}
		}
	}
}
