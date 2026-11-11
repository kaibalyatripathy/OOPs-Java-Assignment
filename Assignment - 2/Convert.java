import java.lang.*;
class Convert{
	public static void main(String args[]){
		int mins=50000;

		int totaldays=mins/(24*60);

		int years=totaldays/365;
		int days=totaldays%365;

		System.out.println("Years= "+years+", Days= "+days);
	}
}