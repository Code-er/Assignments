import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicStringOperations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
	
		
		System.out.println("Press 1 for adding string to itself \n"
				                +"2 for replacing odd positions with # \n"
				                +"3 for removal of duplicate characters in the String \n"
				                +"4 for Changing odd characters to upper case ");
		char choice=sc.next().charAt(0);
		
		switch(choice)
		{
		case '1':
			System.out.println(repeatString(s));
			break;
		case '2':
			System.out.println(replacingOddWithSymbol(s));
			break;
		case '3':
			System.out.println(removeDuplicates(s));
			break;
		case '4':
			 System.out.println(oddOccurrencesToUpper(s));
			break;
		 default:
			 System.out.println("Invalid choice");
			 break;
		
		}
		 
		
	}
	
	public static String repeatString(String str)
	{
		return str.concat(str);
	}
	
	public static String replacingOddWithSymbol(String str)
	{
		char charArray[]=str.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			if(i%2!=0)
				charArray[i]='#';
		}
		str="";
		for(int i=0;i<charArray.length;i++)
		{
			str+=charArray[i];	
		}
		return str;
	}
	
	public static String removeDuplicates(String s)
	{
		String str=new String();
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(str.indexOf(c)<0)
			{
				str+=c;
			}
		}
		
	return str;
	}
	
	public static String oddOccurrencesToUpper(String str)
	{
		char charArray[]=str.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			if(i%2!=0)
			{
			char s=str.charAt(i);
			char d=(char) ((int)s-32);
			charArray[i]=d;
			}
		}
		str="";
		for(int i=0;i<charArray.length;i++)
		{
			str+=charArray[i];	
		}
		
		return str;
	}
	

	
	
	

}
