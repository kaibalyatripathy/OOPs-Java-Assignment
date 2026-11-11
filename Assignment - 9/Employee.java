class Person{
	String fname, lname, title;
	int empid;
	void getFirstName(){
		System.out.println("First Name: "+fname);
	}
	void getLastName(){
		System.out.println("Last Name: "+lname);
	}
}

class Employee extends Person{
	Employee(String fname, String lname, String title, int empid){
		this.fname=fname;
		this.lname=lname;
		this.title=title;
		this.empid=empid;
	}
	void getEmployeeId(){
		System.out.println("Employee ID: "+empid);
	}
	void getLastName(){
		System.out.println("Last Name: "+lname);
		System.out.println("Job title: "+title);
	}
	public static void main(String[] args){
		Employee obj=new Employee("Anand", "Prasad", "SDE", 101);
		obj.getFirstName();
		obj.getLastName();
		obj.getEmployeeId();
	}
}