class Vehicle{
	void drive(){
		System.out.println("Driving");
	}
}

class Car extends Vehicle{
	void drive(){
		System.out.println("Repairing a car");
	}
	public static void main(String[] args){
		Car obj = new Car();
		obj.drive();
	}
}