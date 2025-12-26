package strings;

public class ReverStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Logical!!";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s1 +" \n"+s2);

	}

}
