import java.util.Scanner;
import java.util.stream.*;
import java.lang.*;

public class PerfectNumberLambda 
{
	public static void main(String[] args) 
	{	
	   Scanner in = new Scanner(System.in);                  //get a number
       System.out.print("Enter a positive number: ");
       int number = in.nextInt();
       in.close();
       
       int sum = IntStream.range(1, number/2+1).filter(d -> number % d == 0).sum();   //get a total of a number divisors
       System.out.print(Compare(number,sum));             //get a result   
	} 	
	
	public static String Compare(int x, int y) 
	{
	    return x < y ? "Abundant Number"
	         : x > y ? "Deficient Number"
	         : "Perfect Number"; 
	}
}



