import java.lang.*;
import java.util.*;
class Ass3q4{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		double n;
		System.out.print("Enter a number: ");
		n=scn.nextDouble();

		if(n>0)
			System.out.println(n+" is a positive number");
		else if(n<0)
			System.out.println(n+" is a negative number");
		else
			System.out.println(n+" is zero");
	}
}