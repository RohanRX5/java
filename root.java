import java.util.*;

class Root{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int a,b,c, arr;
		double root1, root2;

		System.out.println("Enter the value of a,b and c ");

		a = sc.nextInt();

		b = sc.nextInt();

		c = sc.nextInt();


arr = (b*b)-4*a*c;



if(arr>0){

	root1 = (-b + (Math.sqrt(arr)))/(2*a);

		root2 = (-b - (Math.sqrt(arr)))/(2*a);

System.out.printf("Root1: "+root1+"\nRoot2: "+root2);



}

if(arr==0){
	System.out.println("Root is: "+ (-b+(Math.sqrt(arr)))/(2*a));
}

	}
}