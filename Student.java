import java.util.*;

class Student{
	String name;
	float math;
	float phy;
	float avg;
	float total;

	void input(){
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter name, marks:");

		name=sc.nextLine();

		math=sc.nextFloat();

		phy=sc.nextFloat();


	}
	void cal(){
		total=math+phy;
		avg=total/2;
	}

	void display(){

		System.out.println(name+" "+math+" "+total+" "+avg);
	}

	public static void main(String arg[]){
		
		
		Student ob=new Student();
		ob.input();
		ob.cal();
		ob.display();
	}

}

