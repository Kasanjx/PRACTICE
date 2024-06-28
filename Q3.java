import java.util.*;
public class Q3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str=sc.next();
		String strp="";
		for(int i=str.length()-1 ; i>=0 ; i--)
		{
			strp+=str.charAt(i);
		}
		if(str.equals(strp))
			System.out.println("The string is pallindrome!");
		else
			System.out.println("The string is not pallindrome!");
	}
}