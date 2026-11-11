import java.util.*;
class Student{
	static String name,course;
	static int rollno;
	static void courseChoice(){
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name:");
		name=sc.nextLine();
		System.out.print("Enter roll no:");
		rollno=sc.nextInt();
		System.out.println("Given choices:\n" +
            "1. Python\n" +
			"2. Java\n" +
			"3.  C++");
		System.out.print("Enter your choice:");
		ch=sc.nextInt();
		switch(ch){
			case 1:
				course="Python Programming";
				break;
			case 2:
				course="Java Programming";
				break;
			case 3:
				course="C++ Programming";
				break;
			default:
				System.out.println("Wrong Choice");
		}
	}
	static void display(){
		System.out.println("Name: "+name);
		System.out.println("Roll No.: "+rollno);
		System.out.println("Course selected: "+course);

	}
	public static void main(String args[]){
		courseChoice();
		display();
	}
}