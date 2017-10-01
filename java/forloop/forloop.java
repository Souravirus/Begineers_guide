import java.io.*;
class forloop{
public static void main(String args[])
{
	int i,n=3;
	System.out.print("3, ");
	for(i=4;i<=64;i=i*2)
	{
		n=n+i;
		System.out.print(n+", ");
	}
	}
}
