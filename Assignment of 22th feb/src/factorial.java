import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int i=1;
		int fact=1;
		do
		{
			fact=fact*i;
			i++;
			if(i>2 && i<5) {
			continue;
			}
			
			
		}while(i<=n);
		System.out.println(fact);
		
		
	}
}
