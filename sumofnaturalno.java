import java.util.Scanner;
public class sumofnaturalno
{
    public static int sum(int n)
    {
        if(n==1) return 1;

        return n + sum(n-1);

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();

        System.out.println(sum(n));
    }
}