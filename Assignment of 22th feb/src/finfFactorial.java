import java.util.Scanner;

public class finfFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		int fact = 1;
		int i = 1;
		while (i <= n) {
			fact = fact * i;
			i++;

		}
		System.out.println(fact);

	}

}
