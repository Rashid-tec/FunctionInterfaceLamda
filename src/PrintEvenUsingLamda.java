import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PrintEvenUsingLamda {
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,5,6,7,8);
		Predicate<Integer> isEven=n-> n % 2==0;
		
		Predicate<Integer> isOdd=n-> n % 2==1;
		list.forEach(n->
				{
			if(isEven.test(n))
			{
				System.out.println(n+" "+"is Even");
			}
			else if(isOdd.test(n))
			{
				System.out.println(n+" "+"is Odd");
			}
				});
		
		
	}

}
