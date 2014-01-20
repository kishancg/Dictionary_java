
import java.util.*;


public class PartOfSpeech {
	LinkedList<String> pos=new LinkedList<String>();
	LinkedList<String> meaning =new LinkedList<String>();
	LinkedList<String> example =new LinkedList<String>();
	public String pOS(String fileName){
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int num = 0;
		String q=null;
		while(num!=10)
		{
			System.out.println("Press 1 for Noun");
			System.out.println("Press 2 for Verb");
			System.out.println("Press 3 for Pronoun");
			System.out.println("Press 4 for Adjective");
			System.out.println("Press 5 for Adverb");
			System.out.println("Press 6 for Preposition");
			System.out.println("Press 7 for Conjunction");
			System.out.println("Press 8 for Interjunction");
			System.out.println("Press 9 for Finish and go back to previous menu");
			System.out.println("Enter choice:");
			
			while(!sc.hasNextInt())
			{
				System.out.println("Enter correct int num mister");
				sc.next();
			}
			num = sc.nextInt();
			String s1,s2;
			switch(num)
			{
			case 1:	
				if(pos.contains("noun")){
					System.out.println("noun already exists");
					break;
				}
				else{
					pos.add("noun");
					System.out.println("Enter the corresponding meaning");
					s1=sc1.nextLine();
					meaning.add(s1);
					System.out.println("Enter the corresponding example");
					s2=sc1.nextLine();
					example.add(s2);
					break;
				}
			case 2:
				if(pos.contains("verb")){
					System.out.println("verb already exists");
					break;
				}
				else{
					pos.add("verb");
					System.out.println("Enter the corresponding meaning");
					s1=sc1.nextLine();
					meaning.add(s1);
					System.out.println("Enter the corresponding example");
					s2=sc1.nextLine();
					example.add(s2);;
					break;
				}
			case 3:
				if(pos.contains("pronoun")){
					System.out.println("pronoun already exists");
					break;
				}
				else{
					pos.add("pronoun");
					System.out.println("Enter the corresponding meaning");
					s1=sc1.nextLine();
					meaning.add(s1);
					System.out.println("Enter the corresponding example");
					s2=sc1.nextLine();
					example.add(s2);
					break;
				}
			case 4:
				if(pos.contains("adjective")){
					System.out.println("adjective already exists");
					break;
				}
				else{
					pos.add("adjective");
					System.out.println("Enter the corresponding meaning");
					s1=sc1.nextLine();
					meaning.add(s1);
					System.out.println("Enter the corresponding example");
					s2=sc1.nextLine();
					example.add(s2);
					break;
				}
			case 5:
				if(pos.contains("adverb")){
					System.out.println("adverb already exists");
					break;
				}
				else{
					pos.add("adverb");
					System.out.println("Enter the corresponding meaning");
					s1=sc1.nextLine();
					meaning.add(s1);
					System.out.println("Enter the corresponding example");
					s2=sc1.nextLine();
					example.add(s2);
					break;
				}
			case 6:
				if(pos.contains("preposition")){
					System.out.println("preposition already exists");
					break;
				}
				else{
					pos.add("preposition");
					System.out.println("Enter the corresponding meaning");
					s1=sc1.nextLine();
					meaning.add(s1);
					System.out.println("Enter the corresponding example");
					s2=sc1.nextLine();
					example.add(s2);
					break;
				}
			case 7:
				if(pos.contains("conjunction")){
					System.out.println("conjunction already exists");
					break;
				}
				else{
					pos.add("conjunction");
					System.out.println("Enter the corresponding meaning");
					s1=sc1.nextLine();
					meaning.add(s1);
					System.out.println("Enter the corresponding example");
					s2=sc1.nextLine();
					example.add(s2);
					break;
				}
			case 8:
				if(pos.contains("interjection")){
					System.out.println("interjection already exists");
					break;
				}
				else{
					pos.add("conjunction");
					System.out.println("Enter the corresponding meaning");
					s1=sc1.nextLine();
					meaning.add(s1);
					System.out.println("Enter the corresponding example");
					s2=sc1.nextLine();
					example.add(s2);
					break;
				}
			case 9:
				q=addContent();
				System.out.println("going back to previous menu");
				num=10;
				break;
			default: 
				System.out.println("Enter 1,2 or 3 buddy boy...");
				break;
			}
		}
		return q;
	}
	public String pOS(String fileName,String str){
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int num = 0;
		String q=null;
		String[] sarr=str.split(":");
		int m=((sarr.length)/3),i=0;
		int n=m;
		while(m>0){
			pos.add(sarr[i]);
			meaning.add(sarr[(i+n)]);
			example.add(sarr[i+(2*n)]);
			m=m-1;
			i=i+1;
		}
		while(num!=10)
		{
			System.out.println("Press 1 for Noun");
			System.out.println("Press 2 for Verb");
			System.out.println("Press 3 for Pronoun");
			System.out.println("Press 4 for Adjective");
			System.out.println("Press 5 for Adverb");
			System.out.println("Press 6 for Preposition");
			System.out.println("Press 7 for Conjunction");
			System.out.println("Press 8 for Interjunction");
			System.out.println("Press 9 for Finish and go back to Edit Menu");
			System.out.println("Enter choice:");
			
			while(!sc.hasNextInt())
			{
				System.out.println("Enter correct int num mister");
				sc.next();
			}
			num = sc.nextInt();
			String s1,s2;
			switch(num)
			{
			case 1:	
				if(pos.contains("noun")){
					System.out.println("noun already exists");
					break;
				}
				else{
					pos.add("noun");
					System.out.println("Enter the corresponding meaning");
					s1=sc1.nextLine();
					meaning.add(s1);
					System.out.println("Enter the corresponding example");
					s2=sc1.nextLine();
					example.add(s2);
					break;
				}
			case 2:
				if(pos.contains("verb")){
					System.out.println("verb already exists");
					break;
				}
				else{
					pos.add("verb");
					System.out.println("Enter the corresponding meaning");
					s1=sc1.nextLine();
					meaning.add(s1);
					System.out.println("Enter the corresponding example");
					s2=sc1.nextLine();
					example.add(s2);;
					break;
				}
			case 3:
				if(pos.contains("pronoun")){
					System.out.println("pronoun already exists");
					break;
				}
				else{
					pos.add("pronoun");
					System.out.println("Enter the corresponding meaning");
					s1=sc1.nextLine();
					meaning.add(s1);
					System.out.println("Enter the corresponding example");
					s2=sc1.nextLine();
					example.add(s2);
					break;
				}
			case 4:
				if(pos.contains("adjective")){
					System.out.println("adjective already exists");
					break;
				}
				else{
					pos.add("adjective");
					System.out.println("Enter the corresponding meaning");
					s1=sc1.nextLine();
					meaning.add(s1);
					System.out.println("Enter the corresponding example");
					s2=sc1.nextLine();
					example.add(s2);
					break;
				}
			case 5:
				if(pos.contains("adverb")){
					System.out.println("adverb already exists");
					break;
				}
				else{
					pos.add("adverb");
					System.out.println("Enter the corresponding meaning");
					s1=sc1.nextLine();
					meaning.add(s1);
					System.out.println("Enter the corresponding example");
					s2=sc1.nextLine();
					example.add(s2);
					break;
				}
			case 6:
				if(pos.contains("preposition")){
					System.out.println("preposition already exists");
					break;
				}
				else{
					pos.add("preposition");
					System.out.println("Enter the corresponding meaning");
					s1=sc1.nextLine();
					meaning.add(s1);
					System.out.println("Enter the corresponding example");
					s2=sc1.nextLine();
					example.add(s2);
					break;
				}
			case 7:
				if(pos.contains("conjunction")){
					System.out.println("conjunction already exists");
					break;
				}
				else{
					pos.add("conjunction");
					System.out.println("Enter the corresponding meaning");
					s1=sc1.nextLine();
					meaning.add(s1);
					System.out.println("Enter the corresponding example");
					s2=sc1.nextLine();
					example.add(s2);
					break;
				}
			case 8:
				if(pos.contains("interjection")){
					System.out.println("interjection already exists");
					break;
				}
				else{
					pos.add("conjunction");
					System.out.println("Enter the corresponding meaning");
					s1=sc1.nextLine();
					meaning.add(s1);
					System.out.println("Enter the corresponding example");
					s2=sc1.nextLine();
					example.add(s2);
					break;
				}
			case 9:
				q=addContent();
				System.out.println("going back to Edit Menu");
				num=10;
				break;
			default: 
				System.out.println("Enter 1,2 or 3 buddy boy...");
				break;
			}
		}
		return q;
	}
	public String addContent(){
		String s="=";
		for(Object o:pos){
			s= s+o+":";
		}
		for(Object o:meaning){
			s= s+ o+":";
		}
		for(Object o:example){
			s= s+ o+":";
		}
		return s;
	}
}
