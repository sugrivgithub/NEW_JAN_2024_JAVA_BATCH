package packag5Day5;

public class Student {
		
		int rollNo;
		int age;
		
		public void display1()
		{
			System.out.println("Welcome to all of you");
			
		}

		public void display2()
		{
			System.out.println("Automation is very easy");
		}
		
		public static void main (String args[])
		{
			Student obj = new Student();
			obj.age=20;
			obj.rollNo=25;
			obj.display1();
			obj.display2();
			System.out.println("Roll No" + obj.rollNo);
			System.out.println("Age is" + obj.age);
		}



}
