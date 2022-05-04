import java.util.*;
public class Calculator
{
	public static void main(String[] args)
	{
		int a=20;
		int b=2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the operators: (+,-,*,/)");
		String optr=sc.nextLine();
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