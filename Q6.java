import java.util.*;
public class Q6 
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
        
        int peak=arr[0];
        if (arr[0]>arr[1])
            peak=arr[0];
        for (int i=1;i<9;i++)
        {
        	if(arr[i]>arr[i+1]&&arr[i]>arr[i-1])
        		peak = arr[i];
        }
        if (arr[9]>arr[8])
            peak=arr[9];
         

        System.out.println("PEAK: "+peak);
        sc.close();
    }
}
