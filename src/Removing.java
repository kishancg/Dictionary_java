import java.io.*;
import java.util.*;

public class Removing {
	public void remove(String fileName){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the textword");		
		String text = sc.next();
		DictValidation v = new DictValidation();
		while(!v.nameValidation(text)){
			System.out.println("Enter textword with only alphabets");
			text = sc.next();  
		}
		BufferedReader input;
		BufferedWriter output;
		String s=null;
		int count=0;
		LinkedList<String> l=new LinkedList<String>();
		try {
			input = new BufferedReader(new FileReader("C:"+File.separator+"Dictionary"+File.separator+"names"+File.separator+fileName+".txt"));
			while((s = input.readLine())!=null)
			{
				String[] s1=s.split("=");
				if(s1[0].equals(text)){
					System.out.println("Removing the word "+s1[0]);
					count++;
				}
				else{
					l.add(s);
				}
			}
			if(count==0){
				System.out.println("word not found");
				return;
			}
			output= new BufferedWriter(new FileWriter("C:"+File.separator+"Dictionary"+File.separator+"names"+File.separator+fileName+".txt"));
			
			Iterator<String> it=l.iterator();
			while(it.hasNext()){
				Object o=it.next();
				String q=(String)o;
				output.write(q);
				output.write("\r\n");
				
			}
			input.close();
			output.close();
			
		}
		catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void remove(String fileName,String text){
		BufferedReader input;
		BufferedWriter output;
		String s=null;
		LinkedList<String> l=new LinkedList<String>();
		try {
			input = new BufferedReader(new FileReader("C:"+File.separator+"Dictionary"+File.separator+"names"+File.separator+fileName+".txt"));
			while((s = input.readLine())!=null)
			{
				String[] s1=s.split("=");
				if(s1[0].equals(text)){
					//System.out.println("Removing the word "+s1[0]);
				}
				else{
					l.add(s);
				}
			}
			output= new BufferedWriter(new FileWriter("C:"+File.separator+"Dictionary"+File.separator+"names"+File.separator+fileName+".txt"));
			
			Iterator<String> it=l.iterator();
			while(it.hasNext()){
				Object o=it.next();
				String q=(String)o;
				output.write(q);
				output.write("\r\n");
				
			}
			input.close();
			output.close();
			
		}
		catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
