import java.util.*;
public class Replace
{
	public static void main(String args[])
	{
		String s,f,r;
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the string: ");
		s=sc.nextLine();
		System.out.print("Enter the string to find: ");
		f=sc.nextLine();
		System.out.print("Enter the string to replace: ");
		r=sc.nextLine();
		s=s.replaceAll(f,r);
		System.out.println("The modified string is: "+s);
	}

}
