package imperative;

import java.util.HashSet;
import java.util.Set;

public class PerfectNumber 
{
		enum STATE
		{
			ABUNDANT,
			DEFICIENT,
			PERFECT
		}
		

		public static Set<Integer> divisors(int n)
		{
			Set<Integer> divs = new HashSet<Integer>();
			for(int i = 1 ; i <= n ; i++) 
			{
				if(n % i == 0)
				{
					divs.add(i);
				}
			}
			return divs;
		}
		
		public static STATE process(int n)
		{
			int Sum = 0;
			
			
			for(Integer div : divisors(n))
			{
		          Sum+= div;	
		    }
			
			Sum-=n;
			  
			if (Sum == n) return STATE.PERFECT;
			
			if (Sum > n) return STATE.ABUNDANT;

			else return STATE.DEFICIENT;
			
		}
}


