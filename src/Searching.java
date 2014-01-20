import java.io.*;
import java.util.*;


public class Searching {
	public void search(String fileName){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the textword");		
		String text1 = sc.next();
		DictValidation v = new DictValidation();
		while(!v.nameValidation(text1)){
			System.out.println("Enter textword with only alphabets");
			text1 = sc.next();  
		}
		String text=text1.toLowerCase();
		try {
			HashSet<String> h=new HashSet<String>();
			BufferedReader input;
			input = new BufferedReader(new FileReader("C:"+File.separator+"Dictionary"+File.separator+"names"+File.separator+fileName+".txt"));
			String s;
			while((s = input.readLine())!=null)
			{
				String[] s1=s.split("=");
				if(s1[0].equals(text)){
					String[] s2=s1[1].split(":");
					for(int n=0;n<s2.length;n++){
						h.add(s2[n]);
					}				
					System.out.println("word: "+s1[0]);
					//System.out.println("length: "+s1.length);
					int m=((s2.length)/3),i=0;
					int n=m;
					while(m>0){
						System.out.println(s2[i]);
						System.out.println("\r\tmeaning: "+s2[(i+n)]);
						System.out.println("\r\texample: "+s2[i+(2*n)]);
						m=m-1;
						i=i+1;
						if(m==0){
							return;
						}
					}
				}
			}
			System.out.println("Word not found");
			
		}
		catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
