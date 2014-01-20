import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class CreateDictionary {
	public void CreateDict(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the dictionary");		
		String dname = sc.next();
		DictValidation v = new DictValidation();
		while(!v.nameValidation(dname)){
			System.out.println("Enter name with only alphabets");
			dname = sc.next();  
		}
		System.out.println("Dictionary name is "+dname);
	
		String fileName = dname.toLowerCase(); 
		File f= new File("C:"+File.separator+"Dictionary"+File.separator+"names"+File.separator+fileName+".txt");
		if(f.exists()){
			System.out.println("file in tht name exists");			
		}
		else{
			try {
				f.createNewFile();
				EditMenu e = new EditMenu();
				e.edit(fileName);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
