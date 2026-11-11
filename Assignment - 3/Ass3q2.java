import java.lang.*;
import java.util.*;
class Ass3q2{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		double gross, basic, HRA, DA;
		System.out.print("Enter the basic salary: ");
		basic=scn.nextDouble();

		HRA=0.1*basic;
		DA=0.6*basic;
		gross=basic+HRA+DA;
		
		System.out.println("Gross salary = "+gross);
	}
}