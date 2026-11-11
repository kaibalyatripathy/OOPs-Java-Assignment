import java.util.*;
class Ass6q2{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter the size of array: ");
		int n=scn.nextInt();

		int arr[]=new int[n];
		int sum=0;

		System.out.print("Enter "+n+" elements: ");
		for(int i=0;i<n;i++){
			arr[i]=scn.nextInt();
			sum+=arr[i];
		}

		int avg=sum/n;

		System.out.print("Average of the array is: "+avg);	
		scn.close();
	}
}