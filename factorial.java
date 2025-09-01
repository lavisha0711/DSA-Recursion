import java.util.*;
public class factorial
{
    public static int factorial(int n)
    {
        //base case
        if(n ==1 || n==0)
        {
            return 1;
        }
        //subproblem recursive work
        int smallans = factorial(n-1);

        //self work
        return n*smallans;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to finf factorial of:");
        int n = sc.nextInt();

        System.out.println(factorial(n));

    }
}