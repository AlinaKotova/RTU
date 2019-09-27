package imperativeLambda;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class PerfectNumberLambda 
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
			int[] arr = IntStream.rangeClosed(1, n).toArray();
			IntStream stream = Arrays.stream(arr).filter(d -> n % d == 0);
			stream.forEach(s->divs.add(s));
			return divs;		
		}
		
		
		public static STATE process(int n)
		{
			Set<Integer> divisors = divisors(n);
			
			Integer Sum = divisors.stream().mapToInt(Integer::intValue).sum() -n;
			
			return Sum == n ? STATE.PERFECT
			         : Sum < n ? STATE.DEFICIENT
			         : STATE.ABUNDANT;	
		}
}


