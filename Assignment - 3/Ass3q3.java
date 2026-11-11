import java.util.*;

class Ass3q3{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		double e1,e2,cost=0;
		System.out.print("Enter the old reading: ");
		e1=scn.nextDouble();
		System.out.print("Enter the new reading: ");
		e2=scn.nextDouble();
		double e=e2-e1;
		scn.close();
		if(e<=100) cost=3*e;
		else if(e<=500) cost=(3*100)+(4*(e-100));
		else cost = (3*100)+(4*400)+((e-500)*6);
		System.out.println("Total electricity cost: "+cost);
	}
}