class Bank{
	double roi;
	double getRoi(){
		return roi;
	}
}
class SBI extends Bank{
	double getRoi(){
		return 8.4;
	}
}
class ICICI extends Bank{
	double getRoi(){
		return 7.3;
	}
}
class AXIS extends Bank{
	double getRoi(){
		return 9.7;
	}
	public static void main(String[] args){
		SBI a= new SBI();
		ICICI b=new ICICI();
		AXIS c=new AXIS();
		System.out.println("SBI: "+a.getRoi());
		System.out.println("ICICI: "+b.getRoi());
		System.out.println("AXIS: "+c.getRoi());
	}
}