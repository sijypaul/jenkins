import java.util.*;
import java.util.Scanner;
public class Calc
{
	public static void main(String[] args) throws Exception
	{
		//System.out.print("Enter the operators: (+,-,*,/)");
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		String optr=args[2];

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
