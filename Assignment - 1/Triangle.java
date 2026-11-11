import java.lang.*;
class Triangle{
	public static void main(String args[]){
		double a=5,b=5,c=7;
		double s=(a+b+c)/2;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of Triangle is: "+area);
	}
}