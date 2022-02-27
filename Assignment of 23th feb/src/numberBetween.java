import java.util.Scanner;

public class numberBetween {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		int n=sc.nextInt();
		
		if(n<=10)
		{
			if(n%2==0)
			{
				 System.out.println(n);	
			}
			else
			{
				System.out.println("Invalid input");
			}
			
		}

	}

}
