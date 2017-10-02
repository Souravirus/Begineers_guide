/** Factorial of a number is the product of all the integers preceding the entered number and the number itself.
    For instance,
    factorial of 5 is 5*4*3*2*1=120.
    The JAVA code for calculation of the factorial of the entered number is as follows:*/
    ------------------------------------------------------------------------------------------------->
    class FACTORIAL
    { 
      public void FACT(int n) //initialising a function and taking value n from user as a parameter//
      {
        int i,f;       //declaring the variables i and f. i variable is taken as a loop variable to supply values to be multiplied.
        f=1;              //taking a variable f=1 to store the value of the factorial of the entered number n.//
        for(i=1;i<=n;i++)     // a loop from 1 to n (the numbers to be multiplied to produce factorial//
        {
          f=f*i;
        }
        System.out.println("The factorial of the entered number is="+f);  //Command to print the factorial of the entered number.//
      }//method closed//
     }//class closed//
