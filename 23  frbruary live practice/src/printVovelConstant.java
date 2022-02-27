import java.util.Scanner;

public class printVovelConstant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		char ch = sc.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||ch=='A' 
				|| ch=='E' || ch=='I' || ch=='O' || ch=='U' ) {
			
			System.out.println("vovel");
			
		}
		else
		{
			System.out.println("constant");
		}
		
		}

	}


