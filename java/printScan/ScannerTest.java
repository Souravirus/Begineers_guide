import java.io.*;
import java.util.Scanner;
class ScannerTest{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter Roll No:");
	int rollno=sc.nextInt();
    System.out.println("Enter name:");
	String name=sc.next();
    System.out.println("Enter the marks");
	float marks=sc.nextFloat();
	System.out.println("Roll No:"+rollno+" name:"+name+" marks:"+marks);
	}
}
