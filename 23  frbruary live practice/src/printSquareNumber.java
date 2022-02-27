import java.util.Scanner;

public class printSquareNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		int square =n*n;
	  if(square<10)
	{
		System.out.println(square + " " + "The square is less than 10");
		}
	else
	{
		System.out.println(square + " " + "The square is not less than 10");
	}
	}

}
