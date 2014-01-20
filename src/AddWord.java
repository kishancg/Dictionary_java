import java.io.*;
import java.util.Scanner;


public class AddWord {
	public void addWd(String fileName){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the textword");		
		String text1 = sc.next();
		DictValidation v = new DictValidation();
		while(!v.nameValidation(text1)){
			System.out.println("Enter textword with only alphabets");
			text1 = sc.next();  
		}
		String text=text1.toLowerCase();
		PartOfSpeech p=new PartOfSpeech();
		String s=p.pOS(fileName);
		text = text+s;
		Writer output = null;		
		File file = new File("C:"+File.separator+"Dictionary"+File.separator+"names"+File.separator+fileName+".txt");
		
		try {
			output = new BufferedWriter(new FileWriter(file,true));
			output.write(text);
			output.write("\r\n");
			output.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Your dictionary has been updated by adding a word"); 
		
	}

}
