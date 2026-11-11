import java.util.*;
class Ass5q2{
	public static void main(String[] args){
		int n=5;
		double e=0;

		for(int i=1;i<=n;i++){
			double f=1;
			for(int j=1;j<=i;j++){
				f*=j;
			}
			e+=1.0/f;
		}
		System.out.println("The value of e is "+e);
	}
}