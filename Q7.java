import java.util.*;
public class Q7
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.print("Enter 10 array elements: ");
        
        for (int i=0; i<10; i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int max=arr[0],min=arr[0];
        for (int i=0;i<10;i++)
        {
        	if(arr[i]>max)
        		max=arr[i];
        }
        for (int i=0;i<10;i++)
        {
        	if(arr[i]<min)
        		min=arr[i];
        }
        System.out.println("The maximum value: "+max+" and the minimum: "+min);
        sc.close();
    }
}
