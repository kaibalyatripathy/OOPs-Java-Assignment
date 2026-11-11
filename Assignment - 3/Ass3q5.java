import java.lang.*;
import java.util.*;
class Ass3q5{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		double cost,sell,diff;
		System.out.print("Enter the cost price: ");
		cost=scn.nextDouble();
		System.out.print("Enter the selling price: ");
		sell=scn.nextDouble();
		scn.close();

		if(cost>sell){
			diff=cost-sell;
			double loss = (diff/cost)*100;
			System.out.println("Loss percentage: "+loss+"%");
		}else{
			diff=sell-cost;
			double profit = (diff/cost)*100;
			System.out.println("Profit percentage: "+profit+"%");
		}
	}
}