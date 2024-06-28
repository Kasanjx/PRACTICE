import java.util.*;
public class Q5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str=sc.next();
		System.out.println("The String: "+str);
		System.out.println("The length is: "+str.length());
		System.out.println("Character at 3rd position: "+str.charAt(3));
		System.out.println("Substring from index 2 to end: "+(str.substring(2)));
		System.out.println("Checking if 'at' is part of string: "+str.contains("st"));
		System.out.println("Checking if the string starts with 'I': "+str.startsWith("I"));
		System.out.println("Checking if the string ends with '!': "+str.endsWith("!"));
		System.out.println("Index of 'a': "+str.indexOf('a'));
		System.out.println("Last index of 'a': "+str.lastIndexOf('a'));
		System.out.println("The string in Upper-case: "+str.toUpperCase());
		System.out.println("The string in Lower-case:"+str.toLowerCase());
		System.out.println("Removing L/R white spaces: "+str.trim());
		System.out.println("Replacing 'single space' with 'new line char': "+str.replace(' ', '\n'));
		System.out.println("Checking if String is Empty: "+str.isEmpty());
        System.out.println("Checking if equal to 'tree': "+str.equals("tree"));
        System.out.println("Splitting the string: ");
        String[] wrd=str.split(" ");
        for (int i=0;i<wrd.length;i++)
        {
        	System.out.println(wrd[i]);
        }
	}
}