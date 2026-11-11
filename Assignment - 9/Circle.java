class Shape{
	int side;
	void getPerimeter(){
		System.out.println("Perimeter: "+(4*side));
	}
	void getArea(){
		System.out.println("Area: "+(side*side));
	}
}

class Circle extends Shape{
	double radius;
	Circle(int side){
		this.side=side;
	}
	Circle(double radius){
		this.radius=radius;
	}
	void getPerimeter(){
		System.out.println("Perimeter: "+(2*3.14*radius));
	}
	void getArea(){
		System.out.println("Area: "+(3.14*radius*radius));
	}
	public static void main(String[] args){
		Circle obj=new Circle(7.00);
		obj.getPerimeter();
		obj.getArea();
	}
}