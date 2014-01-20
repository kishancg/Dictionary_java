public class DictValidation {
	public boolean nameValidation(Object o)
	{
		if (o instanceof String){
			String s= (String)o;
			String str[] = (s.split(""));
			for(int i=1;i <= s.length();i++){
				 
				 DictValidation d= new DictValidation();
				 if(!d.testAlphaString(str[i])){
					 return false;
				 }			 
			}
			return true;
		}
		else{
			System.out.println("Check only string validaton");
			return false;
		}
	}
	public boolean testAlphaString(String s){
		return s.matches("[a-zA-Z]");
	}
}
