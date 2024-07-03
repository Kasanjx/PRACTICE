import java.util.*;
public class Q8
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
        
        int L=0,R=9; 
        while(L<R)
        {
        	int temp=arr[L];
            arr[L]=arr[R];
            arr[R]=temp;
            L++;
            R--;
        }
        
        System.out.println("Reversed array: ");
        for (int i=0;i<10;i++)
        {
            System.out.print(arr[i] + " ");
        }
        
        sc.close();
    }
}