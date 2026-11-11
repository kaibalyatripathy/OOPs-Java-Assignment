import java.util.*;
class Ass4q3{
	public static void main(String[] args){
		Scanner scn =new Scanner(System.in);
		int m,y;
		System.out.print("Enter month(1-12): ");
		m=scn.nextInt();
		System.out.print("Enter year: ");
		y=scn.nextInt();
		if(m==2){
			if(y%4==0 || (y%400!=0 && y%100==0))
				System.out.println("29 days");
			else
				System.out.println("28 days");
		}else if(m==4 || m==6 || m==9 || m==11)
			System.out.println("30 days");
		else if(m>=1 && m<=12)
			System.out.println("31 days");
		else
			System.out.println("Invalid Month");
	}
}