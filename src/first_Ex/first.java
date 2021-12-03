package first_Ex;
import java.util.*;
class sample {
	
	static int rollno;
	static float age;
	static String name;
	
	protected static void getdetails() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a name:");
		name=s.next();
		
		System.out.println("Enter rollno:");
		rollno=s.nextInt();
		
		System.out.println("Enter age:");
		age=s.nextFloat();	
	}
}
class sample1 extends sample{
	void display() {
		getdetails();
		System.out.println("Details are:");
		System.out.println("Name: "+name+" roll no: "+rollno+" age: "+age);
	}
}
	
	public class first extends sample1{
	public static void main(String[] args) {
		first f= new first();
		
		f.display();
	}
	}


