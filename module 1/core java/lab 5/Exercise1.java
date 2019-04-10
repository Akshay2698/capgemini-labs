import java.util.Scanner;
public class Exercise1
{
	public static void main(String args[])
	{
		
		System.out.println("press 1 to red light");
		System.out.println("press 2 to yellow light");
		System.out.println("press 3 to green light");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		switch(num)
		{
			case 1:
			System.out.println("stop");
			break;
			
			case 2:
			System.out.println("ready");
			break;
			
			case 3:
			System.out.println("go");
			break;
			
			default:
			System.out.println("wrong choice");
			
		}
	}
}