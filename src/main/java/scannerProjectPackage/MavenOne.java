package scannerProjectPackage;

import java.util.Scanner;

public class MavenOne {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		Scanner scanner2 =new Scanner(System.in);
		
		
		
		
		System.out.println("-----Enter name----------");
		String name =scanner.nextLine();
		System.out.println("Name==========>"+name);
		
		
		System.out.println("------Enter Age-----------");
		int age =scanner.nextInt();
		System.out.println("Age===========>"+age);
		
		
		System.out.println("-------Designagtion--------");
		String desig =scanner2.nextLine();
		System.out.println("Designation====>  "+desig);
		
	}

}
