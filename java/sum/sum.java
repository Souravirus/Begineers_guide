import java.io.*;
import java.util.Scanner;
public class sum
{
    public static void main(String args[])
    {
        int result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        result=a+b;
        System.out.print(result);
    }
}
