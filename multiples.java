import java.util.Scanner;
public class multiples
{
    public static int-2 multiple(int n, int k)
    {
        if(k==1) return n;

        int smallans = multiple(n,k-1);

        return smallans*n;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n= sc.nextInt();
        System.out.print("Enter the value of k:");
        int k = sc.nextInt();

        System.out.println(multiple(n,k));

    }
}
