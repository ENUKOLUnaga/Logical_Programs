package strings;
import java.util.Scanner;
public class UpperToLower {
	public static void LowertoUpper(String str)
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
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		LowertoUpper(str);
	}
}
