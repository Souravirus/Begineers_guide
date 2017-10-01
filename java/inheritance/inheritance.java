import java.util.Scanner;
class arithemetic{
    double a1;
    double a2;
}
class addition extends arithemetic{
    addition(double a1,double a2)
    {
        this.a1=a1;
        this.a2=a2;
    }
    double add()
    {
        return (this.a1+this.a2);
    }
}
class subtraction extends arithemetic{
    subtraction(double a1,double a2)
    {
        this.a1=a1;
        this.a2=a2;
    }
    double subtract()
    {
        return(this.a1-this.a2);
    }
}
class multiplication extends arithemetic{
    multiplication(double a1,double a2)
    {
        this.a1=a1;
        this.a2=a2;
    }
    double multiply()
    {
        return(this.a1*this.a2);
    }
}

class division extends arithemetic{
    division(double a1,double a2)
    {
        this.a1=a1;
        this.a2=a2;
    }
    double divide()
    {
        return(this.a1/this.a2);
    }
}
public class inheritance{
    public static void main(String args[]){
        String arg[];
        arg=new String[3];
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an expression like a+b , a-b, a*b, a/b with space in between a and b");
        
        for(i=0;i<3;i++)
        {
            arg[i]=sc.next();
        }

        double numOne = Double.parseDouble(arg[0]);
        double numTwo = Double.parseDouble(arg[2]);
        char c=arg[1].charAt(0);

        arithemetic Ari=new arithemetic();
        addition Add=new addition(numOne,numTwo);
        subtraction sub=new subtraction(numOne,numTwo);
        multiplication multi=new multiplication(numOne,numTwo);
        division div=new division(numOne,numTwo);

        double a=0; 
        if(c=='+')
        {
            a=Add.add();
        }
        else if(c=='-')
        {
            a=sub.subtract();
        }
        else if(c=='*')
        {
            a=multi.multiply();
        }
        else if(c=='/')
        {
            a=div.divide();
        }
        else
        {
            System.out.println("Enter a correct Symbol");
        }
        System.out.println(a);
    }
}
