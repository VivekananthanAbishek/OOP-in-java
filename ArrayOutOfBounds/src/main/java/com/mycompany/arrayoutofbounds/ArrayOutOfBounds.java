
package com.mycompany.arrayoutofbounds;
public class ArrayOutOfBounds 
{

    public static void main(String[] args) 
    {
        int Arr[]={1,2,3,4,5};
        
        try
        {
            int newArr=Arr[10];
            System.out.println("New Array is: "+newArr);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: Array index is out of bounds!");
            System.out.println("Array size is 10!");
        }
    }
}
