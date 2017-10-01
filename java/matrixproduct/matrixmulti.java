import java.io.*;
import java.util.Scanner;
class matrixmulti
{
	public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int i,j,n,a[][],b[][],sum,m;
        a=new int[2][2];
        b=new int[2][2];
        System.out.println("Enter a 2 by 2 matrix:");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
                a[i][j]=in.nextInt();
        }
        System.out.println("Enter another 2 by 2 matrix:");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
                b[i][j]=in.nextInt();
        }
        System.out.println("Here are the results:");
        for(i=0;i<2;i++)
        {
            for(m=0;m<2;m++)
            {
                sum=0;
                for(j=0;j<2;j++)
                {
                    sum=sum+((a[i][j])*(b[j][m]));
                }
                System.out.print(sum);
                if(m==1)
                    System.out.print("\n");
                else
                    System.out.print(" ");
            }
        }
	}
}
