import java.util.Scanner;
class matrixsum
{
	public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int i,j,a[][],b[][];
        a=new int[2][2];
        b=new int[2][2];
        System.out.println("Enter a 2 by 2 matrix");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            a[i][j]=in.nextInt();
        }
        System.out.println("Enter another 2 by 2 matrix");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            b[i][j]=in.nextInt();
        }
        System.out.println("Here are the results");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print((a[i][j]+b[i][j]));
                if(j==1)
                System.out.print("\n");
                else
                System.out.print(" ");	
            }
        }
	}
}

