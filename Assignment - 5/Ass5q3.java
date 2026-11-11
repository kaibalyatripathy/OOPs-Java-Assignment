import java.util.*;
class Ass5q3{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter the size of array: ");
		int n=scn.nextInt();

		int arr[]=new int[n];

		System.out.print("Enter "+n+" elements: ");
		for(int i=0;i<n;i++)
			arr[i]=scn.nextInt();

		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		System.out.print("Sorted array is: ");
		for(int i:arr)
			System.out.print(i+ " ");	
		scn.close();
	}
}