import java.util.Scanner;

public class lessGreter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
	
		
		if(n==10 || n==20 || n==30 || n==40 || n==50)
		{
			System.out.println("Number is equals");
		}
		else
		{
			System.out.println("Invalid Input");
		}

	}

}
