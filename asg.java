import java.util.Scanner;

public class asg {
    public static void main(String[] args) {
        int n,i,j,temp;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the number of elements");
    n=in.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the elements:");
    for(i=0;i<n;i++)
    {
        arr[i]=in.nextInt();
    }
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
    }
    System.out.print("Assending order:");
    for(i=0;i<n-1;i++)
    {
    System.out.print(arr[i] +",");
    }
    System.out.print(arr[n-1]);     
    }

    
}

    
