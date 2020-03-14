import java.util.*;

class Fibo{
	public static void main(String args[]){

		int a=0, b=0, c=1, n;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of n: ");
		n = sc.nextInt();

		for(int i=1; i<=n; i++){
			a = b;
			b = c;
			c = a+b;
			
			System.out.println(a);
		}
	}
}