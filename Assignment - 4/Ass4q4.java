import java.util.*;
class Ass4q4{
	public static void main(String[] args){
		Scanner scn =new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter three numbers: ");
		a=scn.nextInt();
		b=scn.nextInt();
		c=scn.nextInt();

		if(a>b && a>c)
			System.out.println("Greatest = "+a);
		else if(b>c && b>a)
			System.out.println("Greatest = "+b);
		else
			System.out.println("Greatest = "+c);
	}
}