package packag5Day5;

public class Constructor {
	
	public Constructor()
	{
		this(2,3,4);
	System.out.println("Default construcor");
	}
	
	public Constructor(int a)
	{
		this();
		System.out.println("One parameterized constructor");
	}
	
	public Constructor(int a, int b)
	{
	    this(2);
		System.out.println("Two parameterized constructor");
	}
	
	public Constructor(int a,int b,int c)
	{
		
	System.out.println("Three parameterized constructor");
	
	}
	
	public Constructor(int a,int b,int c, int d)
	{
		this(2,3);
		System.out.println("four parameterized constructor");
	}
	
	
	
	public static void main (String[] args)
	{
		Constructor obj=new Constructor(2,3,4,5);

	}
		
	
	}


