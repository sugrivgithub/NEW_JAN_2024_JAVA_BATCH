package packag5Day5;

public class Method {
	
	public void method1()
	{
		System.out.println("Default Method");
		this.method1(30);
	}
	
	public void method1(int a)
	{
		System.out.println("one parameterized method");
		this.method1(10,50);
	}
	
	public void method1(int a, int b)
	{
		System.out.println("two parameterized method");
	}
	
	public void method1(int a, int b, int c)
	{
		
		System.out.println("three parametrized method");
		this.method1(10,20,30,40);
	}
	
	public void method1(int a, int b, int c, int d)
	{
		
		System.out.println("Four parametrized method");
		this.method1();
	}
	
	public static void main(String[] args)
	{
		Method obj=new Method();
		obj.method1(3,4,5);
		
	}

}
