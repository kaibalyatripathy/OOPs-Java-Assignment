import java.util.*;
class Ass4q2{
	public static void main(String[] args){
		Scanner scn =new Scanner(System.in);
		float n1,n2;
		System.out.print("Enter first number: ");
		n1=scn.nextFloat();
		System.out.print("Enter second number: ");
		n2=scn.nextFloat();
		if((int)(n1*1000)==(int)(n2*1000))
			System.out.println("Same");
		else
			System.out.println("Not Same");
	}
}