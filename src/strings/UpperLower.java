package strings;

import java.util.Scanner;

public class UpperLower {
	public static void LtoUpper(String str)
	{
		char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] = (char)(ch[i] - 32);
            }
        }
        System.out.println(ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		LtoUpper(str);
		

	}
}
