import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex{
	public static void main(String[] args){
	System.out.println("Enter your Email");
	Scanner sc=new Scanner(System.in);
	String mail=sc.nextLine();
	
	Pattern pattern = Pattern.compile("^[A-Za-z0-9]*@"+"[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$"); //Email Validation
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