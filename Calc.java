import java.util.*;
import java.util.Scanner;
public class Calc
{
	public static void main(String[] args) throws Exception
	{
		//System.out.print("Enter the operators: (+,-,*,/)");
		String optr=args[0];
		int a=args[1];
		int b=args[2];

		if(optr.equals("+"))
		{
		System.out.println("Sum: "+(a+b));
		}
		else if(optr.equals("-"))
		{
		System.out.println("Difference: "+(a-b));
		}
		else if(optr.equals("*"))
		{
		System.out.println("Product: "+(a*b));
		}
		else if(optr.equals("/"))
		{
		System.out.println("Quotient: "+(a/b));
		}
		else
		{
		System.out.println("Invalid operator......");
		}
	}
}
