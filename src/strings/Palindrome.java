package strings;
import java.util.Scanner;

public class Palindrome {
	public static String Reversestr(String string)
	{
		String string2="";
		for(int i=string.length()-1;i>=0;i--)
		{
			string2=string2+string.charAt(i);
		}
		return string2;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		String res=Reversestr(string);
		if(res.equalsIgnoreCase(string))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
}
