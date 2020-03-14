import java.util.*;
class Count
{
	public static void main(String args[])
{
		String str,sub;
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		System.out.println("Enter the substring");
		sub=sc.nextLine();
		int i,c=0;
		for(i=str.indexOf(sub);i!=-1 &&i<str.length();i=str.indexOf(sub,i+sub.length()))
			c++;
		System.out.println(c);
	}
}
