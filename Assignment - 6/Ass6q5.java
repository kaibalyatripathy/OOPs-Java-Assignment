import java.util.*;
class Ass6q5{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter the size of 1st array: ");
		int m=scn.nextInt();

		String arr1[]=new String[m];

		System.out.print("Enter "+m+" elements: ");
		for(int i=0;i<m;i++)
			arr1[i]=scn.next();

		System.out.print("Enter the size of 2nd array: ");
		int n=scn.nextInt();

		String arr2[]=new String[n];

		System.out.print("Enter "+n+" elements: ");
		for(int i=0;i<n;i++)
			arr2[i]=scn.next();

		String ans[]=new String[n];
		int k=0;

		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(arr1[i].equals(arr2[j])){
					ans[k++]=arr1[i];
					j=n;
				}
			}
		}

		System.out.print("Common elements are: ");
		for(String i:ans){
			if(i==null) break;
			System.out.print(i+" ");
		}
	
		scn.close();
	}
}