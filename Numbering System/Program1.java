//Write a program which accept one number from user and print that number of even numbers on screen. 

//Input : 7 
//Output: 2 4 6 8 10 12 14

import java.util.*;
import java.util.Scanner;

class Program2
{
    public static void Display(int iNo)
    {
        int i=0;
        for(i=1;i<= iNo*2;i++)
        {
            if((i%2)==0)
            {
                System.out.println(i);
            }
            
        }
    }
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter number: ");
        int iValue = sobj.nextInt();

        Display(iValue);
    }
}
