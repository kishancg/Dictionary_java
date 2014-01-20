import java.io.File;
import java.util.Scanner;


public class OpenDict {
		public void open(){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the name of the dictionary");		
			String dname1 = sc.next();
			DictValidation v = new DictValidation();
			while(!v.nameValidation(dname1)){
				System.out.println("Enter name with only alphabets");
				dname1 = sc.next();  
			}
			String dname=dname1.toLowerCase();
			System.out.println("Dictionary name is "+dname);
		
			
			File f= new File("C:"+File.separator+"Dictionary"+File.separator+"names"+File.separator+dname+".txt");
			if(f.exists()){
				EditMenu e = new EditMenu();
				e.edit(dname);
			}
			else{
				System.out.println("Dictionary does not exists");
			}
		}
}
