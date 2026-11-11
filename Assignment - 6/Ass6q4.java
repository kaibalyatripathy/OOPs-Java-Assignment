import java.util.*;
class Ass6q4{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter the size of array: ");
		int n=scn.nextInt();

		int arr[]=new int[n];

		System.out.print("Enter "+n+" elements: ");
		for(int i=0;i<n;i++)
			arr[i]=scn.nextInt();

		Arrays.sort(arr);
		for(int i=0;i<n-1;i++){
			if(arr[i]==arr[i+1]){
				System.out.println("Duplicate element: "+arr[i]);
				while(i<n-1 && arr[i]==arr[i+1]) i++;
			}
		}
	
		scn.close();
	}
}