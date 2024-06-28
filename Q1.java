import java.util.*;
public class Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str=sc.nextLine();
		System.out.print("The reverse is: ");
		for(int i=str.length()-1 ; i>=0 ; i--)
		{
			System.out.print(""+str.charAt(i));
		}		
	}
}