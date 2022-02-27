import java.util.Scanner;

public class evenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		String ans = "";
	   	   
	    ans=n%2==0?"even":"odd";
         System.out.println(ans);

	}
}
