import java.util.*;

class Ass4q5{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter an alphabet: ");
		char ch= scn.next().charAt(0);
		
		ch=Character.toLowerCase(ch);

		if(ch=='a' || ch=='i' || ch=='e' || ch=='o' || ch=='u')
			System.out.println("Vowel");
		else
			System.out.println("Consonant");
		scn.close();
	}
}