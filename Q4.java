import java.util.*;
public class Q4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();
        System.out.print("Enter the index at which to replace the character: ");
        int i=sc.nextInt();
        sc.nextLine();
        System.out.println("Character at index, "+i+" is: "+str.charAt(i));
        System.out.print("Enter the new character: ");
        char ch=sc.next().charAt(0);
        if (i<0 || i>=str.length())
        	System.out.println("--Index out of bound--");
        else
        {
        	String newstr=str.substring(0,i)+ch+str.substring(i+1);
            System.out.println("Modified stringg: "+newstr);
        }
    }
}