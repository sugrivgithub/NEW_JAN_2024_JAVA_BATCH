package packag5Day5;

	
	public class Assignement2 {
		
		//Assignment_2 (DAY3 3 Feb2024) (((((10/2)-2)+2)-2)/2)
		
		public int div(int a, int b)
		{
			int c=a/b;
			return c;
		}
		
		public int sub(int a, int b)
		{
			int c=a-b;
			return c;
		}
		
		public int sum(int a, int b)
		{
			int c=a+b;
			return c;
		}
		
		public void main(String args[])
		{
			Assignement2 ob=new Assignement2();
			int div1=ob.div(1, 2);
			int sub1=ob.sub(div1, 2);
			int sum1=ob.sum(sub1, 2);
			int sub2=ob.sub(sum1, 2);
			int div=ob.div(sub2, 2);
			System.out.println("result of assigment 2 is "+ div);
			
			
		}
	
		

}
