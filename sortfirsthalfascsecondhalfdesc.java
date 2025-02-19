import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    Scanner S=new Scanner(System.in);
	    int n=S.nextInt();
	    int[]arr=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=S.nextInt();
	    }
	    Arrays.sort(arr,0,n/2);
	    Arrays.sort(arr,n/2,n);
	    for(int i=n/2,j=n-1;i<j;i++,j--)
	    {
	        int temp=arr[i];
	        arr[i]=arr[j];
	        arr[j]=temp;
	    }
	    
		System.out.println(Arrays.toString(arr));
	}
}