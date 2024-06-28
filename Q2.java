import java.util.*;
public class Q2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the email: ");
        String email=sc.next();
        boolean k=email_check(email);
        if(k)
            System.out.println("--Valid Email.--");
        else
            System.out.println("--Invalid Email.--");
    }

    public static boolean email_check(String str) 
    {
        int count=0;
        for (int i=0; i<str.length(); i++)
        {
            char a=str.charAt(i);
            if ((a>='0' && a<='9') || (a>='a' && a<='z') || (a=='@') || (a=='.'))
            {
                if (a=='@')
                    count++;
            }
            else
            	return false;
        }

        if (count != 1)
            return false;
        
        //seperating domain, and checking;
        String[] parts = str.split("@");
        if (parts.length != 2 || parts[0].isEmpty() || parts[1].isEmpty())
        {
            return false;
        }

        if (parts[1].startsWith(".") || parts[1].endsWith("."))
            return false;

        if (parts[0].startsWith(".") || parts[0].endsWith("."))
            return false;

        return true;
    }
}
