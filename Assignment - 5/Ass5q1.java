import java.util.*;
class Ass5q1{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
	
		System.out.print("Enter the number of terms: ");
		int n=scn.nextInt();

		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i+1;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		scn.close();
	}
}