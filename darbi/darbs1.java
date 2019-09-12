import java.util.Scanner;
public class PerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        in.close();
        detect(number);
	}
	
	static void detect(int n)
	{
		int i, Sum = 0;
		
		for(i = 1 ; i < n ; i++) 
		{
			if(n % i == 0)
			{
				Sum = Sum + i;
			}
		}
		
		if (Sum == n) 
		{
			System.out.printf("\n% d is a Perfect Number", n);
		}
		if (Sum > n) 
		{
			System.out.printf("\n% d is a Abundant Number", n);
		}
		else
		{
			System.out.printf("\n% d is a Deficient Number", n);
		}
	}
}
