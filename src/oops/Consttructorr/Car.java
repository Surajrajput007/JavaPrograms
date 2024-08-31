package oops.Consttructorr;

public class Car{

	String model;
	int year;
public Car(String model,int year) {
	this.model=model;
	this.year=year;
	
}
	public static void main(String[] args) {
		Car mycar = new Car("ferrari",2018);
		System.out.println(mycar.model);
		System.out.println(mycar.year);
	}
	}
	

