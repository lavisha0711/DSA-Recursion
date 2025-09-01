//calculate the sum of numbers from 1 to n using recursion
import java.util.Scanner;
public class sumnto1
{
    public static int sum(int n,int sum)
    {
        if(n==0 )
        {
            return sum;
        }
        return sum(n-1,n+sum);
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println(sum(n,0));
    }
}