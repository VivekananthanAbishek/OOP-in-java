
package com.mycompany.labexception;
import java.util.Scanner;
public class LabException 
{

    public static void main(String[] args) 
    {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the Numerator: ");
       int Numerator=s.nextInt();
       
       System.out.println("Enter the Denominator: ");
       int Denominator=s.nextInt();
       
       try
       {
           int Result=Numerator/Denominator;
           System.out.println("Result is: "+Result);
       }
       catch(Exception e)
       {
           System.out.println("Divided by Zero is a Error!");
           System.out.println(e.getMessage());
       }
    }
}
