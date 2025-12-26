package strings;
public class ReverseString {
	public static void main(String[] args) {
		String string1="Logical!!";
		String string2="";
		for(int i=string1.length()-1;i>=0;i--)
		{
			string2=string2+string1.charAt(i);
		}
		System.out.println(string1 +" \n"+string2);
	}
}