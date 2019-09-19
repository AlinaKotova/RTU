import java.util.Scanner;

public class DigitSum
{
	public static void main(String[] args) 
	{	
	   Scanner in = new Scanner(System.in);                  
       System.out.print("Enter an integer number: ");
       int number = in.nextInt();
       in.close();
       System.out.printf("Super digit of figure is: %d" ,SuperDigit(number));             
	} 	
	
	static int SuperDigit(int number) 
	{
	   int sum,dig = 0;
	   
	   if (number == 0) 
		   return 0;
	   else 
	   {
		   dig = number%10;
		   sum = dig + SuperDigit(number/10);
	   }
	
	   if(sum > 9)
	   {
		   number = sum;
		   sum = SuperDigit(number);
	   }
	   return sum;
	}
}
