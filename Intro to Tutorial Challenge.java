import java.util.Scanner;
public class Ram
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[] arr=new int[b];
        for(int i=0;i<b;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        int j=0;
        int k=b-1;
        while(j<=b)
        {
            int m=j+(k-j)/2;
            if(arr[m]==a)
            {
                System.out.println(m);
                return;
            }
            else if(arr[m]<a)
            {
                j=m+1;
            }
            else
            {
                k=m-1;
            }
        }
    }
}