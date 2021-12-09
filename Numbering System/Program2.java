//Write a program which accept number from user and print even factors of that number.
//Input : 24
//Output: 1 2 4 6 8 12

import java.util.*;
import java.util.Scanner;

class Program3
{
    public static void Display(int iNo)
    {
        for(int i=1;i<iNo;i++)
        {
            if(((iNo%i)==0) && ((i%2)==0))
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int iValue = sobj.nextInt();
        Display(iValue);
    }
}
