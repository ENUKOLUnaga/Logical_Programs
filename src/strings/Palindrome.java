package strings;

import java.util.Scanner;

public class Palindrome {
	public static String Reversestr(String str)
	{
		String s2="";
		for(int i=str.length()-1;i>=0;i--)
		{
			s2=s2+str.charAt(i);
		}
		return s2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String res=Reversestr(str);
		if(res.equalsIgnoreCase(str))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		
		

	}

}
