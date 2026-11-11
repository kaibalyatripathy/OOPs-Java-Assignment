import java.util.*;
class Ass5q4{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter the size of array: ");
		int n=scn.nextInt();

		int arr[]=new int[n];

		System.out.print("Enter "+n+" elements: ");
		for(int i=0;i<n;i++)
			arr[i]=scn.nextInt();

		Arrays.sort(arr);

		System.out.print("Enter a value to search: ");
		int val=scn.nextInt();

		int low=0,high=n-1,mid;
		boolean found=false;
		while(low<=high){
			mid=(high+low)/2;
			if(arr[mid]==val){
				found=true;
				break;
			}else if(val>arr[mid])
				low=mid+1;
			else
				high=mid-1;
		}
		if(found)
			System.out.println("Item found");
		else
			System.out.println("Item not found");
		scn.close();
	}
}