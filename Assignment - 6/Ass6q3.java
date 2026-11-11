import java.util.*;
class Ass6q3{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter the size of array: ");
		int n=scn.nextInt();

		int arr[]=new int[n];
		int mx=Integer.MIN_VALUE,mn=Integer.MAX_VALUE;

		System.out.print("Enter "+n+" elements: ");
		for(int i=0;i<n;i++){
			arr[i]=scn.nextInt();
			if(arr[i]>mx) mx=arr[i];
			if(arr[i]<mn) mn=arr[i];
		}

		System.out.println("Maximum of the array is: "+mx);
		System.out.println("Minimum of the array is: "+mn);		
		scn.close();
	}
}