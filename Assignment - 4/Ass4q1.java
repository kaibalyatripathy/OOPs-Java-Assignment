import java.util.*;
class Ass4q1{
	public static void main(String[] args){
		Scanner scn =new Scanner(System.in);
		double a,b,c,r1,r2;
		System.out.print("Enter the value of a: ");
		a=scn.nextInt();
		System.out.print("Enter the value of b: ");
		b=scn.nextInt();
		System.out.print("Enter the value of c: ");
		c=scn.nextInt();
		double d=(b*b)-(4*a*c);
		if(a==0)
			System.out.println("Not a quadratic equation");
		else{
			if(d>0){
				r1=(-b+Math.sqrt(d))/(2*a);
				r2=(-b-Math.sqrt(d))/(2*a);
				System.out.println("Root r1= "+r1);
				System.out.println("Root r2= "+r2);
			}else if(d==0){
				r1=(-b+Math.sqrt(d))/(2*a);
				System.out.println("Both roots are= "+r1);
			}else
				System.out.println("Imaginary roots");
		}
		scn.close();
	}
}