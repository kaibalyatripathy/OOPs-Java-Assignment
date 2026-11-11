import java.lang.*;
class Swap2{
	public static void main(String args[]){
		int x=5, y=10;
		System.out.println("Before Swapping: "+x+", "+y);
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("After Swapping: "+x+", "+y);
	}
}