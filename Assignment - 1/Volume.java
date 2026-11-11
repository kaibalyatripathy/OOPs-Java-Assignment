import java.lang.*;
class Volume{
	public static void main(String args[]){
		int l=5, b=2, h=3, side=4;
		double vol_rec, vol_sqr, vol_cube;
		vol_rec=l*b;
		vol_sqr=side*side;
		vol_cube=side*side*side;
		System.out.println("Volume of rectangle: "+vol_rec);
		System.out.println("Volume of square: "+vol_sqr);
		System.out.println("Volume of cube: "+vol_cube);
	}
}