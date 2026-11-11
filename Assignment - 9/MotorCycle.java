class Vehicle{
	String make;
	String model;
	int year;
	String fuelType;
	Vehicle(String make, String model, int year, String fuelType){
		this.make=make;
		this.model=model;
		this.year=year;
		this.fuelType=fuelType;
	}
	double efficiency(){
		return 5.0;
	}
	int distance(){
		return 1999;
	}
	int maxSpeed(){
		return 100;
	}
	void display(double eff, int dis, int speed){
		System.out.println("Efficiency: "+eff);
		System.out.println("Distance: "+dis);
		System.out.println("Speed: "+speed);
	}
}
class Truck extends Vehicle{
	Truck(String make, String model, int year, String fuelType){
		super(make, model, year, fuelType);
	}
	double efficiency(){
		return 6.0;
	}
	int distance(){
		return 9999;
	}
	int maxSpeed(){
		return 120;
	}
}
class Car extends Vehicle{
	Car(String make, String model, int year, String fuelType){
		super(make, model, year, fuelType);
	}
	double efficiency(){
		return 7.0;
	}
	int distance(){
		return 2500;
	}
	int maxSpeed(){
		return 140;
	}
}
class MotorCycle extends Vehicle{
	MotorCycle(String make, String model, int year, String fuelType){
		super(make, model, year, fuelType);
	}
	double efficiency(){
		return 8.0;
	}
	int distance(){
		return 2000;
	}
	int maxSpeed(){
		return 110;
	}
	public static void main(String[] args){
		Truck t = new Truck("Odisha","Tata",2020,"Diesel");
		Car c = new Car("Bihar","Hyundai",2017,"Diesel");
		MotorCycle m = new MotorCycle("Delhi","Honda",2014,"Petrol");

		System.out.println("Car:");
		c.display(c.efficiency(),c.distance(),c.maxSpeed());
		System.out.println("Truck:");
		t.display(t.efficiency(),t.distance(),t.maxSpeed());
		System.out.println("MotorCycle:");
		m.display(m.efficiency(),m.distance(),m.maxSpeed());

	}
}