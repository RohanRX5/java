import java.util.*;

class Reverse{
	public static void main(String args[]){

		String str[100];

		System.out.println("Enter a string: ");

		Scanner sc= new Scanner (System.in);

		str= sc.nextLine();

		for(int i=str.length()-1; i>=0; i--){
			System.out.println(str[i]);
		}

	}
}