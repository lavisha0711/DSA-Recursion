//time complexity = O(log(min(a,b)))

import java.util.Scanner;
public class Gcd
{
    public static int gcdOfNum(int a,int b)
    {
        if(a==0) return b;

        return gcdOfNum(b%a,a);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of first number:");
        int a = sc.nextInt();
        System.out.print("Enter the value of second number:");
        int b = sc.nextInt();
        System.out.println(gcdOfNum(a,b));
    }
}