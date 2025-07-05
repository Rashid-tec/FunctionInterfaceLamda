
@FunctionalInterface
public interface FunctuionalDemo {
	public void show(int n);
	default String nameDemo()
	{
		return "Rashid doing devops";
	}
	default String nameDemo1()
	{
		return "Vijay doing devops";
	}
	public static void  mathodStatic()
	{
		System.out.println("static method in interface");
	}
	public static void  mathodStatic1()
	{
		System.out.println("static1 method in interface");
	}

}
