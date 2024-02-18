package packag5Day5;

public class Class3 {
	
			//Assignment_1 (DAY3 3 Feb2024) (((((10+2)+2)-2)*2)/2)
			
			public int sum(int a, int b)
			{
				int c=a+b;
				return c;
			}
			
			public int sub(int a, int b)
			{
				int c=a-b;
				return c;
			}
			
			public int multi(int a, int b)
			{
				int c=a+b;
				return c;
			}
			
			public int div(int a, int b)

			{
				int c = a/b;
				return c;
			}
			
			public void main(String args[])
			{
				Class3 ob=new Class3();
				
				int sum1=ob.sum(10, 2);
				int sum2=ob.sum(sum1, 2);
				int sub=ob.sub(sum2, 2);
				int multi=ob.multi(sub, 2);
				int div=ob.div(multi, 2);
				System.out.println("result of assigment 2 is "+ div);
				
				
			}


	}
