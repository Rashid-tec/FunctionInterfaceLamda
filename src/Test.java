import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Test {
	public static void main(String[] args) {
		FunctuionalDemo t=(int n)->
		{
			System.out.println(n*2);
		};
		t.show(4);
		System.out.println(t.nameDemo());
		System.out.println(t.nameDemo1());
		FunctuionalDemo.mathodStatic();
		FunctuionalDemo.mathodStatic1();
		List<Integer> list=Arrays.asList(1,2,3,4,5);
	
	}

}
