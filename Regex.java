import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex{
	public static void main(String[] args){
	System.out.println("Enter your Email");
	Scanner sc=new Scanner(System.in);
	String mail=sc.nextLine();
	
	Pattern pattern = Pattern.compile("^[_A-Za-z0-9+-]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"); //Email Validation
	
	//[_A-Za-z0-9+-]+                     ----> Matches Uppercase or Lowercase or digits with underscore one or more time before @
	//(\\.[_A-Za-z0-9-]+)* 		      ---> Matches Uppercase or Lowercase or digits with underscore zero or more time (If dot is present) before @
	//[A-Za-z0-9-]+               	      --->Matches Uppercase or Lowercase or digits one or more time after @
	//(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,}) ---> Matches Uppercase or Lowercase or digits with underscore zero or more time followed by after dot Uppercase or Lowercase with the length of minimum 2 after @
	

	Matcher m=pattern.matcher(mail);                                       
	int i=0;

	while(m.find()){
		System.out.println("Valid Email");
		i=1;
	}
	 if(i==0){
		System.out.println("Invalid Email");	
	}

	
}
}